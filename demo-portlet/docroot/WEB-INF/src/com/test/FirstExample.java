package com.test;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * Portlet implementation class FirstExample
 */
public class FirstExample extends GenericPortlet {
	protected String viewTemplate;

	private static Log _log = LogFactoryUtil.getLog(FirstExample.class);

	public void init() {
		System.out
				.println("=================Inside init method=================");
		viewTemplate = getInitParameter("view-template");
	}

	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		System.out.println("=================Inside doView=================");
		include(viewTemplate, renderRequest, renderResponse);
	}

	@Override
	public void processAction(ActionRequest arg0, ActionResponse arg1)
			throws PortletException, IOException {
		System.out.println("=================Inside Action=================");
	}

	@Override
	public void serveResource(ResourceRequest arg0, ResourceResponse arg1)
			throws PortletException, IOException {
		System.out.println("=================Inside Serve Resource=================");
	}

	@Override
	public void destroy() {
		System.out.println("=================Inside Destroy=================");
	}

	protected void include(String path, RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {

		PortletRequestDispatcher portletRequestDispatcher = getPortletContext()
				.getRequestDispatcher(path);

		if (portletRequestDispatcher == null) {
			_log.error(path + " is not a valid include");
		} else {
			portletRequestDispatcher.include(renderRequest, renderResponse);
		}
	}

}
