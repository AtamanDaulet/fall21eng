package day25interface;

public class Bus implements AirCondition{

	@Override
	public void electronicAC() {
		System.out.println("Bus eleAC");
		
	}

	@Override
	public void climateAC() {
		System.out.println("Bus climateAC");
		
	}

	@Override
	public void bacteriaKiller() {
		
		System.out.println("The Bus AC kills %85 bacteria...");
		
	}
	
	@Override
	public void run() {
		
		System.out.println("The Bus AC works perfectly...");
		
	}

	
	
}
