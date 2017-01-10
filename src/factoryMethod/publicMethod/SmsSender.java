package factoryMethod.publicMethod;

public class SmsSender implements Sender{

	@Override
	public void Send() {
		System.out.println("SMS Sender!");
	}

}
