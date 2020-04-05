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

import com.annguyen.kyanhbooks.NoSuchKhachHangException;
import com.annguyen.kyanhbooks.model.KhachHang;
import com.annguyen.kyanhbooks.model.impl.KhachHangImpl;
import com.annguyen.kyanhbooks.model.impl.KhachHangModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the khach hang service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author AnNguyen
 * @see KhachHangPersistence
 * @see KhachHangUtil
 * @generated
 */
public class KhachHangPersistenceImpl extends BasePersistenceImpl<KhachHang>
	implements KhachHangPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link KhachHangUtil} to access the khach hang persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = KhachHangImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
			KhachHangModelImpl.FINDER_CACHE_ENABLED, KhachHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
			KhachHangModelImpl.FINDER_CACHE_ENABLED, KhachHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
			KhachHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public KhachHangPersistenceImpl() {
		setModelClass(KhachHang.class);
	}

	/**
	 * Caches the khach hang in the entity cache if it is enabled.
	 *
	 * @param khachHang the khach hang
	 */
	@Override
	public void cacheResult(KhachHang khachHang) {
		EntityCacheUtil.putResult(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
			KhachHangImpl.class, khachHang.getPrimaryKey(), khachHang);

		khachHang.resetOriginalValues();
	}

	/**
	 * Caches the khach hangs in the entity cache if it is enabled.
	 *
	 * @param khachHangs the khach hangs
	 */
	@Override
	public void cacheResult(List<KhachHang> khachHangs) {
		for (KhachHang khachHang : khachHangs) {
			if (EntityCacheUtil.getResult(
						KhachHangModelImpl.ENTITY_CACHE_ENABLED,
						KhachHangImpl.class, khachHang.getPrimaryKey()) == null) {
				cacheResult(khachHang);
			}
			else {
				khachHang.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all khach hangs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(KhachHangImpl.class.getName());
		}

		EntityCacheUtil.clearCache(KhachHangImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the khach hang.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(KhachHang khachHang) {
		EntityCacheUtil.removeResult(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
			KhachHangImpl.class, khachHang.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<KhachHang> khachHangs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (KhachHang khachHang : khachHangs) {
			EntityCacheUtil.removeResult(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
				KhachHangImpl.class, khachHang.getPrimaryKey());
		}
	}

	/**
	 * Creates a new khach hang with the primary key. Does not add the khach hang to the database.
	 *
	 * @param MaKH the primary key for the new khach hang
	 * @return the new khach hang
	 */
	@Override
	public KhachHang create(int MaKH) {
		KhachHang khachHang = new KhachHangImpl();

		khachHang.setNew(true);
		khachHang.setPrimaryKey(MaKH);

		return khachHang;
	}

	/**
	 * Removes the khach hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param MaKH the primary key of the khach hang
	 * @return the khach hang that was removed
	 * @throws com.annguyen.kyanhbooks.NoSuchKhachHangException if a khach hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhachHang remove(int MaKH)
		throws NoSuchKhachHangException, SystemException {
		return remove((Serializable)MaKH);
	}

	/**
	 * Removes the khach hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the khach hang
	 * @return the khach hang that was removed
	 * @throws com.annguyen.kyanhbooks.NoSuchKhachHangException if a khach hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhachHang remove(Serializable primaryKey)
		throws NoSuchKhachHangException, SystemException {
		Session session = null;

		try {
			session = openSession();

			KhachHang khachHang = (KhachHang)session.get(KhachHangImpl.class,
					primaryKey);

			if (khachHang == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchKhachHangException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(khachHang);
		}
		catch (NoSuchKhachHangException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected KhachHang removeImpl(KhachHang khachHang)
		throws SystemException {
		khachHang = toUnwrappedModel(khachHang);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(khachHang)) {
				khachHang = (KhachHang)session.get(KhachHangImpl.class,
						khachHang.getPrimaryKeyObj());
			}

			if (khachHang != null) {
				session.delete(khachHang);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (khachHang != null) {
			clearCache(khachHang);
		}

		return khachHang;
	}

	@Override
	public KhachHang updateImpl(
		com.annguyen.kyanhbooks.model.KhachHang khachHang)
		throws SystemException {
		khachHang = toUnwrappedModel(khachHang);

		boolean isNew = khachHang.isNew();

		Session session = null;

		try {
			session = openSession();

			if (khachHang.isNew()) {
				session.save(khachHang);

				khachHang.setNew(false);
			}
			else {
				session.merge(khachHang);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
			KhachHangImpl.class, khachHang.getPrimaryKey(), khachHang);

		return khachHang;
	}

	protected KhachHang toUnwrappedModel(KhachHang khachHang) {
		if (khachHang instanceof KhachHangImpl) {
			return khachHang;
		}

		KhachHangImpl khachHangImpl = new KhachHangImpl();

		khachHangImpl.setNew(khachHang.isNew());
		khachHangImpl.setPrimaryKey(khachHang.getPrimaryKey());

		khachHangImpl.setMaKH(khachHang.getMaKH());
		khachHangImpl.setTenKH(khachHang.getTenKH());
		khachHangImpl.setMatKhau(khachHang.getMatKhau());
		khachHangImpl.setEmail(khachHang.getEmail());
		khachHangImpl.setDienThoai(khachHang.getDienThoai());
		khachHangImpl.setGioiTinh(khachHang.isGioiTinh());
		khachHangImpl.setNgaySinh(khachHang.getNgaySinh());
		khachHangImpl.setDiaChi(khachHang.getDiaChi());

		return khachHangImpl;
	}

	/**
	 * Returns the khach hang with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the khach hang
	 * @return the khach hang
	 * @throws com.annguyen.kyanhbooks.NoSuchKhachHangException if a khach hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhachHang findByPrimaryKey(Serializable primaryKey)
		throws NoSuchKhachHangException, SystemException {
		KhachHang khachHang = fetchByPrimaryKey(primaryKey);

		if (khachHang == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchKhachHangException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return khachHang;
	}

	/**
	 * Returns the khach hang with the primary key or throws a {@link com.annguyen.kyanhbooks.NoSuchKhachHangException} if it could not be found.
	 *
	 * @param MaKH the primary key of the khach hang
	 * @return the khach hang
	 * @throws com.annguyen.kyanhbooks.NoSuchKhachHangException if a khach hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhachHang findByPrimaryKey(int MaKH)
		throws NoSuchKhachHangException, SystemException {
		return findByPrimaryKey((Serializable)MaKH);
	}

	/**
	 * Returns the khach hang with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the khach hang
	 * @return the khach hang, or <code>null</code> if a khach hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhachHang fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		KhachHang khachHang = (KhachHang)EntityCacheUtil.getResult(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
				KhachHangImpl.class, primaryKey);

		if (khachHang == _nullKhachHang) {
			return null;
		}

		if (khachHang == null) {
			Session session = null;

			try {
				session = openSession();

				khachHang = (KhachHang)session.get(KhachHangImpl.class,
						primaryKey);

				if (khachHang != null) {
					cacheResult(khachHang);
				}
				else {
					EntityCacheUtil.putResult(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
						KhachHangImpl.class, primaryKey, _nullKhachHang);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
					KhachHangImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return khachHang;
	}

	/**
	 * Returns the khach hang with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param MaKH the primary key of the khach hang
	 * @return the khach hang, or <code>null</code> if a khach hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhachHang fetchByPrimaryKey(int MaKH) throws SystemException {
		return fetchByPrimaryKey((Serializable)MaKH);
	}

	/**
	 * Returns all the khach hangs.
	 *
	 * @return the khach hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KhachHang> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<KhachHang> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<KhachHang> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<KhachHang> list = (List<KhachHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_KHACHHANG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_KHACHHANG;

				if (pagination) {
					sql = sql.concat(KhachHangModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<KhachHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KhachHang>(list);
				}
				else {
					list = (List<KhachHang>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the khach hangs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (KhachHang khachHang : findAll()) {
			remove(khachHang);
		}
	}

	/**
	 * Returns the number of khach hangs.
	 *
	 * @return the number of khach hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_KHACHHANG);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the khach hang persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.annguyen.kyanhbooks.model.KhachHang")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<KhachHang>> listenersList = new ArrayList<ModelListener<KhachHang>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<KhachHang>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(KhachHangImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_KHACHHANG = "SELECT khachHang FROM KhachHang khachHang";
	private static final String _SQL_COUNT_KHACHHANG = "SELECT COUNT(khachHang) FROM KhachHang khachHang";
	private static final String _ORDER_BY_ENTITY_ALIAS = "khachHang.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No KhachHang exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(KhachHangPersistenceImpl.class);
	private static KhachHang _nullKhachHang = new KhachHangImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<KhachHang> toCacheModel() {
				return _nullKhachHangCacheModel;
			}
		};

	private static CacheModel<KhachHang> _nullKhachHangCacheModel = new CacheModel<KhachHang>() {
			@Override
			public KhachHang toEntityModel() {
				return _nullKhachHang;
			}
		};
}