package interf;

public class Computer {

	public void print(Usb usb){
		usb.start();
		System.out.println("usb 设备正在工作");
		usb.end();
	}
	
}
