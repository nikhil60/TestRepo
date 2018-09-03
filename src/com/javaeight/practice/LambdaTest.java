package com.javaeight.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class LambdaTest {
	
	List<Person> personList=Arrays.asList(
			new Person(1,"Sachin","Tendulkar","Mumbai","1111111"),
			new Person(2,"Virat","Kohli","Delhi","22222222"),
			new Person(3,"Rohit","Sharma","Mumbai","33333333"),
			new Person(4,"MahendraSingh","Dhoni","Ranchi","44444444")
			);
	
	public void printPerson()
	{
		for(Person person:personList)
		{
			System.out.println(person.toString());
		}
	}
	public void sort()
	{
		Collections.sort(personList, new FirstnameComparator());
	}
	public void conditionPrint()
	{
		for(Person person:personList)
		{
			if(person.getPersonFirstname().startsWith("M"))
				System.out.println(person.toString());
		}
	}
	public static void main(String arg[])
	{
		LambdaTest t = new LambdaTest();
		t.printPerson();
		t.sort();
		System.out.println("_______________Sorted List___________________");
		t.printPerson();
		System.out.println("_______________Conditional Print_________________");
		t.conditionPrint();
	}
}
class FirstnameComparator implements Comparator<Person>
{
	public int compare(Person p1,Person p2)
	{
		return p1.getPersonFirstname().compareTo(p2.getPersonFirstname());
	}
}