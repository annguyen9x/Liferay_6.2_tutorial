<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<portlet:defineObjects />

<portlet:renderURL var="dangkyURL">
	<portlet:param name="mvcPath" value="/html/khachhang/dangky.jsp" />
</portlet:renderURL>

<portlet:renderURL var="dangNhap">
	<portlet:param name="mvcPath" value="/html/khachhang/dangnhap.jsp" />
</portlet:renderURL>

<a href="<%=dangkyURL%>">
Dang ky
</a>

<a href="<%=dangNhap%>">
Dang nhap
</a>
