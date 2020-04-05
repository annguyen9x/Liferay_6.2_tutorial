/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.annguyen.kyanhbooks.model;

import com.annguyen.kyanhbooks.service.ClpSerializer;
import com.annguyen.kyanhbooks.service.KhachHangLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author AnNguyen
 */
public class KhachHangClp extends BaseModelImpl<KhachHang> implements KhachHang {
	public KhachHangClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return KhachHang.class;
	}

	@Override
	public String getModelClassName() {
		return KhachHang.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _MaKH;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setMaKH(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _MaKH;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("MaKH", getMaKH());
		attributes.put("TenKH", getTenKH());
		attributes.put("MatKhau", getMatKhau());
		attributes.put("Email", getEmail());
		attributes.put("DienThoai", getDienThoai());
		attributes.put("GioiTinh", getGioiTinh());
		attributes.put("NgaySinh", getNgaySinh());
		attributes.put("DiaChi ", getDiaChi());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer MaKH = (Integer)attributes.get("MaKH");

		if (MaKH != null) {
			setMaKH(MaKH);
		}

		String TenKH = (String)attributes.get("TenKH");

		if (TenKH != null) {
			setTenKH(TenKH);
		}

		String MatKhau = (String)attributes.get("MatKhau");

		if (MatKhau != null) {
			setMatKhau(MatKhau);
		}

		String Email = (String)attributes.get("Email");

		if (Email != null) {
			setEmail(Email);
		}

		String DienThoai = (String)attributes.get("DienThoai");

		if (DienThoai != null) {
			setDienThoai(DienThoai);
		}

		Boolean GioiTinh = (Boolean)attributes.get("GioiTinh");

		if (GioiTinh != null) {
			setGioiTinh(GioiTinh);
		}

		Date NgaySinh = (Date)attributes.get("NgaySinh");

		if (NgaySinh != null) {
			setNgaySinh(NgaySinh);
		}

		String DiaChi = (String)attributes.get("DiaChi ");

		if (DiaChi != null) {
			setDiaChi(DiaChi);
		}
	}

	@Override
	public int getMaKH() {
		return _MaKH;
	}

	@Override
	public void setMaKH(int MaKH) {
		_MaKH = MaKH;

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setMaKH", int.class);

				method.invoke(_khachHangRemoteModel, MaKH);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenKH() {
		return _TenKH;
	}

	@Override
	public void setTenKH(String TenKH) {
		_TenKH = TenKH;

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setTenKH", String.class);

				method.invoke(_khachHangRemoteModel, TenKH);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMatKhau() {
		return _MatKhau;
	}

	@Override
	public void setMatKhau(String MatKhau) {
		_MatKhau = MatKhau;

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setMatKhau", String.class);

				method.invoke(_khachHangRemoteModel, MatKhau);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _Email;
	}

	@Override
	public void setEmail(String Email) {
		_Email = Email;

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_khachHangRemoteModel, Email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDienThoai() {
		return _DienThoai;
	}

	@Override
	public void setDienThoai(String DienThoai) {
		_DienThoai = DienThoai;

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setDienThoai", String.class);

				method.invoke(_khachHangRemoteModel, DienThoai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getGioiTinh() {
		return _GioiTinh;
	}

	@Override
	public boolean isGioiTinh() {
		return _GioiTinh;
	}

	@Override
	public void setGioiTinh(boolean GioiTinh) {
		_GioiTinh = GioiTinh;

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setGioiTinh", boolean.class);

				method.invoke(_khachHangRemoteModel, GioiTinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgaySinh() {
		return _NgaySinh;
	}

	@Override
	public void setNgaySinh(Date NgaySinh) {
		_NgaySinh = NgaySinh;

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setNgaySinh", Date.class);

				method.invoke(_khachHangRemoteModel, NgaySinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiaChi() {
		return _DiaChi;
	}

	@Override
	public void setDiaChi(String DiaChi) {
		_DiaChi = DiaChi;

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChi", String.class);

				method.invoke(_khachHangRemoteModel, DiaChi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getKhachHangRemoteModel() {
		return _khachHangRemoteModel;
	}

	public void setKhachHangRemoteModel(BaseModel<?> khachHangRemoteModel) {
		_khachHangRemoteModel = khachHangRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _khachHangRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_khachHangRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			KhachHangLocalServiceUtil.addKhachHang(this);
		}
		else {
			KhachHangLocalServiceUtil.updateKhachHang(this);
		}
	}

	@Override
	public KhachHang toEscapedModel() {
		return (KhachHang)ProxyUtil.newProxyInstance(KhachHang.class.getClassLoader(),
			new Class[] { KhachHang.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		KhachHangClp clone = new KhachHangClp();

		clone.setMaKH(getMaKH());
		clone.setTenKH(getTenKH());
		clone.setMatKhau(getMatKhau());
		clone.setEmail(getEmail());
		clone.setDienThoai(getDienThoai());
		clone.setGioiTinh(getGioiTinh());
		clone.setNgaySinh(getNgaySinh());
		clone.setDiaChi(getDiaChi());

		return clone;
	}

	@Override
	public int compareTo(KhachHang khachHang) {
		int value = 0;

		value = getTenKH().compareTo(khachHang.getTenKH());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KhachHangClp)) {
			return false;
		}

		KhachHangClp khachHang = (KhachHangClp)obj;

		int primaryKey = khachHang.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{MaKH=");
		sb.append(getMaKH());
		sb.append(", TenKH=");
		sb.append(getTenKH());
		sb.append(", MatKhau=");
		sb.append(getMatKhau());
		sb.append(", Email=");
		sb.append(getEmail());
		sb.append(", DienThoai=");
		sb.append(getDienThoai());
		sb.append(", GioiTinh=");
		sb.append(getGioiTinh());
		sb.append(", NgaySinh=");
		sb.append(getNgaySinh());
		sb.append(", DiaChi =");
		sb.append(getDiaChi());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.annguyen.kyanhbooks.model.KhachHang");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>MaKH</column-name><column-value><![CDATA[");
		sb.append(getMaKH());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenKH</column-name><column-value><![CDATA[");
		sb.append(getTenKH());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MatKhau</column-name><column-value><![CDATA[");
		sb.append(getMatKhau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DienThoai</column-name><column-value><![CDATA[");
		sb.append(getDienThoai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>GioiTinh</column-name><column-value><![CDATA[");
		sb.append(getGioiTinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgaySinh</column-name><column-value><![CDATA[");
		sb.append(getNgaySinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DiaChi </column-name><column-value><![CDATA[");
		sb.append(getDiaChi());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _MaKH;
	private String _TenKH;
	private String _MatKhau;
	private String _Email;
	private String _DienThoai;
	private boolean _GioiTinh;
	private Date _NgaySinh;
	private String _DiaChi;
	private BaseModel<?> _khachHangRemoteModel;
	private Class<?> _clpSerializerClass = com.annguyen.kyanhbooks.service.ClpSerializer.class;
}