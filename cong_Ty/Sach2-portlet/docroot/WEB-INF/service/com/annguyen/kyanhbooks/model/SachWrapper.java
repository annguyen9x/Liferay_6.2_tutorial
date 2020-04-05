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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Sach}.
 * </p>
 *
 * @author AnNguyen
 * @see Sach
 * @generated
 */
public class SachWrapper implements Sach, ModelWrapper<Sach> {
	public SachWrapper(Sach sach) {
		_sach = sach;
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

	/**
	* Returns the primary key of this sach.
	*
	* @return the primary key of this sach
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _sach.getPrimaryKey();
	}

	/**
	* Sets the primary key of this sach.
	*
	* @param primaryKey the primary key of this sach
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_sach.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ma sach of this sach.
	*
	* @return the ma sach of this sach
	*/
	@Override
	public java.lang.String getMaSach() {
		return _sach.getMaSach();
	}

	/**
	* Sets the ma sach of this sach.
	*
	* @param MaSach the ma sach of this sach
	*/
	@Override
	public void setMaSach(java.lang.String MaSach) {
		_sach.setMaSach(MaSach);
	}

	/**
	* Returns the ten sach of this sach.
	*
	* @return the ten sach of this sach
	*/
	@Override
	public java.lang.String getTenSach() {
		return _sach.getTenSach();
	}

	/**
	* Sets the ten sach of this sach.
	*
	* @param TenSach the ten sach of this sach
	*/
	@Override
	public void setTenSach(java.lang.String TenSach) {
		_sach.setTenSach(TenSach);
	}

	/**
	* Returns the don gia of this sach.
	*
	* @return the don gia of this sach
	*/
	@Override
	public float getDonGia() {
		return _sach.getDonGia();
	}

	/**
	* Sets the don gia of this sach.
	*
	* @param DonGia the don gia of this sach
	*/
	@Override
	public void setDonGia(float DonGia) {
		_sach.setDonGia(DonGia);
	}

	/**
	* Returns the so luong of this sach.
	*
	* @return the so luong of this sach
	*/
	@Override
	public int getSoLuong() {
		return _sach.getSoLuong();
	}

	/**
	* Sets the so luong of this sach.
	*
	* @param SoLuong the so luong of this sach
	*/
	@Override
	public void setSoLuong(int SoLuong) {
		_sach.setSoLuong(SoLuong);
	}

	/**
	* Returns the url hinh of this sach.
	*
	* @return the url hinh of this sach
	*/
	@Override
	public java.lang.String getUrlHinh() {
		return _sach.getUrlHinh();
	}

	/**
	* Sets the url hinh of this sach.
	*
	* @param UrlHinh the url hinh of this sach
	*/
	@Override
	public void setUrlHinh(java.lang.String UrlHinh) {
		_sach.setUrlHinh(UrlHinh);
	}

	/**
	* Returns the noi dung of this sach.
	*
	* @return the noi dung of this sach
	*/
	@Override
	public java.lang.String getNoiDung() {
		return _sach.getNoiDung();
	}

	/**
	* Sets the noi dung of this sach.
	*
	* @param NoiDung the noi dung of this sach
	*/
	@Override
	public void setNoiDung(java.lang.String NoiDung) {
		_sach.setNoiDung(NoiDung);
	}

	/**
	* Returns the tac gia of this sach.
	*
	* @return the tac gia of this sach
	*/
	@Override
	public java.lang.String getTacGia() {
		return _sach.getTacGia();
	}

	/**
	* Sets the tac gia of this sach.
	*
	* @param TacGia the tac gia of this sach
	*/
	@Override
	public void setTacGia(java.lang.String TacGia) {
		_sach.setTacGia(TacGia);
	}

	/**
	* Returns the nam x b of this sach.
	*
	* @return the nam x b of this sach
	*/
	@Override
	public int getNamXB() {
		return _sach.getNamXB();
	}

	/**
	* Sets the nam x b of this sach.
	*
	* @param NamXB the nam x b of this sach
	*/
	@Override
	public void setNamXB(int NamXB) {
		_sach.setNamXB(NamXB);
	}

	/**
	* Returns the n x b of this sach.
	*
	* @return the n x b of this sach
	*/
	@Override
	public java.lang.String getNXB() {
		return _sach.getNXB();
	}

	/**
	* Sets the n x b of this sach.
	*
	* @param NXB the n x b of this sach
	*/
	@Override
	public void setNXB(java.lang.String NXB) {
		_sach.setNXB(NXB);
	}

	/**
	* Returns the ma loai sach of this sach.
	*
	* @return the ma loai sach of this sach
	*/
	@Override
	public java.lang.String getMaLoaiSach() {
		return _sach.getMaLoaiSach();
	}

	/**
	* Sets the ma loai sach of this sach.
	*
	* @param MaLoaiSach the ma loai sach of this sach
	*/
	@Override
	public void setMaLoaiSach(java.lang.String MaLoaiSach) {
		_sach.setMaLoaiSach(MaLoaiSach);
	}

	@Override
	public boolean isNew() {
		return _sach.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_sach.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _sach.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_sach.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _sach.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _sach.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sach.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sach.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_sach.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_sach.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sach.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SachWrapper((Sach)_sach.clone());
	}

	@Override
	public int compareTo(com.annguyen.kyanhbooks.model.Sach sach) {
		return _sach.compareTo(sach);
	}

	@Override
	public int hashCode() {
		return _sach.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.annguyen.kyanhbooks.model.Sach> toCacheModel() {
		return _sach.toCacheModel();
	}

	@Override
	public com.annguyen.kyanhbooks.model.Sach toEscapedModel() {
		return new SachWrapper(_sach.toEscapedModel());
	}

	@Override
	public com.annguyen.kyanhbooks.model.Sach toUnescapedModel() {
		return new SachWrapper(_sach.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sach.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _sach.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sach.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SachWrapper)) {
			return false;
		}

		SachWrapper sachWrapper = (SachWrapper)obj;

		if (Validator.equals(_sach, sachWrapper._sach)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Sach getWrappedSach() {
		return _sach;
	}

	@Override
	public Sach getWrappedModel() {
		return _sach;
	}

	@Override
	public void resetOriginalValues() {
		_sach.resetOriginalValues();
	}

	private Sach _sach;
}