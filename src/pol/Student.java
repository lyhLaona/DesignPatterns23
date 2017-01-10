package pol;

public class Student extends Person{

	public Student(String name, int age,int score) {
		super(name, age);
		this.score = score;
	}

	private int score;
	
	@Override
	public String getContent() {
		return "学生信息 ==》 姓名："+getName()+"  年龄："+getAge()+" 成绩："+getScore();
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
	
}
