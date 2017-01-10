package pol;

public class TestInterfaceAbstract {

	public static void main(String[] args) {
		// 在 abstract 和  interface 中使用多态
		D d = new F();
		E e = new G();
		d.print();
		e.print();
	}
	
}
