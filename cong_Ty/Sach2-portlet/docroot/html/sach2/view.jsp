<%@page import="com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletClassLoaderUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactory"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="com.annguyen.kyanhbooks.service.SachServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.NumberFormat"%>
<%@ include file="/html/sach2/init.jsp"%>
<%@page import="com.annguyen.kyanhbooks.service.SachLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.annguyen.kyanhbooks.model.Sach"%>
<%
	NumberFormat numberFormat = new DecimalFormat("###,###,###");
%>
<%
String maLoaiSach = ParamUtil.getString(renderRequest, "maLoaiSach", null);
List<Sach> sachList = null;
%>
<%
if(maLoaiSach != null ){
	DynamicQuery dynamicQuery1 = DynamicQueryFactoryUtil.forClass(Sach.class, PortletClassLoaderUtil.getClassLoader());
	dynamicQuery1.add(PropertyFactoryUtil.forName("MaLoaiSach").eq(new String(maLoaiSach)));
	sachList = SachLocalServiceUtil.dynamicQuery(dynamicQuery1);
}else{
	sachList = SachLocalServiceUtil.getSachs(0,
			SachLocalServiceUtil.getSachsCount());
	Sach selecteStudentObject = (Sach) renderRequest
			.getAttribute("sachObject");
}
%>

<div class="container-fluid">
	<%
		for (Sach sach : sachList) {
	%>
	<div class="group_sp span3">
		<a href="">
			<div class="anh_sp">
				<img class="anh"
					src="<%=application.getContextPath()%>/images/user/sanpham/<%=sach.getUrlHinh()%>"
					title="sp" alt="anhsp">
			</div>
			<div class="tensp_giasp">
				<div class="tensp">
					<a href="/SachKyAnh/ChiTietSach?MaSach=<%=sach.getMaSach()%>"
						class="text-a"> <%=sach.getTenSach()%>
					</a>
				</div>
				<div class="giasp"><% numberFormat.format(sach.getDonGia()); %> vnd</div>
			</div>
		</a>
	</div>
	<%
		}
	%>
</div>
