package day25interface;

public class Runner {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.bacteriaKiller();
		car1.climateAC();
		car1.electronicAC();
		car1.havingHybridEngine();
		
		//When you use "default" keyword to create "concrete method" in an interface, you can call the method just by using "object name"
		//By using interface names, you cannot access to the method.
		car1.move();
		
		//When you use "static" keyword to create "concrete method" in an interface, you can call the method just by using "interface name"
		//By using object names, you cannot access to the method.
		Vehicle.staticMove();
		
		// wrong Its ambiguous = System.out.println(car1.MAKE);
		
		System.out.println(AirCondition.MAKE);
		
		System.out.println(HybridEngine.MAKE);

	}

}
