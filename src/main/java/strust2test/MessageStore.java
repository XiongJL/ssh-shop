package strust2test;
/**
 * 		信息储存器 类
 * @author Administrator
 *
 */
public class MessageStore {
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	public MessageStore(){
		message = "我他妈也很绝望";
	}
	public String getMessage(){
		return message;
	}
}
