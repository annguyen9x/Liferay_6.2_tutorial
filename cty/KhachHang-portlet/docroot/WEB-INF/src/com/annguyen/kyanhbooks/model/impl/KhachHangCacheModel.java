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

import com.annguyen.kyanhbooks.model.KhachHang;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing KhachHang in entity cache.
 *
 * @author AnNguyen
 * @see KhachHang
 * @generated
 */
public class KhachHangCacheModel implements CacheModel<KhachHang>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{MaKH=");
		sb.append(MaKH);
		sb.append(", TenKH=");
		sb.append(TenKH);
		sb.append(", MatKhau=");
		sb.append(MatKhau);
		sb.append(", Email=");
		sb.append(Email);
		sb.append(", DienThoai=");
		sb.append(DienThoai);
		sb.append(", GioiTinh=");
		sb.append(GioiTinh);
		sb.append(", NgaySinh=");
		sb.append(NgaySinh);
		sb.append(", DiaChi =");
		sb.append(DiaChi);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public KhachHang toEntityModel() {
		KhachHangImpl khachHangImpl = new KhachHangImpl();

		khachHangImpl.setMaKH(MaKH);

		if (TenKH == null) {
			khachHangImpl.setTenKH(StringPool.BLANK);
		}
		else {
			khachHangImpl.setTenKH(TenKH);
		}

		if (MatKhau == null) {
			khachHangImpl.setMatKhau(StringPool.BLANK);
		}
		else {
			khachHangImpl.setMatKhau(MatKhau);
		}

		if (Email == null) {
			khachHangImpl.setEmail(StringPool.BLANK);
		}
		else {
			khachHangImpl.setEmail(Email);
		}

		if (DienThoai == null) {
			khachHangImpl.setDienThoai(StringPool.BLANK);
		}
		else {
			khachHangImpl.setDienThoai(DienThoai);
		}

		khachHangImpl.setGioiTinh(GioiTinh);

		if (NgaySinh == Long.MIN_VALUE) {
			khachHangImpl.setNgaySinh(null);
		}
		else {
			khachHangImpl.setNgaySinh(new Date(NgaySinh));
		}

		if (DiaChi == null) {
			khachHangImpl.setDiaChi(StringPool.BLANK);
		}
		else {
			khachHangImpl.setDiaChi(DiaChi);
		}

		khachHangImpl.resetOriginalValues();

		return khachHangImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		MaKH = objectInput.readInt();
		TenKH = objectInput.readUTF();
		MatKhau = objectInput.readUTF();
		Email = objectInput.readUTF();
		DienThoai = objectInput.readUTF();
		GioiTinh = objectInput.readBoolean();
		NgaySinh = objectInput.readLong();
		DiaChi = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(MaKH);

		if (TenKH == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenKH);
		}

		if (MatKhau == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MatKhau);
		}

		if (Email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Email);
		}

		if (DienThoai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DienThoai);
		}

		objectOutput.writeBoolean(GioiTinh);
		objectOutput.writeLong(NgaySinh);

		if (DiaChi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DiaChi);
		}
	}

	public int MaKH;
	public String TenKH;
	public String MatKhau;
	public String Email;
	public String DienThoai;
	public boolean GioiTinh;
	public long NgaySinh;
	public String DiaChi;
}