package service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  测试 impl.Japanese 的 传值set注入
 *  
 *  Spring  容器 测试
 *  容器会自动初始化所有的 singleton Bean,包括调用构造器创建该Bean实例
 *  并根据<property ../> 元素执行setter方法
 *  如果不想容器预初始化,可以在<bean../> 中指定 lazy-init="true"
 * @author Administrator
 *
 */
public class ApplicationContextTest {
	public static void main(String[] args) {
		//创建Spring 容器,观察输出
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
	}
}
