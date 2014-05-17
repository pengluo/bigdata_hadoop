package pkg3;

public class StudentBody {
	public static void main(String[] args){
		Address school = new Address("800 Lancaster Ave.", "Villanova", "PA", 19085);
		Address home = new Address("21 Jump Street", "Lynchburg", "VA", 24551);
		
		Student marsha = new Student("Marsha", "Jones", home, school);
		System.out.println(marsha);
	}
}
