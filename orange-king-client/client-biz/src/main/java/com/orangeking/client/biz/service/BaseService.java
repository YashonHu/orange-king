package com.orangeking.client.biz.service;

import java.io.Serializable;
import java.util.List;


public interface BaseService<T,ID extends Serializable> {

	public int save(T entity);

	public int update(T entity);

	public T get(ID id);

	/**
     * 没有排序的列表也
	 * @param entity
	 * @return
	 */
	public  List<T> getList(T entity);

	public long getCount(T entity);

	public void delete(ID id);

	public List<T> getList(List<ID> ids,Class<T> beanClass);





}
