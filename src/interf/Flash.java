package interf;

public class Flash implements Usb{

	@Override
	public void start() {
		System.out.println("Flash----start");
	}

	@Override
	public void end() {
		System.out.println("Flash----end");
	}

}
