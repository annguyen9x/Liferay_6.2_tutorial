package com.annguyen.kyanhbooks;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class DanhMucSachPortlet
 */
public class DanhMucSachPortlet extends MVCPortlet {
	public void sendMaLoaiSach(ActionRequest actionRequest,
			ActionResponse actionResponse) {
		
		String maLoaiSach = ParamUtil.getString(actionRequest, "maLoaiSach");
		System.out.println("maLoaiSach: " + maLoaiSach);
		actionResponse.setRenderParameter("maLoaiSach", maLoaiSach);
		
	}

}
