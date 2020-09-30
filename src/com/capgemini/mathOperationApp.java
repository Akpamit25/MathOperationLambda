package com.capgemini;
import java.util.*;
import java.util.function.Predicate;

public class mathOperationApp {
    
   public static void main(String[] args) {
	  
	  ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(23,28,98,47,23,12,24));
	  Predicate<Integer> isEvenFunction=n->n%2==0;
	  
	  numbers.forEach(n->{
		  System.out.println("Applyong isEvenfunction on  "+n+"  and result is : "+isEvenFunction.test(n));
	  });
	  
   }
}