package pkg2;

public class Slogan {
	public String phrase;
	private static int count = 0;
	
	public Slogan(String str) {
		phrase = str;
		count++;
	}
	
	public String toString(){
		return phrase;
	}
	
	public static int getCount(){
		return count;
	}
}
