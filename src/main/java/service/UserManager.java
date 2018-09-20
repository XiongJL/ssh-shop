package service;

import java.util.List;

import beans.User;
import beans.UserForm;

/**
 * 
 * @author Administrator
 *@descript 业务逻辑接口
 */
public interface UserManager {
	//用户注册
	public int regUser(User user);
/*	public void regUser(UserForm user);*/
	//返回所有用户
	public List findAllUser();
}
