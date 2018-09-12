package impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import beans.User;
import beans.UserForm;
import dao.HibernateSessionFactory;
import service.UserManager;

public class UserManagerimpl implements UserManager{
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
	/*public static void main(String[] args) {
		UserManager umi = new UserManagerimpl();
		UserForm userf = new UserForm();
		userf.setGender(1);
		userf.setUsername("速度6");
		userf.setPassword("a撒大声地d2");
		umi.regUser(userf);
	}*/
}
