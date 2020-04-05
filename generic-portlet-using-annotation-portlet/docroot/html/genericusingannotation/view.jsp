<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<portlet:defineObjects />

<portlet:actionURL var="myAction" name="MyActionMethod">
</portlet:actionURL>
<portlet:renderURL var="myRenderURL">
	<portlet:param name="redirect" value="greeting" />
</portlet:renderURL>

<b>Generic Using Annotation</b>

<form action="${myAction }" method="post">
	Name: <input type="text" name="name" /> 
	<input type="submit" value="SUBMIT" />
</form>

<a href="${myRenderURL}">Click for Render</a>
