package spring.core.example;

public class College {
	
	int id;
	String name;
	String country;
	Principle principle;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setPrinciple(Principle principle) {
		this.principle = principle;
	}

	public void display() {
		principle.display();
	}
	
}
