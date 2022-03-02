package com.project2;
	class privateaccessspecifier 
	{ 
	   private void display() 
	    { 
	        System.out.println("You are using private access specifier"); 
	    } 
	} 

	public class accessSpecifiers2 {

		public static void main(String[] args) {
			//private
			System.out.println("Private Access Specifier");
			privateaccessspecifier  obj = new privateaccessspecifier(); 
	    

		}

}
