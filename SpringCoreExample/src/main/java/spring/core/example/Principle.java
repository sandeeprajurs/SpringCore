package spring.core.example;

public class Principle {
	
	String name;
	
	public Principle(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println(name+" is principle");
	}
}
