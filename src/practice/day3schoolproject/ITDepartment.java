package practice.day3schoolproject;

public interface ITDepartment  extends School {
	public static final String NAME = "IT Department";
	
	public abstract Instructor instructor();
	
	public abstract Student student();
	
	public String labName();
	
	public boolean isLabAvaliable ();
}