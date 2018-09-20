package dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import beans.User;
/**
 *   UserDaoHibernate5 继承BaseDaoHIbernate5 实现类, 并实现UserDao接口
 * @author Administrator
 *
 */
@Repository
public class UserDaoHibernate5 extends BaseDaoHibernate5<User> implements UserDao{
//	//注入所需要的setter方法.  userDao 应和配置文件中的bean id属性相同
//		private UserDao userDao;
//		public void setUserDao(UserDao userDao) {
//			this.userDao = userDao;
//		}
	public Serializable save(User entity) {
		System.out.println("UserDaoHibernate5保存实体:"+entity);
		System.out.println("Sessionfactory: "+getSessionFactory());
		Session session = getSessionFactory().openSession();
		System.out.println("Session:"+session.toString());
		Serializable num =  session.save(entity);
		session.close();
		return num;
	//	return getSessionFactory().getCurrentSession().save(entity);
	}
}
