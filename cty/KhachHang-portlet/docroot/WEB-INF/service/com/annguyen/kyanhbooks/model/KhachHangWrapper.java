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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link KhachHang}.
 * </p>
 *
 * @author AnNguyen
 * @see KhachHang
 * @generated
 */
public class KhachHangWrapper implements KhachHang, ModelWrapper<KhachHang> {
	public KhachHangWrapper(KhachHang khachHang) {
		_khachHang = khachHang;
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

	/**
	* Returns the primary key of this khach hang.
	*
	* @return the primary key of this khach hang
	*/
	@Override
	public int getPrimaryKey() {
		return _khachHang.getPrimaryKey();
	}

	/**
	* Sets the primary key of this khach hang.
	*
	* @param primaryKey the primary key of this khach hang
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_khachHang.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ma k h of this khach hang.
	*
	* @return the ma k h of this khach hang
	*/
	@Override
	public int getMaKH() {
		return _khachHang.getMaKH();
	}

	/**
	* Sets the ma k h of this khach hang.
	*
	* @param MaKH the ma k h of this khach hang
	*/
	@Override
	public void setMaKH(int MaKH) {
		_khachHang.setMaKH(MaKH);
	}

	/**
	* Returns the ten k h of this khach hang.
	*
	* @return the ten k h of this khach hang
	*/
	@Override
	public java.lang.String getTenKH() {
		return _khachHang.getTenKH();
	}

	/**
	* Sets the ten k h of this khach hang.
	*
	* @param TenKH the ten k h of this khach hang
	*/
	@Override
	public void setTenKH(java.lang.String TenKH) {
		_khachHang.setTenKH(TenKH);
	}

	/**
	* Returns the mat khau of this khach hang.
	*
	* @return the mat khau of this khach hang
	*/
	@Override
	public java.lang.String getMatKhau() {
		return _khachHang.getMatKhau();
	}

	/**
	* Sets the mat khau of this khach hang.
	*
	* @param MatKhau the mat khau of this khach hang
	*/
	@Override
	public void setMatKhau(java.lang.String MatKhau) {
		_khachHang.setMatKhau(MatKhau);
	}

	/**
	* Returns the email of this khach hang.
	*
	* @return the email of this khach hang
	*/
	@Override
	public java.lang.String getEmail() {
		return _khachHang.getEmail();
	}

	/**
	* Sets the email of this khach hang.
	*
	* @param Email the email of this khach hang
	*/
	@Override
	public void setEmail(java.lang.String Email) {
		_khachHang.setEmail(Email);
	}

	/**
	* Returns the dien thoai of this khach hang.
	*
	* @return the dien thoai of this khach hang
	*/
	@Override
	public java.lang.String getDienThoai() {
		return _khachHang.getDienThoai();
	}

	/**
	* Sets the dien thoai of this khach hang.
	*
	* @param DienThoai the dien thoai of this khach hang
	*/
	@Override
	public void setDienThoai(java.lang.String DienThoai) {
		_khachHang.setDienThoai(DienThoai);
	}

	/**
	* Returns the gioi tinh of this khach hang.
	*
	* @return the gioi tinh of this khach hang
	*/
	@Override
	public boolean getGioiTinh() {
		return _khachHang.getGioiTinh();
	}

	/**
	* Returns <code>true</code> if this khach hang is gioi tinh.
	*
	* @return <code>true</code> if this khach hang is gioi tinh; <code>false</code> otherwise
	*/
	@Override
	public boolean isGioiTinh() {
		return _khachHang.isGioiTinh();
	}

	/**
	* Sets whether this khach hang is gioi tinh.
	*
	* @param GioiTinh the gioi tinh of this khach hang
	*/
	@Override
	public void setGioiTinh(boolean GioiTinh) {
		_khachHang.setGioiTinh(GioiTinh);
	}

	/**
	* Returns the ngay sinh of this khach hang.
	*
	* @return the ngay sinh of this khach hang
	*/
	@Override
	public java.util.Date getNgaySinh() {
		return _khachHang.getNgaySinh();
	}

	/**
	* Sets the ngay sinh of this khach hang.
	*
	* @param NgaySinh the ngay sinh of this khach hang
	*/
	@Override
	public void setNgaySinh(java.util.Date NgaySinh) {
		_khachHang.setNgaySinh(NgaySinh);
	}

	/**
	* Returns the dia chi of this khach hang.
	*
	* @return the dia chi of this khach hang
	*/
	@Override
	public java.lang.String getDiaChi() {
		return _khachHang.getDiaChi();
	}

	/**
	* Sets the dia chi of this khach hang.
	*
	* @param DiaChi  the dia chi of this khach hang
	*/
	@Override
	public void setDiaChi(java.lang.String DiaChi) {
		_khachHang.setDiaChi(DiaChi);
	}

	@Override
	public boolean isNew() {
		return _khachHang.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_khachHang.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _khachHang.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_khachHang.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _khachHang.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _khachHang.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_khachHang.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _khachHang.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_khachHang.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_khachHang.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_khachHang.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new KhachHangWrapper((KhachHang)_khachHang.clone());
	}

	@Override
	public int compareTo(com.annguyen.kyanhbooks.model.KhachHang khachHang) {
		return _khachHang.compareTo(khachHang);
	}

	@Override
	public int hashCode() {
		return _khachHang.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.annguyen.kyanhbooks.model.KhachHang> toCacheModel() {
		return _khachHang.toCacheModel();
	}

	@Override
	public com.annguyen.kyanhbooks.model.KhachHang toEscapedModel() {
		return new KhachHangWrapper(_khachHang.toEscapedModel());
	}

	@Override
	public com.annguyen.kyanhbooks.model.KhachHang toUnescapedModel() {
		return new KhachHangWrapper(_khachHang.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _khachHang.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _khachHang.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_khachHang.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KhachHangWrapper)) {
			return false;
		}

		KhachHangWrapper khachHangWrapper = (KhachHangWrapper)obj;

		if (Validator.equals(_khachHang, khachHangWrapper._khachHang)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public KhachHang getWrappedKhachHang() {
		return _khachHang;
	}

	@Override
	public KhachHang getWrappedModel() {
		return _khachHang;
	}

	@Override
	public void resetOriginalValues() {
		_khachHang.resetOriginalValues();
	}

	private KhachHang _khachHang;
}