package Arryas_List;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrayas_list1 {
	
	public static void main(String[] args) {
		
		ArrayList AL = new ArrayList ();
		
		AL.add(111);  // int                      add() is a method , ArraysList is class Implemented from List Interface
		AL.add("Vinayak");  // String 
		AL.add(98.85); // double
		AL.add('A');  //Char
	    AL.add(true);  // boolean
	    AL.add(111);  // dublicate value allow
	    AL.add(null);  // Null value Allow
	   
	    
	    System.out.println(AL);       // Print Arrays (all).
	    
	    System.out.println("size of arrays :- "+ AL.size());     // size of arrays
	    
	  //  AL.remove(2);               // Remove by index no
	    System.out.println(AL);
	    AL.remove(98.85);             // remove by oject name
	    System.out.println(AL);
	    
	  // insert new element 
	    AL.add(2, 98.85);
	    System.out.println(AL);
	    AL.add(3,"Python");           // add by index no
	    System.out.println(AL);
	    
	    // retrive specifice element 
	    System.out.println(AL.get(3));
	    System.out.println(AL.get(5));
	    
	    // change element or replace 
	    AL.set(3,"Ruby");
	    System.out.println(AL);
	    AL.set(3,"Python");
	    System.out.println(AL);
	    
	    
	    //contains - search element // true or false--boolean
	    System.out.println(AL.contains("Python"));
	    System.out.println(AL.contains("Ruby"));
	    
	    
	    //isEmpty
	    System.out.println(AL.isEmpty());
	   System.out.println(AL.isEmpty()); 
	    
	    System.out.println();
	    
	    
	    //read print data from arrayslist 
	    System.out.println("reading element using for loop");
	    
	    for(int i=0; i<AL.size(); i++) {
	    	System.out.println(AL.get(i));
	    }
	    
	    System.out.println();
	    System.out.println("reading element using for each loop ");
	    
	    for(Object ob:AL) {
	    	System.out.println(ob);
	    }
	    System.out.println();
	    
	    //Iterator 
	    System.out.println("reading element using iterator");
	    
	    Iterator it=AL.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
	    
	    //----------------revise daily ------------------------//
	    
	    
	    AL.remove(98.85);              // remover double value from list
	    System.out.println(AL);
	    
	    AL.remove(Integer.valueOf(111));   // remove  int value from *object*(coktail) arraylist
	    System.out.println(AL);
	    
	    AL.remove(Character.valueOf('A'));  // remove  char value from *object*(coktail) arraylist
	    System.out.println(AL);
		
		
		
	}

}
