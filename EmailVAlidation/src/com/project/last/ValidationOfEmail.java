package com.project.last;
import java.util.*;
import java.util.regex.*; 
public class ValidationOfEmail {
public static void main(String[] args) {

List<String> emails = new ArrayList<String>();
// for valid email addresses are  emails.add("vishnu@.com")
//  for invalid email addresses are  emails.add("vardhan.example.com"),

		for (String value : emails)
{
		System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
}
	System.out.println("Enter any email address to check"); 
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));


	}

 public static boolean isValidEmail(String email)
 {  
	 String regex = "^(.+)@(.+)$";
	//initialize the Pattern object
 Pattern pattern = Pattern.compile(regex); 
 Matcher matcher = pattern.matcher(email); 
 			return matcher.matches();
}
}


