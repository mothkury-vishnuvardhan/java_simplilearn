package com.project.calci;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
			
			char operator;
			Double num1,num2,result;
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Choose an operator: +, -, *, /, or %");
			operator= sc.next().charAt(0);
			
			System.out.println("Enter First Number");
			num1=sc.nextDouble();
			
			System.out.println("Enter Second Number");
			num2=sc.nextDouble();
			
			switch(operator) {
			
			case '+':			// Addition of two numbers
				result= num1+num2;
				System.out.println(num1+ "+" +num2+ "=" +result);   //result
				
			
				break;
				
			case '-':			//subtract two numbers
				result= num1-num2;
				System.out.println(num1+ "-" +num2+ "=" +result);
				break;	
				
			case '*':			//multiply two numbers
				result= num1*num2;
				System.out.println(num1+ "*" +num2+ "=" +result);
				break;
				
			case '/':			//divide two numbers
				result= num1/num2;
				System.out.println(num1+ "/" +num2+ "=" +result);
				break;
			
			case '%':			//
				result= num1%num2;
				System.out.println(num1+ "%" +num2+ "=" +result);
				break;
				
			default:
				System.out.println(" enter Invalid Operator");
				break;

		}


			
			
			sc.close();
			

	}
	

}
