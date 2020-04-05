package com.test;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class MultiActionPortlet
 */
public class MultiActionPortlet extends MVCPortlet {
	public void editName(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {

		String name = ParamUtil.getString(actionRequest, "name");

		String message = "";
		if (name == null || name.isEmpty()) {

			message = "Hello World";
		} else {

			message = "Hello " + name;
		}
		System.out.println("Controller");
		actionResponse.setRenderParameter("message", message);
	}

	public void sendEmail(ActionRequest actionRequest,
			ActionResponse actionResponse) {
		String email = ParamUtil.getString(actionRequest, "email");

		String subject = ParamUtil.getString(actionRequest, "subject");

		String content = ParamUtil.getString(actionRequest, "content");

		System.out.println("Sending to " + email);
		System.out.println("Subject: " + subject);
		System.out.println("Content: " + content);
	}

}
