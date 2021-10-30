package day20passbyvaluedatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import day21accessmodifiersstringbuilder.Student;

public class Date01 extends Student{

	/*
 	We can create object in 2 ways;
 	1)By using "new" keyword. For example; "int arr[] = new int[3];"
 	2)We convert an existing object to another object "List<Integer> list = Arrays.asList(12, 13, 14);"
*/
	public static void main(String[] args) {
		System.out.println(LocalDate.now());//2021-10-27
		
		System.out.println(LocalTime.now());//21:12:26.330705
		
		System.out.println(LocalDateTime.now());//2021-10-27T21:14:10.229610
		
		//How to manipulate date
		LocalDate currentDate = LocalDate.now();
		
		System.out.println("Before adding 7 days: " + currentDate);//2021-10-27		
		currentDate = currentDate.plusDays(7);		
		System.out.println("After adding 7 days: " + currentDate);//2021-11-03
		
		currentDate = currentDate.minusDays(2);
		System.out.println("After subtracting 2 days: " + currentDate);//2021-11-01
		
		currentDate = currentDate.plusMonths(5);
		System.out.println("After adding 5 months: " + currentDate);//2022-04-01
		
		currentDate = currentDate.minusYears(6).plusMonths(4).minusDays(5);
		System.out.println("Method chain: " + currentDate);//2016-07-27
		
		//How to manipulate time
		LocalTime currentTime = LocalTime.now();
		
		System.out.println(currentDate.EPOCH);//1970-01-01 (The date computers start to measure system time)
		
		//How to manipulate time
		LocalTime currentTime1 = LocalTime.now();
		int hour = currentTime1.getHour();
		System.out.println(hour);//18
		
		//print the time 20:30
		LocalTime time = currentTime.of(20, 30);
		System.out.println(time);//20:30
		
		boolean isAfter =   currentTime.isAfter(time);
		System.out.println(isAfter);//false
		
		System.out.println(currentTime.MIDNIGHT);//00:00
		System.out.println(currentTime.NOON);//12:00
		System.out.println(currentTime.MAX);//23:59:59.999999999
		System.out.println(currentTime.MIN);//00:00

	}

}
