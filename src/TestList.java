import java.util.ArrayList;
import java.util.List;


public class TestList {

	public static void main(String[] args) {
		
		List<Stu> list = new ArrayList<Stu>();
		Stu s = new Stu();
		s.setName("AAA");
		list.add(s);
		s.setAge(11);
		System.out.println(list.get(0).getAge());
	}
	
}
