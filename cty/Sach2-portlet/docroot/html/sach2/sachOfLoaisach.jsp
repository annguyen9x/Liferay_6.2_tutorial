<%@ include file="/html/sach2/init.jsp"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%
String maLoaiSach = ParamUtil.getString(renderRequest, "maLoaiSach", null);
%>
Mã LS: <%=maLoaiSach  %>