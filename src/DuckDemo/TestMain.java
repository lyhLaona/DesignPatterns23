package DuckDemo;

public class TestMain {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
//		mallard.performFly();
//		mallard.performQuack();
		mallard.setFlyBehavior(new FlyWithRocket());
		mallard.performFly();
	}
	
}
