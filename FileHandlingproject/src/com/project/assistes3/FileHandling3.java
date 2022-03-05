package com.project.assistes3;
import java.io.*;  
public class FileHandling3 { 
 public static void main(String[] args){          // Append text to Existing File. 
	 
	  String path = "C:\\Users\\Vishnu Vardhan\\OneDrive\\Desktop\\project\\demo.txt"; 
	  String text = "  Currently doing training at Simplilearn";       
	         try 
	         { 
	       	 FileWriter f = new FileWriter(path,true);         
	       f.write(text); 
	       f.close(); 
	        System.out.println("Append done Successfully..");      
	        } 
	         		catch(IOException e){      
	      	  System.out.println(e); 
	         }     
	  } 
}
