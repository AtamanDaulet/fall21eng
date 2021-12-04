package practice.day4animalprojectANDSomeInterviewTasks;

public class Eagle extends Animal{
	protected String name;
	protected int age;
	protected String habitat;
	protected boolean isDomestic;
	
	public Eagle() {
	}
	
	public Eagle(String name, int age, String habitat, boolean isDomestic) {
		this.name = name;
		this.age = age;
		this.habitat = habitat;
		this.isDomestic = isDomestic;
	}
	@Override
	String animalName() {
		return this.name;// Eagle
	}
	@Override
	int animalAge() {
		return this.age;// 7
	}
	@Override
	String animalHabitat() {
		return this.habitat; // Air
	}
	@Override
	boolean isDomestic() {
		return this.isDomestic;// false
	}
}
