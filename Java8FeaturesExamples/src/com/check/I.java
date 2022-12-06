package com.check;

public interface I {
	
	void m1();
	
	default void m2() {
		System.out.println("M2 Default MMethod..!");
	}
}
