<%@include file="/html/danhmucsach/init.jsp"%>

<%
	PortletURL portletURL = renderResponse.createRenderURL();
	
	String portletURLString = portletURL.toString();
	LoaiSachSearchContainer loaiSachSearchContainer = new LoaiSachSearchContainer(renderRequest, portletURL);
	LoaiSachDisplayTerms displayTerms = (LoaiSachDisplayTerms)loaiSachSearchContainer.getDisplayTerms();
%>

<aui:form action="<%= portletURLString %>" method="post" name="fm">
	<liferay-ui:search-container searchContainer="<%=loaiSachSearchContainer %>" >
		<liferay-ui:search-container-results
			results="<%= LoaiSachLocalServiceUtil.getLoaiSachs(searchContainer.getStart(), searchContainer.getEnd())%>"
			total="<%= LoaiSachLocalServiceUtil.getLoaiSachsCount()%>"
		/>
	
		<liferay-ui:search-container-row className="com.annguyen.kyanhbooks.model.LoaiSach"
			modelVar="loaiSach"	>
			<portlet:actionURL var="sendMaLoaiSachURL" name="sendMaLoaiSach">
				<portlet:param name="maLoaiSach" value="<%=loaiSach.getMaLoaiSach() %>"/>
			</portlet:actionURL>
			<liferay-ui:search-container-column-text property="tenLoaiSach" href="<%=sendMaLoaiSachURL %>" >
			</liferay-ui:search-container-column-text>
	
		</liferay-ui:search-container-row>
	
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
</aui:form>