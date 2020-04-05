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

package com.annguyen.kyanhbooks.model.impl;

import com.annguyen.kyanhbooks.model.Sach;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Sach in entity cache.
 *
 * @author AnNguyen
 * @see Sach
 * @generated
 */
public class SachCacheModel implements CacheModel<Sach>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{MaSach=");
		sb.append(MaSach);
		sb.append(", TenSach=");
		sb.append(TenSach);
		sb.append(", DonGia=");
		sb.append(DonGia);
		sb.append(", SoLuong=");
		sb.append(SoLuong);
		sb.append(", UrlHinh=");
		sb.append(UrlHinh);
		sb.append(", NoiDung=");
		sb.append(NoiDung);
		sb.append(", TacGia=");
		sb.append(TacGia);
		sb.append(", NamXB=");
		sb.append(NamXB);
		sb.append(", NXB=");
		sb.append(NXB);
		sb.append(", MaLoaiSach=");
		sb.append(MaLoaiSach);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Sach toEntityModel() {
		SachImpl sachImpl = new SachImpl();

		if (MaSach == null) {
			sachImpl.setMaSach(StringPool.BLANK);
		}
		else {
			sachImpl.setMaSach(MaSach);
		}

		if (TenSach == null) {
			sachImpl.setTenSach(StringPool.BLANK);
		}
		else {
			sachImpl.setTenSach(TenSach);
		}

		sachImpl.setDonGia(DonGia);
		sachImpl.setSoLuong(SoLuong);

		if (UrlHinh == null) {
			sachImpl.setUrlHinh(StringPool.BLANK);
		}
		else {
			sachImpl.setUrlHinh(UrlHinh);
		}

		if (NoiDung == null) {
			sachImpl.setNoiDung(StringPool.BLANK);
		}
		else {
			sachImpl.setNoiDung(NoiDung);
		}

		if (TacGia == null) {
			sachImpl.setTacGia(StringPool.BLANK);
		}
		else {
			sachImpl.setTacGia(TacGia);
		}

		sachImpl.setNamXB(NamXB);

		if (NXB == null) {
			sachImpl.setNXB(StringPool.BLANK);
		}
		else {
			sachImpl.setNXB(NXB);
		}

		if (MaLoaiSach == null) {
			sachImpl.setMaLoaiSach(StringPool.BLANK);
		}
		else {
			sachImpl.setMaLoaiSach(MaLoaiSach);
		}

		sachImpl.resetOriginalValues();

		return sachImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		MaSach = objectInput.readUTF();
		TenSach = objectInput.readUTF();
		DonGia = objectInput.readFloat();
		SoLuong = objectInput.readInt();
		UrlHinh = objectInput.readUTF();
		NoiDung = objectInput.readUTF();
		TacGia = objectInput.readUTF();
		NamXB = objectInput.readInt();
		NXB = objectInput.readUTF();
		MaLoaiSach = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (MaSach == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MaSach);
		}

		if (TenSach == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenSach);
		}

		objectOutput.writeFloat(DonGia);
		objectOutput.writeInt(SoLuong);

		if (UrlHinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(UrlHinh);
		}

		if (NoiDung == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NoiDung);
		}

		if (TacGia == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TacGia);
		}

		objectOutput.writeInt(NamXB);

		if (NXB == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NXB);
		}

		if (MaLoaiSach == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MaLoaiSach);
		}
	}

	public String MaSach;
	public String TenSach;
	public float DonGia;
	public int SoLuong;
	public String UrlHinh;
	public String NoiDung;
	public String TacGia;
	public int NamXB;
	public String NXB;
	public String MaLoaiSach;
}