package factoryMethod.publicMethod;

public class SenderFactory {

	//普通工厂模式，如果传递的字符串出错，则不能正确创建对象
	/*
	public static Sender product(String type){
		
		if("mail".equals(type)){
			return new MailSender();
		}else if("sms".equals(type)){
			return new SmsSender();
		}
		System.out.println("请输入正确的类型");
		return null;
	}
	
	public static void main(String[] args) {
		Sender s = product("");
		s.Send();
	}
	*/
	
	//多个工厂方法模式
	public static Sender MailSender(){
		return new MailSender();
	}
	
	public static Sender smsSender(){
		return new SmsSender();
	}
	
	public static void main(String[] args) {
		Sender s = MailSender();
		s.Send();
	}
	
}
