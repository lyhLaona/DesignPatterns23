package DuckDemo;

public class MallardDuck extends Duck{

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("i am a mallardDuck!");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

}
