package com.project.constructors;

public class EmployeeInfo{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}


public class ConstructorDemo{
public static void main(String[] args) {

	EmployeeInfo emp1=new EmployeeInfo(); 
	EmployeeInfo emp2=new EmployeeInfo();

	emp1.display();
	emp2.display();
	}


}}