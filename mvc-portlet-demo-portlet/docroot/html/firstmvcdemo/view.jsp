<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<portlet:actionURL var="myAction" name="MyActionMethod">
</portlet:actionURL>

<portlet:renderURL var="myRenderURL">
	<%-- <portlet:param name="mvcPath" value="/html/firstmvcdemo/greeting.jsp"/> --%>
	<portlet:param name="jspPage" value="/html/firstmvcdemo/greeting.jsp"/>
</portlet:renderURL>

<b>First MVC Portlet Demo</b>
<br/>
<b>Hello: <%if(renderRequest.getParameter("name") != null ){out.print(renderRequest.getParameter("name"));} %></b>

<form action="${myAction }" method="post">
	Name: <input type="text" name="name" /> 
	<input type="submit" value="SUBMIT" />
</form>

<a href="${myRenderURL}" >Click for Render</a>
