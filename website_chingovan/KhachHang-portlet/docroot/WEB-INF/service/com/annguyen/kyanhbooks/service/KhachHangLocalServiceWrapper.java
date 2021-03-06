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

package com.annguyen.kyanhbooks.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link KhachHangLocalService}.
 *
 * @author AnNguyen
 * @see KhachHangLocalService
 * @generated
 */
public class KhachHangLocalServiceWrapper implements KhachHangLocalService,
	ServiceWrapper<KhachHangLocalService> {
	public KhachHangLocalServiceWrapper(
		KhachHangLocalService khachHangLocalService) {
		_khachHangLocalService = khachHangLocalService;
	}

	/**
	* Adds the khach hang to the database. Also notifies the appropriate model listeners.
	*
	* @param khachHang the khach hang
	* @return the khach hang that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.annguyen.kyanhbooks.model.KhachHang addKhachHang(
		com.annguyen.kyanhbooks.model.KhachHang khachHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khachHangLocalService.addKhachHang(khachHang);
	}

	/**
	* Creates a new khach hang with the primary key. Does not add the khach hang to the database.
	*
	* @param MaKH the primary key for the new khach hang
	* @return the new khach hang
	*/
	@Override
	public com.annguyen.kyanhbooks.model.KhachHang createKhachHang(int MaKH) {
		return _khachHangLocalService.createKhachHang(MaKH);
	}

	/**
	* Deletes the khach hang with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param MaKH the primary key of the khach hang
	* @return the khach hang that was removed
	* @throws PortalException if a khach hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.annguyen.kyanhbooks.model.KhachHang deleteKhachHang(int MaKH)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _khachHangLocalService.deleteKhachHang(MaKH);
	}

	/**
	* Deletes the khach hang from the database. Also notifies the appropriate model listeners.
	*
	* @param khachHang the khach hang
	* @return the khach hang that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.annguyen.kyanhbooks.model.KhachHang deleteKhachHang(
		com.annguyen.kyanhbooks.model.KhachHang khachHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khachHangLocalService.deleteKhachHang(khachHang);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _khachHangLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khachHangLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.annguyen.kyanhbooks.model.impl.KhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _khachHangLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.annguyen.kyanhbooks.model.impl.KhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khachHangLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khachHangLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khachHangLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.annguyen.kyanhbooks.model.KhachHang fetchKhachHang(int MaKH)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khachHangLocalService.fetchKhachHang(MaKH);
	}

	/**
	* Returns the khach hang with the primary key.
	*
	* @param MaKH the primary key of the khach hang
	* @return the khach hang
	* @throws PortalException if a khach hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.annguyen.kyanhbooks.model.KhachHang getKhachHang(int MaKH)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _khachHangLocalService.getKhachHang(MaKH);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _khachHangLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<com.annguyen.kyanhbooks.model.KhachHang> getKhachHangs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khachHangLocalService.getKhachHangs(start, end);
	}

	/**
	* Returns the number of khach hangs.
	*
	* @return the number of khach hangs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getKhachHangsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khachHangLocalService.getKhachHangsCount();
	}

	/**
	* Updates the khach hang in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param khachHang the khach hang
	* @return the khach hang that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.annguyen.kyanhbooks.model.KhachHang updateKhachHang(
		com.annguyen.kyanhbooks.model.KhachHang khachHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khachHangLocalService.updateKhachHang(khachHang);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _khachHangLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_khachHangLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _khachHangLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public KhachHangLocalService getWrappedKhachHangLocalService() {
		return _khachHangLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedKhachHangLocalService(
		KhachHangLocalService khachHangLocalService) {
		_khachHangLocalService = khachHangLocalService;
	}

	@Override
	public KhachHangLocalService getWrappedService() {
		return _khachHangLocalService;
	}

	@Override
	public void setWrappedService(KhachHangLocalService khachHangLocalService) {
		_khachHangLocalService = khachHangLocalService;
	}

	private KhachHangLocalService _khachHangLocalService;
}