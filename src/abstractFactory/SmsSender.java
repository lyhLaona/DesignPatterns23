package abstractFactory;

public class SmsSender implements Sender{

	@Override
	public void Send() {
		System.out.println("SMS Sender!");
	}

}
