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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.annguyen.kyanhbooks.service.http.SachServiceSoap}.
 *
 * @author AnNguyen
 * @see com.annguyen.kyanhbooks.service.http.SachServiceSoap
 * @generated
 */
public class SachSoap implements Serializable {
	public static SachSoap toSoapModel(Sach model) {
		SachSoap soapModel = new SachSoap();

		soapModel.setMaSach(model.getMaSach());
		soapModel.setTenSach(model.getTenSach());
		soapModel.setDonGia(model.getDonGia());
		soapModel.setSoLuong(model.getSoLuong());
		soapModel.setUrlHinh(model.getUrlHinh());
		soapModel.setNoiDung(model.getNoiDung());
		soapModel.setTacGia(model.getTacGia());
		soapModel.setNamXB(model.getNamXB());
		soapModel.setNXB(model.getNXB());
		soapModel.setMaLoaiSach(model.getMaLoaiSach());

		return soapModel;
	}

	public static SachSoap[] toSoapModels(Sach[] models) {
		SachSoap[] soapModels = new SachSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SachSoap[][] toSoapModels(Sach[][] models) {
		SachSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SachSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SachSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SachSoap[] toSoapModels(List<Sach> models) {
		List<SachSoap> soapModels = new ArrayList<SachSoap>(models.size());

		for (Sach model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SachSoap[soapModels.size()]);
	}

	public SachSoap() {
	}

	public String getPrimaryKey() {
		return _MaSach;
	}

	public void setPrimaryKey(String pk) {
		setMaSach(pk);
	}

	public String getMaSach() {
		return _MaSach;
	}

	public void setMaSach(String MaSach) {
		_MaSach = MaSach;
	}

	public String getTenSach() {
		return _TenSach;
	}

	public void setTenSach(String TenSach) {
		_TenSach = TenSach;
	}

	public float getDonGia() {
		return _DonGia;
	}

	public void setDonGia(float DonGia) {
		_DonGia = DonGia;
	}

	public int getSoLuong() {
		return _SoLuong;
	}

	public void setSoLuong(int SoLuong) {
		_SoLuong = SoLuong;
	}

	public String getUrlHinh() {
		return _UrlHinh;
	}

	public void setUrlHinh(String UrlHinh) {
		_UrlHinh = UrlHinh;
	}

	public String getNoiDung() {
		return _NoiDung;
	}

	public void setNoiDung(String NoiDung) {
		_NoiDung = NoiDung;
	}

	public String getTacGia() {
		return _TacGia;
	}

	public void setTacGia(String TacGia) {
		_TacGia = TacGia;
	}

	public int getNamXB() {
		return _NamXB;
	}

	public void setNamXB(int NamXB) {
		_NamXB = NamXB;
	}

	public String getNXB() {
		return _NXB;
	}

	public void setNXB(String NXB) {
		_NXB = NXB;
	}

	public String getMaLoaiSach() {
		return _MaLoaiSach;
	}

	public void setMaLoaiSach(String MaLoaiSach) {
		_MaLoaiSach = MaLoaiSach;
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
}