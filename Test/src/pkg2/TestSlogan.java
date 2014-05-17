package pkg2;

public class TestSlogan {
	public static void main(String[] args){
		Slogan obj;
		
		obj = new Slogan("Hello, this is the first line.");
		System.out.println(obj);
		
		obj = new Slogan("Hello, this is the second line.");
		System.out.println(obj);
		
		obj = new Slogan("Hello, this is the third line.");
		System.out.println(obj);
		
		System.out.println("Slogan's count is:" + Slogan.getCount());
	}
}
