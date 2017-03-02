package com.orangeking.client.biz.service;

import com.orangeking.client.dao.util.MyMapper;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Id;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.List;

public abstract class AbstractDbBaseService<T,ID extends Serializable> implements BaseService<T,ID> {

	protected MyMapper<T> mapper;

	public AbstractDbBaseService(MyMapper<T> mapper){
        this.mapper=mapper;
	}

	@Override
	public int save(T entity) {
		return mapper.insert(entity);
	}

	@Override
	public int update(T entity) {
		return mapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public T get(ID id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<T> getList(T entity) {
		return mapper.select(entity);
	}

	@Override
	public long getCount(T entity){
		return 	mapper.selectCount(entity);
	}

	@Override
	public void delete(ID id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<T> getList(List<ID> ids,Class<T> beanClass) {
		String id=null;
		Field[] fields = beanClass.getDeclaredFields();
		for (Field f:fields){
			if(f.getName().equalsIgnoreCase("id")&&id==null){
				id=f.getName();
			}
			if(f.getAnnotation(Id.class)!=null){
				id=f.getName();
			}
		}
		Example example =  new Example(beanClass);
		example.createCriteria().andIn(id,ids);
		return mapper.selectByExample(example);
	}
}