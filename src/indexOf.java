
public class indexOf {

	public static void main(String[] args) {
		boolean isdo = false;
		String str = "a,b,d,e,f,u,uc,admin,6,y,d,s";
		String s = "admin";
//		System.out.println(str.indexOf(s));
		String ss[] = str.split(",");
		for(int i=0; i<ss.length; i++){
			System.out.println(i);
			if(ss[i].equals(s)){
				isdo = true;
				break;
			}
		}
		System.out.println(isdo);
		
	}
	
}
