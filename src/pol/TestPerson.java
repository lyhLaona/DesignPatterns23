package pol;

public class TestPerson {

	public static void main(String[] args) {
		Person ps = new Student("小米", 23, 98);
		Person pw = new Worker("老王", 53, 2300);
		ps.say();
		pw.say();
	}
	
}
