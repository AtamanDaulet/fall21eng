package practice.day4carproject;

public class Honda extends Car{
	protected String make = "Honda";
	protected String model = "Accord";
	protected int year = 2012;
	protected double price = 8000;
		
	public Honda() {		
	}
	
	//                   CIVIC      2021         6000
	public Honda( String model, int year, double price) {
		super( model, year, price);	
		this.model = model;
		this.year = year;
		this.price = price;
	}
	static {
		System.out.println("Honda is on the way");
		
	}
	@Override
	String carMake() {
		return "Car Make: "+this.make;
	}
	@Override
	String carModel() {
		return "Car Model: " +this.model;
	}
	@Override
	int carYear() {
		return this.year;
	}
	@Override
	double carPrice() {
		return this.price;
	}
}
