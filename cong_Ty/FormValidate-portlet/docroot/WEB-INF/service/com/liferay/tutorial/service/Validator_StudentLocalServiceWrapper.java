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

package com.liferay.tutorial.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Validator_StudentLocalService}.
 *
 * @author AnNguyen
 * @see Validator_StudentLocalService
 * @generated
 */
public class Validator_StudentLocalServiceWrapper
	implements Validator_StudentLocalService,
		ServiceWrapper<Validator_StudentLocalService> {
	public Validator_StudentLocalServiceWrapper(
		Validator_StudentLocalService validator_StudentLocalService) {
		_validator_StudentLocalService = validator_StudentLocalService;
	}

	/**
	* Adds the validator_ student to the database. Also notifies the appropriate model listeners.
	*
	* @param validator_Student the validator_ student
	* @return the validator_ student that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.tutorial.model.Validator_Student addValidator_Student(
		com.liferay.tutorial.model.Validator_Student validator_Student)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _validator_StudentLocalService.addValidator_Student(validator_Student);
	}

	/**
	* Creates a new validator_ student with the primary key. Does not add the validator_ student to the database.
	*
	* @param studentId the primary key for the new validator_ student
	* @return the new validator_ student
	*/
	@Override
	public com.liferay.tutorial.model.Validator_Student createValidator_Student(
		long studentId) {
		return _validator_StudentLocalService.createValidator_Student(studentId);
	}

	/**
	* Deletes the validator_ student with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentId the primary key of the validator_ student
	* @return the validator_ student that was removed
	* @throws PortalException if a validator_ student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.tutorial.model.Validator_Student deleteValidator_Student(
		long studentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _validator_StudentLocalService.deleteValidator_Student(studentId);
	}

	/**
	* Deletes the validator_ student from the database. Also notifies the appropriate model listeners.
	*
	* @param validator_Student the validator_ student
	* @return the validator_ student that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.tutorial.model.Validator_Student deleteValidator_Student(
		com.liferay.tutorial.model.Validator_Student validator_Student)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _validator_StudentLocalService.deleteValidator_Student(validator_Student);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _validator_StudentLocalService.dynamicQuery();
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
		return _validator_StudentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.tutorial.model.impl.Validator_StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _validator_StudentLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.tutorial.model.impl.Validator_StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _validator_StudentLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _validator_StudentLocalService.dynamicQueryCount(dynamicQuery);
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
		return _validator_StudentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.tutorial.model.Validator_Student fetchValidator_Student(
		long studentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _validator_StudentLocalService.fetchValidator_Student(studentId);
	}

	/**
	* Returns the validator_ student with the primary key.
	*
	* @param studentId the primary key of the validator_ student
	* @return the validator_ student
	* @throws PortalException if a validator_ student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.tutorial.model.Validator_Student getValidator_Student(
		long studentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _validator_StudentLocalService.getValidator_Student(studentId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _validator_StudentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the validator_ students.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.tutorial.model.impl.Validator_StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of validator_ students
	* @param end the upper bound of the range of validator_ students (not inclusive)
	* @return the range of validator_ students
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.tutorial.model.Validator_Student> getValidator_Students(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _validator_StudentLocalService.getValidator_Students(start, end);
	}

	/**
	* Returns the number of validator_ students.
	*
	* @return the number of validator_ students
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getValidator_StudentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _validator_StudentLocalService.getValidator_StudentsCount();
	}

	/**
	* Updates the validator_ student in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param validator_Student the validator_ student
	* @return the validator_ student that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.tutorial.model.Validator_Student updateValidator_Student(
		com.liferay.tutorial.model.Validator_Student validator_Student)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _validator_StudentLocalService.updateValidator_Student(validator_Student);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _validator_StudentLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_validator_StudentLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _validator_StudentLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public Validator_StudentLocalService getWrappedValidator_StudentLocalService() {
		return _validator_StudentLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedValidator_StudentLocalService(
		Validator_StudentLocalService validator_StudentLocalService) {
		_validator_StudentLocalService = validator_StudentLocalService;
	}

	@Override
	public Validator_StudentLocalService getWrappedService() {
		return _validator_StudentLocalService;
	}

	@Override
	public void setWrappedService(
		Validator_StudentLocalService validator_StudentLocalService) {
		_validator_StudentLocalService = validator_StudentLocalService;
	}

	private Validator_StudentLocalService _validator_StudentLocalService;
}