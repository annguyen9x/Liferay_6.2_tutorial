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
import com.annguyen.kyanhbooks.model.SachModel;
import com.annguyen.kyanhbooks.model.SachSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Sach service. Represents a row in the &quot;Sach&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.annguyen.kyanhbooks.model.SachModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SachImpl}.
 * </p>
 *
 * @author AnNguyen
 * @see SachImpl
 * @see com.annguyen.kyanhbooks.model.Sach
 * @see com.annguyen.kyanhbooks.model.SachModel
 * @generated
 */
@JSON(strict = true)
public class SachModelImpl extends BaseModelImpl<Sach> implements SachModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sach model instance should use the {@link com.annguyen.kyanhbooks.model.Sach} interface instead.
	 */
	public static final String TABLE_NAME = "Sach";
	public static final Object[][] TABLE_COLUMNS = {
			{ "MaSach", Types.VARCHAR },
			{ "TenSach", Types.VARCHAR },
			{ "DonGia", Types.FLOAT },
			{ "SoLuong", Types.INTEGER },
			{ "UrlHinh", Types.VARCHAR },
			{ "NoiDung", Types.VARCHAR },
			{ "TacGia", Types.VARCHAR },
			{ "NamXB", Types.INTEGER },
			{ "NXB", Types.VARCHAR },
			{ "MaLoaiSach", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table Sach (MaSach VARCHAR(75) not null primary key,TenSach VARCHAR(75) null,DonGia DOUBLE,SoLuong INTEGER,UrlHinh VARCHAR(75) null,NoiDung VARCHAR(75) null,TacGia VARCHAR(75) null,NamXB INTEGER,NXB VARCHAR(75) null,MaLoaiSach VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table Sach";
	public static final String ORDER_BY_JPQL = " ORDER BY sach.TenSach ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Sach.TenSach ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.annguyen.kyanhbooks.model.Sach"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.annguyen.kyanhbooks.model.Sach"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Sach toModel(SachSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Sach model = new SachImpl();

		model.setMaSach(soapModel.getMaSach());
		model.setTenSach(soapModel.getTenSach());
		model.setDonGia(soapModel.getDonGia());
		model.setSoLuong(soapModel.getSoLuong());
		model.setUrlHinh(soapModel.getUrlHinh());
		model.setNoiDung(soapModel.getNoiDung());
		model.setTacGia(soapModel.getTacGia());
		model.setNamXB(soapModel.getNamXB());
		model.setNXB(soapModel.getNXB());
		model.setMaLoaiSach(soapModel.getMaLoaiSach());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Sach> toModels(SachSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Sach> models = new ArrayList<Sach>(soapModels.length);

		for (SachSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.annguyen.kyanhbooks.model.Sach"));

	public SachModelImpl() {
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

	@JSON
	@Override
	public String getMaSach() {
		if (_MaSach == null) {
			return StringPool.BLANK;
		}
		else {
			return _MaSach;
		}
	}

	@Override
	public void setMaSach(String MaSach) {
		_MaSach = MaSach;
	}

	@JSON
	@Override
	public String getTenSach() {
		if (_TenSach == null) {
			return StringPool.BLANK;
		}
		else {
			return _TenSach;
		}
	}

	@Override
	public void setTenSach(String TenSach) {
		_TenSach = TenSach;
	}

	@JSON
	@Override
	public float getDonGia() {
		return _DonGia;
	}

	@Override
	public void setDonGia(float DonGia) {
		_DonGia = DonGia;
	}

	@JSON
	@Override
	public int getSoLuong() {
		return _SoLuong;
	}

	@Override
	public void setSoLuong(int SoLuong) {
		_SoLuong = SoLuong;
	}

	@JSON
	@Override
	public String getUrlHinh() {
		if (_UrlHinh == null) {
			return StringPool.BLANK;
		}
		else {
			return _UrlHinh;
		}
	}

	@Override
	public void setUrlHinh(String UrlHinh) {
		_UrlHinh = UrlHinh;
	}

	@JSON
	@Override
	public String getNoiDung() {
		if (_NoiDung == null) {
			return StringPool.BLANK;
		}
		else {
			return _NoiDung;
		}
	}

	@Override
	public void setNoiDung(String NoiDung) {
		_NoiDung = NoiDung;
	}

	@JSON
	@Override
	public String getTacGia() {
		if (_TacGia == null) {
			return StringPool.BLANK;
		}
		else {
			return _TacGia;
		}
	}

	@Override
	public void setTacGia(String TacGia) {
		_TacGia = TacGia;
	}

	@JSON
	@Override
	public int getNamXB() {
		return _NamXB;
	}

	@Override
	public void setNamXB(int NamXB) {
		_NamXB = NamXB;
	}

	@JSON
	@Override
	public String getNXB() {
		if (_NXB == null) {
			return StringPool.BLANK;
		}
		else {
			return _NXB;
		}
	}

	@Override
	public void setNXB(String NXB) {
		_NXB = NXB;
	}

	@JSON
	@Override
	public String getMaLoaiSach() {
		if (_MaLoaiSach == null) {
			return StringPool.BLANK;
		}
		else {
			return _MaLoaiSach;
		}
	}

	@Override
	public void setMaLoaiSach(String MaLoaiSach) {
		_MaLoaiSach = MaLoaiSach;
	}

	@Override
	public Sach toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Sach)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SachImpl sachImpl = new SachImpl();

		sachImpl.setMaSach(getMaSach());
		sachImpl.setTenSach(getTenSach());
		sachImpl.setDonGia(getDonGia());
		sachImpl.setSoLuong(getSoLuong());
		sachImpl.setUrlHinh(getUrlHinh());
		sachImpl.setNoiDung(getNoiDung());
		sachImpl.setTacGia(getTacGia());
		sachImpl.setNamXB(getNamXB());
		sachImpl.setNXB(getNXB());
		sachImpl.setMaLoaiSach(getMaLoaiSach());

		sachImpl.resetOriginalValues();

		return sachImpl;
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

		if (!(obj instanceof Sach)) {
			return false;
		}

		Sach sach = (Sach)obj;

		String primaryKey = sach.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Sach> toCacheModel() {
		SachCacheModel sachCacheModel = new SachCacheModel();

		sachCacheModel.MaSach = getMaSach();

		String MaSach = sachCacheModel.MaSach;

		if ((MaSach != null) && (MaSach.length() == 0)) {
			sachCacheModel.MaSach = null;
		}

		sachCacheModel.TenSach = getTenSach();

		String TenSach = sachCacheModel.TenSach;

		if ((TenSach != null) && (TenSach.length() == 0)) {
			sachCacheModel.TenSach = null;
		}

		sachCacheModel.DonGia = getDonGia();

		sachCacheModel.SoLuong = getSoLuong();

		sachCacheModel.UrlHinh = getUrlHinh();

		String UrlHinh = sachCacheModel.UrlHinh;

		if ((UrlHinh != null) && (UrlHinh.length() == 0)) {
			sachCacheModel.UrlHinh = null;
		}

		sachCacheModel.NoiDung = getNoiDung();

		String NoiDung = sachCacheModel.NoiDung;

		if ((NoiDung != null) && (NoiDung.length() == 0)) {
			sachCacheModel.NoiDung = null;
		}

		sachCacheModel.TacGia = getTacGia();

		String TacGia = sachCacheModel.TacGia;

		if ((TacGia != null) && (TacGia.length() == 0)) {
			sachCacheModel.TacGia = null;
		}

		sachCacheModel.NamXB = getNamXB();

		sachCacheModel.NXB = getNXB();

		String NXB = sachCacheModel.NXB;

		if ((NXB != null) && (NXB.length() == 0)) {
			sachCacheModel.NXB = null;
		}

		sachCacheModel.MaLoaiSach = getMaLoaiSach();

		String MaLoaiSach = sachCacheModel.MaLoaiSach;

		if ((MaLoaiSach != null) && (MaLoaiSach.length() == 0)) {
			sachCacheModel.MaLoaiSach = null;
		}

		return sachCacheModel;
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

	private static ClassLoader _classLoader = Sach.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Sach.class };
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
	private Sach _escapedModel;
}