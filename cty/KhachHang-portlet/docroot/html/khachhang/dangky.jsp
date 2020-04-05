<%@include file="/html/khachhang/init.jsp"%>


<portlet:actionURL name="dangKy" var="dangKyURL" />

<aui:form method="post" action="<%=dangKyURL%>" name="fm">
	<aui:row>
		<aui:col span="6">
			<aui:input name="makh" label="Ma KH">
				<aui:validator name="required" errorMessage="Khong duoc rong"></aui:validator>
				<aui:validator name="number"></aui:validator>
			</aui:input>
		</aui:col>

		<aui:col span="6">
			<aui:input name="tenkh" label="Ten KH">
				<aui:validator name="required"></aui:validator>
				<aui:validator name="alpha"></aui:validator>
			</aui:input>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col span="6">
			<aui:input name="matkhau" label="Mat Khau">
				<aui:validator name="required" errorMessage="Khong duoc rong"></aui:validator>
				<aui:validator name="alphanum"></aui:validator>
			</aui:input>
		</aui:col>

		<aui:col span="6">
			<aui:input name="email" label="Email">
				<aui:validator name="required"></aui:validator>
				<aui:validator name="email"></aui:validator>
			</aui:input>
		</aui:col>
	</aui:row>

	<aui:row>
		<aui:col span="6">
			<aui:input name="dienthoai" laber="Dien Thoai">
			<aui:validator name="number"></aui:validator>
			<aui:validator name="minLength">10</aui:validator>
			</aui:input>
		</aui:col>
		<aui:col span="6">
			<input name="gioitinh" type="radio" value="1" checked="true" />Nam<br/>
			<input name="gioitinh" type="radio" value="0" />Nu<br/>
		</aui:col>
	</aui:row>

	<aui:row>
		<aui:col span="6">
			<aui:input name="ngaysinh" laber="Ngay Sinh">
				<aui:validator name="date"></aui:validator>
			</aui:input>
		</aui:col>
		<aui:col span="6">
			<aui:input name="diachi" laber="Dia Chi">
				<aui:validator name="required"></aui:validator>
			</aui:input>
		</aui:col>
	</aui:row>

	<aui:button type="submit"></aui:button>
</aui:form>