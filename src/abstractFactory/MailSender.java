package abstractFactory;

public class MailSender implements Sender{

	@Override
	public void Send() {
		System.out.println("Mail Sender!");
	}

}
