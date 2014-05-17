package pkg3;

public class Address {
	private String street, city, state;
	private long zipCode;
	
	public Address(String street, String city, String state, long zipCode){
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	public String toString(){
		String result;
		result = this.street + ", " + this.city;
		result += ", " + this.state + " " + zipCode;
		
		return result;
	}
}
