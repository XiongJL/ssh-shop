package dao;

import org.springframework.stereotype.Repository;

import beans.User;
/**
 * UserDao接口,继承了BaseDao接口
 * @author Administrator
 *
 */

public interface UserDao extends BaseDao<User> {
	// 基本查询已经在BaseDao中实现
	//这里只需要写业务需要的接口方法
}
