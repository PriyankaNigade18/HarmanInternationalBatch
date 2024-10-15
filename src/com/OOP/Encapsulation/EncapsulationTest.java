package com.OOP.Encapsulation;

class Employee
{
	//Encapsulation=data+function
	//data
	private int id=101;
	private String name="Sarang";
	
	//to access private data -getters and setters method
	//function
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
	public void display()
	{
		System.out.println("Employee id: "+id);
		System.out.println("Employee name: "+name);
	}
}

public class EncapsulationTest {

	public static void main(String[] args)
	{

		Employee e1=new Employee();
		e1.display();
		//e1.id=201;
		//e1.name="Amit";
		
		e1.setId(201);
		e1.setName("Amit");
		e1.display();
		
		
		

	}

}
