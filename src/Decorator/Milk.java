package Decorator;

public class Milk extends CondimentDecorator{
	
	Beverage beverage;
	
	public Milk(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mlik";
	}
	
	public double cost(){
		return 0.56 + beverage.cost();
	}

}
