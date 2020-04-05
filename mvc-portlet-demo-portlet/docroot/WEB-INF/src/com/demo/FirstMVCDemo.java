package com.demo;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class FirstMVCDemo
 */
public class FirstMVCDemo extends MVCPortlet {
 
		@ProcessAction(name="MyActionMethod")
	    public void MyActionMethod(ActionRequest request, ActionResponse response)
	    		throws PortletException, IOException {
	    	String name = ParamUtil.getString(request, "name");
	    	System.out.println("Name: " + name);
	    	PortalUtil.copyRequestParameters(request, response);//Tuong duong: response.setRenderParameter("name", name);
	    	//response.setRenderParameter("name", name);
	    	//response.setRenderParameter("jspPage", "/html/firstmvcdemo/greeting.jsp");
	    	response.setRenderParameter("mvcPath", "/html/firstmvcdemo/view.jsp");
	    }
}
