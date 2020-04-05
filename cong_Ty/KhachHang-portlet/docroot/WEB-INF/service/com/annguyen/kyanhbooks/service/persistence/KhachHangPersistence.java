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

package com.annguyen.kyanhbooks.service.persistence;

import com.annguyen.kyanhbooks.model.KhachHang;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the khach hang service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author AnNguyen
 * @see KhachHangPersistenceImpl
 * @see KhachHangUtil
 * @generated
 */
public interface KhachHangPersistence extends BasePersistence<KhachHang> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link KhachHangUtil} to access the khach hang persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the khach hang in the entity cache if it is enabled.
	*
	* @param khachHang the khach hang
	*/
	public void cacheResult(com.annguyen.kyanhbooks.model.KhachHang khachHang);

	/**
	* Caches the khach hangs in the entity cache if it is enabled.
	*
	* @param khachHangs the khach hangs
	*/
	public void cacheResult(
		java.util.List<com.annguyen.kyanhbooks.model.KhachHang> khachHangs);

	/**
	* Creates a new khach hang with the primary key. Does not add the khach hang to the database.
	*
	* @param MaKH the primary key for the new khach hang
	* @return the new khach hang
	*/
	public com.annguyen.kyanhbooks.model.KhachHang create(int MaKH);

	/**
	* Removes the khach hang with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param MaKH the primary key of the khach hang
	* @return the khach hang that was removed
	* @throws com.annguyen.kyanhbooks.NoSuchKhachHangException if a khach hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.annguyen.kyanhbooks.model.KhachHang remove(int MaKH)
		throws com.annguyen.kyanhbooks.NoSuchKhachHangException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.annguyen.kyanhbooks.model.KhachHang updateImpl(
		com.annguyen.kyanhbooks.model.KhachHang khachHang)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the khach hang with the primary key or throws a {@link com.annguyen.kyanhbooks.NoSuchKhachHangException} if it could not be found.
	*
	* @param MaKH the primary key of the khach hang
	* @return the khach hang
	* @throws com.annguyen.kyanhbooks.NoSuchKhachHangException if a khach hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.annguyen.kyanhbooks.model.KhachHang findByPrimaryKey(int MaKH)
		throws com.annguyen.kyanhbooks.NoSuchKhachHangException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the khach hang with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param MaKH the primary key of the khach hang
	* @return the khach hang, or <code>null</code> if a khach hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.annguyen.kyanhbooks.model.KhachHang fetchByPrimaryKey(int MaKH)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the khach hangs.
	*
	* @return the khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.annguyen.kyanhbooks.model.KhachHang> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the khach hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.annguyen.kyanhbooks.model.impl.KhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of khach hangs
	* @param end the upper bound of the range of khach hangs (not inclusive)
	* @return the range of khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.annguyen.kyanhbooks.model.KhachHang> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the khach hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.annguyen.kyanhbooks.model.impl.KhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of khach hangs
	* @param end the upper bound of the range of khach hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.annguyen.kyanhbooks.model.KhachHang> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the khach hangs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of khach hangs.
	*
	* @return the number of khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}