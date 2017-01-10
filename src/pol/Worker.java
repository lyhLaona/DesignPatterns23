package pol;

public class Worker extends Person{
	
	private float salary;

	public Worker(String name, int age,float salary) {
		super(name, age);
		this.salary = salary;
	}

	@Override
	public String getContent() {
		return "工人信息 ==》 姓名："+getName()+"  年龄："+getAge()+" 薪水："+getSalary();
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	
	
}
