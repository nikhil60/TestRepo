package com.javaeight.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;


public class LambdaTest {
	
	List<Person> personList=Arrays.asList(
			new Person(1,"Sachin","Tendulkar","Mumbai","1111111"),
			new Person(2,"Virat","Kohli","Delhi","22222222"),
			new Person(3,"Rohit","Sharma","Mumbai","33333333"),
			new Person(4,"MahendraSingh","Dhoni","Ranchi","44444444")
			);
	

	public void sortPerson()
	{
		Collections.sort(personList, (p1,p2)-> p1.getPersonFirstname().compareTo(p2.getPersonFirstname()));
	}
	
	public void conditionPrint(Condition condition)
	{
		for(Person person:personList)
		{
			if(condition.test(person))
				System.out.println(person.toString());
		}
		
	}
	public void conditionPrintusingLambda()
	{
		personList.stream().filter(a->a.getPersonFirstname().startsWith("M")).forEach(System.out::println);
		
	}
	public static void main(String arg[])
	{
		LambdaTest t = new LambdaTest();
		t.conditionPrint((Person person)->true);
		t.sortPerson();
		System.out.println("_______________Sorted List___________________");
		t.conditionPrint((Person person)->true);
		System.out.println("_______________Conditional Print_________________");
		t.conditionPrint((Person person)->person.getPersonFirstname().startsWith("M"));
		System.out.println("_______________Conditional Print Using Stream and Lambda and Method Reference_________________");
		t.conditionPrintusingLambda();
	}
}
interface Condition
{
	boolean test(Person person);
}