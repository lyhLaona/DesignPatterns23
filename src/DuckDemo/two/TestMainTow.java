package DuckDemo.two;

public class TestMainTow {

	public static void main(String[] args) {
		DuckB b = new DuckTwo();
		b.performFly();
		b.performQuack();
		b.setFly(new FlyWW());
		b.performFly();
	}
	
}
