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
	public void sortPerson()
	{
		Collections.sort(personList, new Comparator<Person>()
				{
					public int compare(Person p1,Person p2)
					{
						return p1.getPersonFirstname().compareTo(p2.getPersonFirstname());
					}
				});
	}
	public void conditionPrint(Condition condition)
	{
		for(Person person:personList)
		{
			if(condition.test(person))
				System.out.println(person.toString());
		}
	}
	public static void main(String arg[])
	{
		LambdaTest t = new LambdaTest();
		t.conditionPrint(new Condition()
		{
			public boolean test(Person person)
			{
				return true;
			}
		});
		t.sortPerson();
		System.out.println("_______________Sorted List___________________");
		t.printPerson();
		System.out.println("_______________Conditional Print_________________");
		t.conditionPrint(new Condition()
				{
					public boolean test(Person person)
					{
						return person.getPersonFirstname().startsWith("M");
					}
				});
		
	}
}
interface Condition
{
	boolean test(Person person);
}