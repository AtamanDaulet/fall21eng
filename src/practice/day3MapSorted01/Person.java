package practice.day3MapSorted01;

public class Person {
	
	private String name;
	private String lastname;
	private int age;
	private String email;
	public Person() {
	}
	public Person(String name, String lastname, int age) {
		this.name = name;
		this.lastname = lastname;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", lastname=" + lastname + ", age=" + age + ", email=" + email + "]";
	}
}
