package strust2test;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 我们需要一个Action类来充当Controller。Action类响应用户操作
 * （在此示例中，该操作将单击HTML超链接并将特定URL发送到Servlet容器）。 执行一个或多个Action类的方法，并返回String结果。
 * 基于结果的值,呈现特定视图页面（在该示例中该视图页面是HelloWorld.jsp）。
 * 
 * @author Administrator
 *
 */
/*继承ActionSupport !!!!!!!!!!!!!!!!!!!!!!*/
public class HelloWorldAction extends ActionSupport{
	private MessageStore messageStore;

	/* 执行 */
	/**
	 * Struts 2框架将创建HelloWorldAction类的对象并调用execute方法以响应用户的操作
	 * （单击将特定URL发送到Servlet容器的超链接）。
	 * 
	 * 在此示例中，execute方法创建类的对象，MessageStore然后返回String常量SUCCESS。
	 * 
	 * 还要注意私有MessageStore对象的公共getter方法。由于我们希望将MessageStore
	 * 对象提供给视图页面，因此HelloWorld.jsp我们需要遵循JavaBean风格 ，
	 * 在需要时提供getter和setter方法
	 * 
	 * @return
	 */
	public String execute() {
		messageStore = new MessageStore();
		return SUCCESS;
	}

	public MessageStore getMessageStore() {
		return messageStore;
	}
}
