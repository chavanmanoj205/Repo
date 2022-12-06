package com.functionalInterface;

import java.util.function.Supplier;

public class ProducerExample {

	public static void main(String[] args) {
		
		Supplier<Integer> v = ()-> CustomrClass.getInt(); 
		
		System.out.println(v.get());
	}
}
