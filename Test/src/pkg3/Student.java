package pkg3;

public class Student {
	private String firstName, lastName;
	private Address homeAddress, schoolAddress;
	
	public Student(String firstName, String lastName, Address homeAddress, Address schoolAddress){
		this.firstName = firstName;
		this.lastName = lastName;
		this.homeAddress = homeAddress;
		this.schoolAddress = schoolAddress;
	}
	
	public String toString(){
		String result;
		result = this.firstName + " " + this.lastName + "\n";
		result += "Home Address:\n" + this.homeAddress + "\n";
		result += "School Address:\n" + this.schoolAddress;
		
		return result;
	}
}
