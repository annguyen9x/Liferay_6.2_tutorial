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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.annguyen.kyanhbooks.service.http.KhachHangServiceSoap}.
 *
 * @author AnNguyen
 * @see com.annguyen.kyanhbooks.service.http.KhachHangServiceSoap
 * @generated
 */
public class KhachHangSoap implements Serializable {
	public static KhachHangSoap toSoapModel(KhachHang model) {
		KhachHangSoap soapModel = new KhachHangSoap();

		soapModel.setMaKH(model.getMaKH());
		soapModel.setTenKH(model.getTenKH());
		soapModel.setMatKhau(model.getMatKhau());
		soapModel.setEmail(model.getEmail());
		soapModel.setDienThoai(model.getDienThoai());
		soapModel.setGioiTinh(model.getGioiTinh());
		soapModel.setNgaySinh(model.getNgaySinh());
		soapModel.setDiaChi(model.getDiaChi());

		return soapModel;
	}

	public static KhachHangSoap[] toSoapModels(KhachHang[] models) {
		KhachHangSoap[] soapModels = new KhachHangSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static KhachHangSoap[][] toSoapModels(KhachHang[][] models) {
		KhachHangSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new KhachHangSoap[models.length][models[0].length];
		}
		else {
			soapModels = new KhachHangSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static KhachHangSoap[] toSoapModels(List<KhachHang> models) {
		List<KhachHangSoap> soapModels = new ArrayList<KhachHangSoap>(models.size());

		for (KhachHang model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new KhachHangSoap[soapModels.size()]);
	}

	public KhachHangSoap() {
	}

	public int getPrimaryKey() {
		return _MaKH;
	}

	public void setPrimaryKey(int pk) {
		setMaKH(pk);
	}

	public int getMaKH() {
		return _MaKH;
	}

	public void setMaKH(int MaKH) {
		_MaKH = MaKH;
	}

	public String getTenKH() {
		return _TenKH;
	}

	public void setTenKH(String TenKH) {
		_TenKH = TenKH;
	}

	public String getMatKhau() {
		return _MatKhau;
	}

	public void setMatKhau(String MatKhau) {
		_MatKhau = MatKhau;
	}

	public String getEmail() {
		return _Email;
	}

	public void setEmail(String Email) {
		_Email = Email;
	}

	public String getDienThoai() {
		return _DienThoai;
	}

	public void setDienThoai(String DienThoai) {
		_DienThoai = DienThoai;
	}

	public boolean getGioiTinh() {
		return _GioiTinh;
	}

	public boolean isGioiTinh() {
		return _GioiTinh;
	}

	public void setGioiTinh(boolean GioiTinh) {
		_GioiTinh = GioiTinh;
	}

	public Date getNgaySinh() {
		return _NgaySinh;
	}

	public void setNgaySinh(Date NgaySinh) {
		_NgaySinh = NgaySinh;
	}

	public String getDiaChi() {
		return _DiaChi;
	}

	public void setDiaChi(String DiaChi) {
		_DiaChi = DiaChi;
	}

	private int _MaKH;
	private String _TenKH;
	private String _MatKhau;
	private String _Email;
	private String _DienThoai;
	private boolean _GioiTinh;
	private Date _NgaySinh;
	private String _DiaChi;
}