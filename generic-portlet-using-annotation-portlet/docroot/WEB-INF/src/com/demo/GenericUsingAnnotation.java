package com.demo;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.ProcessAction;
import javax.portlet.RenderMode;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;

/**
 * Portlet implementation class GenericUsingAnnotation
 */
public class GenericUsingAnnotation extends GenericPortlet {
	protected String viewTemplate;
	private static Log _log = LogFactoryUtil.getLog(GenericUsingAnnotation.class);
	    
    public void init() {
        viewTemplate = getInitParameter("view-template");
    }

    @RenderMode(name="VIEW")
    public void doView(RenderRequest renderRequest, RenderResponse renderResponse)throws IOException, PortletException {
    	String redirect = ParamUtil.getString(renderRequest, "redirect");
    	if(redirect.equalsIgnoreCase("greeting")){
    		include("/html/genericusingannotation/greeting.jsp", renderRequest, renderResponse);
    	}else{
    		include(viewTemplate, renderRequest, renderResponse);//Trang "view.jsp"
    	}
    }
    
    @ProcessAction(name="MyActionMethod")
    public void myActionMethod(ActionRequest request, ActionResponse response)
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
