package Day_Seven;

// Entity
public class Customer {
	String name;
	String City;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public Customer() {
		super();
		
	}

	public Customer(String name, String city) {
		this.name = name;
		this.City = city;
	}
	
	
}
