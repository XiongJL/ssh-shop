package impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import beans.User;
import beans.UserForm;
import dao.HibernateSessionFactory;
import dao.UserDao;
import dao.UserDaoHibernate5;
import service.UserManager;

public class UserManagerimpl implements UserManager{
	//该实现类依赖于DAO组件来实现regUser()方法.
	//设置注入
	@Autowired
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	/*注册用户*/
	public int regUser(User user) {
		System.out.println("userDao："+userDao);
		return (Integer) userDao.save(user);	
	}
	/*返回所有用户*/
	public List findAllUser() {
		System.out.println("正在检索用户");
		List<User> list = userDao.findAll(User.class);
		System.out.println("用户有："+list.toString());
		return  list;
	}
	
	
	
/*
	private Session session;
	//传入输入的user用户.
	public void regUser(UserForm userf) {
		session = HibernateSessionFactory.currentSession();
		//开始事务
		Transaction tx = session.beginTransaction();
		//创建用户对象
	//	User user1 = new User();
		//创建一个用户
		User user = new User();
		user.setUsername(userf.getUsername());
		user.setPassword(userf.getPassword());
		user.setGender(userf.getGender());
		System.out.println("user:"+user);
		System.out.println("userf:"+userf);
		//保存消息
		session.save(user);
		//提交事务
		tx.commit();
		//关闭Session
		session.close();
		
	}
	public static void main(String[] args) {
		UserManager umi = new UserManagerimpl();
		UserForm userf = new UserForm();
		userf.setGender(1);
		userf.setUsername("速度7");
		userf.setPassword("a撒大声地d2");
		//umi.regUser(userf);
	}*/
}
