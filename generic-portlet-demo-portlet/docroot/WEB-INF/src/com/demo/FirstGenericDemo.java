package com.demo;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;

/**
 * Portlet implementation class FirstGenericDemo
 */
public class FirstGenericDemo extends GenericPortlet {
	protected String viewTemplate;
	private static Log _log = LogFactoryUtil.getLog(FirstGenericDemo.class);
	    
    public void init() {
        viewTemplate = getInitParameter("view-template");
    }

    public void doView(RenderRequest renderRequest, RenderResponse renderResponse)throws IOException, PortletException {

        include(viewTemplate, renderRequest, renderResponse);
    }
    
    @Override
    public void processAction(ActionRequest request, ActionResponse response)
    		throws PortletException, IOException {
    	String name = (String) request.getParameter("name");
    	String name2 = ParamUtil.getString(request, "name");
    	System.out.println("Name: " + name);
    	System.out.println("Name2: " + name2);
    }
    
    protected void include(
            String path, RenderRequest renderRequest,
            RenderResponse renderResponse)
        throws IOException, PortletException {

        PortletRequestDispatcher portletRequestDispatcher =
            getPortletContext().getRequestDispatcher(path);

        if (portletRequestDispatcher == null) {
            _log.error(path + " is not a valid include");
        }
        else {
            portletRequestDispatcher.include(renderRequest, renderResponse);
        }
    }
}
