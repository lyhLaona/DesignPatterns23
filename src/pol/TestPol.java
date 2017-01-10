package pol;

public class TestPol {

	public static void main(String[] args) {
		// 利用多态的向上转型
		fun(new B());
		fun(new C());
		fun(new A());
	}
	
	public static void fun(A a){
		a.fun1();
	}
	
}
