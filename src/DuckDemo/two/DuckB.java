package DuckDemo.two;

public abstract class DuckB {

	FlyB flyb;
	QuackB quackb;
	
	public void performFly(){
		flyb.fly();
	}
	
	public void performQuack(){
		quackb.quack();
	}
	
	public void swim(){}
	
	public void setFly(FlyB fb){
		flyb = fb;
	}
	
}
