package practice.day3MapSorted01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PersonsRunner {

//	Person person1 = new Person("Osman", "Yamata", 55);
//	Person person2 = new Person("Ahmet", "Yurt", 4);
//	Person person3 = new Person("Nihal", "Elmas", 23);
//	Person person4 = new Person("Osman", "Yavan", 15);
//	Person person5 = new Person("Selcuk", "Kar", 43);
//	Person person6 = new Person("Nedime", "Ozgur", 24);
	
	//Find the names with their repeated numbers
	
	//Find the unique names
	
	//Find the oldest person // create a method to return oldest person
	
	
	//sort all ages
	
	
	//generate emails for the users using first Initial of first name and last
    //name along with @gmail.com
	
	public static void main(String[] args) {

		//0 OYamata@gmail.com
				Person person1 = new Person("Osman", "Yamata", 55);
				
				//0 AYurt@gmail.com
				Person person2 = new Person("Ahmet", "Yurt", 4);
				Person person3 = new Person("Nihal", "Elmas", 23);
				Person person4 = new Person("Osman", "Yavan", 15);
				Person person5 = new Person("Selcuk", "Kar", 65);
				Person person6 = new Person("Nedime", "Ozgur", 78);
				
				List<Person> persons = new ArrayList<>(); //here it is empty / null
				persons.add(person1);
				persons.add(person2);
				persons.add(person3);
				persons.add(person4);
				persons.add(person5);
				persons.add(person6);
				
				Map<String, Integer> map = new HashMap<String, Integer>();//Null				
				
				
				for(Person p : persons) {
					
					                    //Osman
					if(!map.containsKey(p.getName())) {
						
						map.put(p.getName(), 1);
						
					}else {
						map.put(p.getName(), map.get(p.getName())+1);
					}
					
				}
				
				
				System.out.println(map);
				
				Set<String> uniquePeople = new HashSet<>(map.keySet());
				
				System.out.println(uniquePeople);	
				
				//***************************
				Person oldestPerson = oldestPerson(persons);				
				
				System.out.println("Oldest person : "+oldestPerson);
				
								
				int [] ages = new int[persons.size()];
				
				for(int i=0; i< ages.length; i++ ) {
					
					ages[i] = persons.get(i).getAge();//55/ 4 / 23 / 15					
				}
				
				Arrays.sort(ages);
				
				System.out.println("Ages soted: "+ Arrays.toString(ages));
				
				///*******************				
				
				allPersonWithEmail(persons);
				
				System.out.println(allPersonWithEmail(persons));

	}

	public static Person oldestPerson(List < Person> persons) {
		
		Person person = new Person();
	
		int maxAge = persons.get(0).getAge();
		
		for(int i=0 ; i<persons.size(); i++) {
											
			if(maxAge <= persons.get(i).getAge()) {
				
				person.setName(persons.get(i).getName());
				person.setLastname(persons.get(i).getLastname());
				person.setAge(persons.get(i).getAge());	
			}			
		}
		return person;
	}
	
	public static List<Person> allPersonWithEmail(List<Person> persons){		
		//generate emails for the users using first Initial of first name, and last
	    //name along with @gmail.com
		
		for (int i = 0; i < persons.size(); i++) {
			
			String firstInitial = persons.get(i).getName().substring(0,1) ;
			String lastName = persons.get(i).getLastname();
			String addition = "@gmail.com";
			
			persons.get(i).setEmail(firstInitial + lastName + addition);			
		}
		return persons;		
	}
	
}
