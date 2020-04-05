package com.annguyen.kyanhbooks;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.annguyen.kyanhbooks.model.KhachHang;
import com.annguyen.kyanhbooks.model.impl.KhachHangImpl;
import com.annguyen.kyanhbooks.service.KhachHangLocalService;
import com.annguyen.kyanhbooks.service.KhachHangLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class KhachHangPortlet
 */
public class KhachHangPortlet extends MVCPortlet {
	private static Log _log = LogFactoryUtil.getLog(KhachHangPortlet.class);

	public void dangKy(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		try {
//			int makh = ParamUtil.getInteger(actionRequest, "makh");
			String tenkh = ParamUtil.getString(actionRequest, "tenkh");
			String matkhau = ParamUtil.getString(actionRequest, "matkhau");
			String email = ParamUtil.getString(actionRequest, "email");
			String dienthoai = ParamUtil.getString(actionRequest, "dienthoai");
			boolean gioitinh = ParamUtil.getInteger(actionRequest, "gioitinh") == 1 ? true
					: false;
			String diachi = ParamUtil.getString(actionRequest, "diachi");
			Date ngaysinh = ParamUtil.getDate(actionRequest, "ngaysinh", null);
			System.out.println("adadasff");
			int makh = (int) CounterLocalServiceUtil.increment();
			System.out.println("makh: " +makh+ "tenkh: " + tenkh);
			KhachHang kh = new KhachHangImpl();
			System.out.println("1111");
			kh = KhachHangLocalServiceUtil.createKhachHang(makh);

			kh.setMaKH(makh);
			kh.setTenKH(tenkh);
			kh.setMatKhau(matkhau);
			kh.setEmail(email);
			kh.setDienThoai(dienthoai);
			kh.setGioiTinh(gioitinh);
			kh.setNgaySinh(ngaysinh);
			kh.setDiaChi(diachi);
			System.out.println("makh: " +makh+ "tenkh: " + tenkh);

			/*kh = KhachHangLocalServiceUtil.addKhachHang(kh);
			if (kh != null) {
				SessionMessages.add(actionRequest.getPortletSession(),
						"khachhang-add-success !");
				_log.info("KhachHang have been added successfylly");
			}
			else{
				SessionErrors.add(actionRequest.getPortletSession(),
						"khachhang-add-error !");
				_log.info("There is an error in adding KhachHang");
			}
			
			actionResponse.setRenderParameter("mvcPath", "/html/khachhang/dangnhap.jsp");*/
		} catch (SystemException e) {
			SessionErrors.add(actionRequest.getPortletSession(),
					"khachhang-add-error");
			e.printStackTrace();
		}

	}

}
