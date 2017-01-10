package clone;

import java.util.Date;

public class Student2 implements Cloneable{

	private String name;
	private int age;
	private WorkExperience workE;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public WorkExperience getWorkE() {
		return workE;
	}
	public void setWorkE(String company,String time) {
		this.workE.setCompany(company);
		this.workE.setTime(time);
	}
	public Student2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.workE = new WorkExperience();
	}
	
	public Student2 clone(){
		try {
			Student2 s = null;
		    s = (Student2) super.clone();
		    return s;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", age=" + age + ", workE=" + workE
				+ "]";
	}
	
	
	
}
