package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.User;

/***
 * 
 * @author XiongDa
 * @descript : Hibernate 5.3.0final创建Factory
 */
public class HibernateSessionFactory extends BaseDaoHibernate5<User> implements UserDao{
	
	public static void main(String[] args) {
		
	///	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    //    SessionFactory sessionFactory = (SessionFactory)ctx.getBean("sessionFactory");
     //   System.out.println("13"+sessionFactory);
		User user = new User();
		user.setGender(1);
		user.setPassword("速度");
		user.setUsername("asd2wsdsd2");

		System.out.println(user);
		
	}
	
	public static Session currentSession(){
		/*不带参数的configure()方法默认加载hibernate.cfg.xml文件
		如果带参数,aaa.xml,那么就会加载该文件配置*/
		System.out.println("开始创建User");
		Configuration conf = new Configuration().configure();
		//以configuration示例创建Sessionfactory实例
		System.out.println("开始创建工厂");
		SessionFactory sf = conf.buildSessionFactory();
		//创建Session
		System.out.println("开始Session");
		Session sess = sf.openSession();
		return sess;
		// ???   暂不理解关闭的意义sf.close();
	}
	
}
