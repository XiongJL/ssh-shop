package dao;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.List;

/**
 * 接口类 Base.java 的内容.
 * 
 * @author Administrator 接口里的两个get/set方法是为了让实现类覆盖。这样使用 
 * BaseDao dao = new UserDao()的时候，dao实体中有这两个方法。
 *  session :
 *         Session是在Hibernate中使用最频繁的接口。也被称之为持久化管理器。
 *         它提供了和持久化有关的操作，比如添加、修改、删除、加载和查询实体对象。
 */

public interface BaseDao<T>{
	
	//根据ID加载实体,  Serializable序列化
	T get(Class<T> entityClazz,Serializable id);
	
	//保存实体
	Serializable save(T entity);
	
	//更新实体
	void update(T entity);
	
	//删除实体
	void delete(T entity);
	
	//根据ID删除实体
	void delete(Class<T> entityClazz,Serializable id);
	
	//获取所有实体
	List<T> findAll(Class<T> entityClazz);
	
	//获取实体总数
	long findCount(Class<T> entityClazz);
}
