package com.capgemini;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;


class MyConsumer implements Consumer<Integer>{
	public void accept(Integer t) {
		System.out.println("Method2 value::"+t);
	}
}
public class mathOperationApp {
    
   public static void main(String[] args) {
	  
	  ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(23,28,98,47,23,12,24));
	  Function<Integer,Double> doubleFunction=Integer->(Double.valueOf(Integer));
	  numbers.forEach(n->{
		  System.out.println("Applyong double function "+doubleFunction.apply(n));
	  });
	  
   }
}