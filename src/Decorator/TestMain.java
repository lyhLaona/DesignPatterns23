package Decorator;

public class TestMain {

	public static void main(String[] args) {
		Beverage h = new HouseBlend();
//		HouseBlend h = new HouseBlend();
		Mocha m = new Mocha(h);
		Soy s = new Soy(m);
		Milk mk = new Milk(s);
		System.out.println(mk.getDescription());
		System.out.println("money: $" + mk.cost());
		
	}
	
}
