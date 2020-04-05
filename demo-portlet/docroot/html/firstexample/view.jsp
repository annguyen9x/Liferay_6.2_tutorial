<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>Liferay is Easy</b> portlet.


<portlet:renderURL var="varName">
</portlet:renderURL>
<br/>
<a href="<%=varName%>">Click for render URL</a>

<portlet:actionURL var="actionName" />
<br/>
<a href="<%=actionName%>">Click for action URL</a>

<portlet:resourceURL var="resourceName">
</portlet:resourceURL>
<br/>
<a href="<%=resourceName%>">Click for resource URL</a>