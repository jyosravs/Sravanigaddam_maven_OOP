package com.taskepam.maven_OOP;
import java.util.Comparator;

	public class SortQuantity implements Comparator<gifts>{
		
		public int compare(gifts chocolate1, gifts chocolate2) 
	    { 
	        return chocolate1.quantity - chocolate2.quantity; 
	    } 
	}
