package com.project.maps;


	import java.util.*; 
	public class Map {

		public class Entry {

		}

		public static void main(String[] args) {
			// map
			
			//Hashmap
			HashMap<Integer,String> hm=new HashMap<Integer,String>();      
		      hm.put(1,"  vishnu");    
		      hm.put(2,"vardhan");    
		      hm.put(3,"chary");   
		       
		      System.out.println("\nThe elements of Hashmap are ");  
		      for(java.util.Map.Entry<Integer, String> m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }
		      
		     //HashTable
		       
		      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
		      
		      ht.put(4,"virat");  
		      ht.put(5,"williamson");  
		      ht.put(6,"rashid");  
		      ht.put(7,"pooran");  

		      System.out.println("\nThe elements of HashTable are ");  
		      for(java.util.Map.Entry<Integer, String> n:ht.entrySet()){    
		       System.out.println(n.getKey()+" "+n.getValue());    
		      }
		      
		      
		      //TreeMap
		      
		      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		      map.put(8,"Dhoni");    
		      map.put(9,"raina");    
		      map.put(10,"duplesis");       
		      
		      System.out.println("\nThe elements of TreeMap are ");  
		      for(java.util.Map.Entry<Integer, String> l:map.entrySet()){    
		       System.out.println(l.getKey()+" "+l.getValue());    
		      }    
		      
		   }  


}
