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
import com.annguyen.kyanhbooks.service.SachLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author AnNguyen
 */
public class SachClp extends BaseModelImpl<Sach> implements Sach {
	public SachClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Sach.class;
	}

	@Override
	public String getModelClassName() {
		return Sach.class.getName();
	}

	@Override
	public String getPrimaryKey() {
		return _MaSach;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setMaSach(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _MaSach;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("MaSach", getMaSach());
		attributes.put("TenSach", getTenSach());
		attributes.put("DonGia", getDonGia());
		attributes.put("SoLuong", getSoLuong());
		attributes.put("UrlHinh", getUrlHinh());
		attributes.put("NoiDung", getNoiDung());
		attributes.put("TacGia", getTacGia());
		attributes.put("NamXB", getNamXB());
		attributes.put("NXB", getNXB());
		attributes.put("MaLoaiSach", getMaLoaiSach());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String MaSach = (String)attributes.get("MaSach");

		if (MaSach != null) {
			setMaSach(MaSach);
		}

		String TenSach = (String)attributes.get("TenSach");

		if (TenSach != null) {
			setTenSach(TenSach);
		}

		Float DonGia = (Float)attributes.get("DonGia");

		if (DonGia != null) {
			setDonGia(DonGia);
		}

		Integer SoLuong = (Integer)attributes.get("SoLuong");

		if (SoLuong != null) {
			setSoLuong(SoLuong);
		}

		String UrlHinh = (String)attributes.get("UrlHinh");

		if (UrlHinh != null) {
			setUrlHinh(UrlHinh);
		}

		String NoiDung = (String)attributes.get("NoiDung");

		if (NoiDung != null) {
			setNoiDung(NoiDung);
		}

		String TacGia = (String)attributes.get("TacGia");

		if (TacGia != null) {
			setTacGia(TacGia);
		}

		Integer NamXB = (Integer)attributes.get("NamXB");

		if (NamXB != null) {
			setNamXB(NamXB);
		}

		String NXB = (String)attributes.get("NXB");

		if (NXB != null) {
			setNXB(NXB);
		}

		String MaLoaiSach = (String)attributes.get("MaLoaiSach");

		if (MaLoaiSach != null) {
			setMaLoaiSach(MaLoaiSach);
		}
	}

	@Override
	public String getMaSach() {
		return _MaSach;
	}

	@Override
	public void setMaSach(String MaSach) {
		_MaSach = MaSach;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setMaSach", String.class);

				method.invoke(_sachRemoteModel, MaSach);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenSach() {
		return _TenSach;
	}

	@Override
	public void setTenSach(String TenSach) {
		_TenSach = TenSach;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setTenSach", String.class);

				method.invoke(_sachRemoteModel, TenSach);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public float getDonGia() {
		return _DonGia;
	}

	@Override
	public void setDonGia(float DonGia) {
		_DonGia = DonGia;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setDonGia", float.class);

				method.invoke(_sachRemoteModel, DonGia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoLuong() {
		return _SoLuong;
	}

	@Override
	public void setSoLuong(int SoLuong) {
		_SoLuong = SoLuong;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLuong", int.class);

				method.invoke(_sachRemoteModel, SoLuong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUrlHinh() {
		return _UrlHinh;
	}

	@Override
	public void setUrlHinh(String UrlHinh) {
		_UrlHinh = UrlHinh;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setUrlHinh", String.class);

				method.invoke(_sachRemoteModel, UrlHinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoiDung() {
		return _NoiDung;
	}

	@Override
	public void setNoiDung(String NoiDung) {
		_NoiDung = NoiDung;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiDung", String.class);

				method.invoke(_sachRemoteModel, NoiDung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTacGia() {
		return _TacGia;
	}

	@Override
	public void setTacGia(String TacGia) {
		_TacGia = TacGia;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setTacGia", String.class);

				method.invoke(_sachRemoteModel, TacGia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNamXB() {
		return _NamXB;
	}

	@Override
	public void setNamXB(int NamXB) {
		_NamXB = NamXB;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setNamXB", int.class);

				method.invoke(_sachRemoteModel, NamXB);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNXB() {
		return _NXB;
	}

	@Override
	public void setNXB(String NXB) {
		_NXB = NXB;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setNXB", String.class);

				method.invoke(_sachRemoteModel, NXB);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaLoaiSach() {
		return _MaLoaiSach;
	}

	@Override
	public void setMaLoaiSach(String MaLoaiSach) {
		_MaLoaiSach = MaLoaiSach;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setMaLoaiSach", String.class);

				method.invoke(_sachRemoteModel, MaLoaiSach);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getSachRemoteModel() {
		return _sachRemoteModel;
	}

	public void setSachRemoteModel(BaseModel<?> sachRemoteModel) {
		_sachRemoteModel = sachRemoteModel;
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

		Class<?> remoteModelClass = _sachRemoteModel.getClass();

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

		Object returnValue = method.invoke(_sachRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			SachLocalServiceUtil.addSach(this);
		}
		else {
			SachLocalServiceUtil.updateSach(this);
		}
	}

	@Override
	public Sach toEscapedModel() {
		return (Sach)ProxyUtil.newProxyInstance(Sach.class.getClassLoader(),
			new Class[] { Sach.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SachClp clone = new SachClp();

		clone.setMaSach(getMaSach());
		clone.setTenSach(getTenSach());
		clone.setDonGia(getDonGia());
		clone.setSoLuong(getSoLuong());
		clone.setUrlHinh(getUrlHinh());
		clone.setNoiDung(getNoiDung());
		clone.setTacGia(getTacGia());
		clone.setNamXB(getNamXB());
		clone.setNXB(getNXB());
		clone.setMaLoaiSach(getMaLoaiSach());

		return clone;
	}

	@Override
	public int compareTo(Sach sach) {
		int value = 0;

		value = getTenSach().compareTo(sach.getTenSach());

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

		if (!(obj instanceof SachClp)) {
			return false;
		}

		SachClp sach = (SachClp)obj;

		String primaryKey = sach.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
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
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{MaSach=");
		sb.append(getMaSach());
		sb.append(", TenSach=");
		sb.append(getTenSach());
		sb.append(", DonGia=");
		sb.append(getDonGia());
		sb.append(", SoLuong=");
		sb.append(getSoLuong());
		sb.append(", UrlHinh=");
		sb.append(getUrlHinh());
		sb.append(", NoiDung=");
		sb.append(getNoiDung());
		sb.append(", TacGia=");
		sb.append(getTacGia());
		sb.append(", NamXB=");
		sb.append(getNamXB());
		sb.append(", NXB=");
		sb.append(getNXB());
		sb.append(", MaLoaiSach=");
		sb.append(getMaLoaiSach());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.annguyen.kyanhbooks.model.Sach");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>MaSach</column-name><column-value><![CDATA[");
		sb.append(getMaSach());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenSach</column-name><column-value><![CDATA[");
		sb.append(getTenSach());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DonGia</column-name><column-value><![CDATA[");
		sb.append(getDonGia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SoLuong</column-name><column-value><![CDATA[");
		sb.append(getSoLuong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UrlHinh</column-name><column-value><![CDATA[");
		sb.append(getUrlHinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NoiDung</column-name><column-value><![CDATA[");
		sb.append(getNoiDung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TacGia</column-name><column-value><![CDATA[");
		sb.append(getTacGia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NamXB</column-name><column-value><![CDATA[");
		sb.append(getNamXB());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NXB</column-name><column-value><![CDATA[");
		sb.append(getNXB());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaLoaiSach</column-name><column-value><![CDATA[");
		sb.append(getMaLoaiSach());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _MaSach;
	private String _TenSach;
	private float _DonGia;
	private int _SoLuong;
	private String _UrlHinh;
	private String _NoiDung;
	private String _TacGia;
	private int _NamXB;
	private String _NXB;
	private String _MaLoaiSach;
	private BaseModel<?> _sachRemoteModel;
	private Class<?> _clpSerializerClass = com.annguyen.kyanhbooks.service.ClpSerializer.class;
}