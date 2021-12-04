package practice.day4animalprojectANDSomeInterviewTasks;

public class Cat extends Animal{
	protected String name;
	protected int age;
	protected String habitat;
	protected boolean isDomestic;
	protected String voice;
	
	public Cat() {
	}	
	
	public Cat(String name, int age, String habitat, boolean isDomestic) {
		this.name = name;
		this.age = age;
		this.habitat = habitat;
		this.isDomestic = isDomestic;
	}
	
	@Override
	String animalName() {
		return this.name;
	}
	@Override
	int animalAge() {
		return this.age;
	}
	@Override
	String animalHabitat() {
		return this.habitat;
	}
	@Override
	boolean isDomestic() {
		return this.isDomestic;
	}
}
