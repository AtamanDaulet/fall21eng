package practice.day4animalprojectANDSomeInterviewTasks;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal animal1 = new Cat("Cookie", 3, "ground", true);
		
		
		Eagle animal2 = new Eagle("Coco", 7, "Air", false);
		
		String name = "Ali";
		String name2 = name;
		
		
		System.out.println("=============== CAT =====================");
		System.out.println("animal name: "+animal1.animalName());
		System.out.println("animal age: "+animal1.animalAge());
		System.out.println("animal habitat: "+animal1.animalHabitat());
		System.out.println("is domestic?: "+animal1.isDomestic());
		
		System.out.println("=============== Eagle =====================");
		System.out.println("animal name: "+animal2.animalName());
		System.out.println("animal age: "+animal2.animalAge());
		System.out.println("animal habitat: "+animal2.animalHabitat());
		System.out.println("is domestic?: "+animal2.isDomestic());

	}

}
