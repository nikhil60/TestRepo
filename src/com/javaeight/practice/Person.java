package com.javaeight.practice;

public class Person {

	private Integer personId;
	private String personFirstname,personLastname,personAddress,personContactno;
	public Person(Integer personId,String personFirstname,String personLastname,String personAddress,String personContactno)
	{
		this.personId=personId;
		this.personFirstname=personFirstname;
		this.personLastname=personLastname;
		this.personAddress=personAddress;
		this.personContactno=personAddress;
	}
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getPersonFirstname() {
		return personFirstname;
	}
	public void setPersonFirstname(String personFirstname) {
		this.personFirstname = personFirstname;
	}
	public String getPersonLastname() {
		return personLastname;
	}
	public void setPersonLastname(String personLastname) {
		this.personLastname = personLastname;
	}
	public String getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	public String getPersonContactno() {
		return personContactno;
	}
	public void setPersonContactno(String personContactno) {
		this.personContactno = personContactno;
	}
	public String toString()
	{
		return "Person Id :"+this.personId+" || Person Name :"+this.personFirstname+" "+this.personLastname+" ||Person Address :"+this.personAddress+" ||Person Contact No :"+this.personContactno;
	}
}
