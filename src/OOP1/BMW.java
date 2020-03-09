package OOP1;

public class BMW extends Car {
	
	public BMW(){
		super();
		System.out.println("BMW const");
	}

	//Method Overriding : run Time Polymorphism
	
	public void start() {
		System.out.println("BMW -- start");
	}

	public void theftSafety() {
		System.out.println("BMW -- theftSafety");
	}

}
