package com.project.assistes3;
import java.io.*; 
public class FileHandling1{ 
 public static void main(String[] args){         //Reading an Existing file        
	 try         { 
	        
	 FileReader r = new FileReader("C:\\Users\\Vishnu Vardhan\\OneDrive\\Desktop\\project");          
	 try             {                 int i; 
	   while((i=r.read())!=-1) 
	                { 
	                    System.out.print((char)i); 
  }    
	                }     finally 
	            { 
	               r.close(); 
	                System.out.print("\n"); 
	                System.out.print("File Closed successfully.");       
	                }       
	            } 
	        catch(IOException e) 
	        { 
	            System.out.println("Exception handled.."); 
	        
	        }
	    
 }
	} 



