package action;

import com.opensymphony.xwork2.ActionSupport;

import beans.User;
import beans.UserForm;
import service.UserManager;
import impl.UserManagerimpl;

/**
 * 
 * @author Administrator 处理注册的Action.控制器
 */
/*
 * 我们为了方便实现Action，大多数情况下都会继承com.opensymphony.xwork2.ActionSupport类，
 * 并重载（Override）此类里的String execute()方法，因为ActionSupport已经实现了Action接口，
 * 还实现了Validateable接口，提供了数据校验功能。通过继承该ActionSupport类，
 *  可以简化Struts 2的Action开发。
 */
public class RegisterAction extends ActionSupport {
	/**
	 * SerialVersionUID，是当对象序列化的时候对象的一个标识.
	 * 其实序列化的作用是能转化成Byte流，然后又能反序列化成原始的类。
	 * 能在网络进行传输，也可以保存在磁盘中，有了SUID之后，
	 * 那么如果序列化的类已经保存了在本地中，中途你更改了类后，SUID变了，
	 * 那么反序列化的时候就不会变成原始的类了，还会抛异常，主要就是用于版本控制。
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	//系统所用的业务逻辑组件
	private UserManager userManager;
	//设值注入业务逻辑组件所必须的setter方法
	//这里就可以让Spring 来管理 Action 和 组件的依赖关系
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserManager getUserManager() {
		return userManager;
	}
	
	//处理用户请求的execute方法
	public String execute(){
		try {
			//this.setUserManager(new UserManagerimpl());
			//调用业务逻辑组件的regUser(User user) 方法.
			//能读取到用户输入
			System.out.println(user);
			userManager.regUser(user);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}

	}
}
