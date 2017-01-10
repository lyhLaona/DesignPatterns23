package interf;

public class Print implements Usb{

	@Override
	public void start() {
		System.out.println("Print----start");
	}

	@Override
	public void end() {
		System.out.println("Print-----end");
	}

}
