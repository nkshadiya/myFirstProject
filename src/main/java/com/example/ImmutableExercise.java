package com.example;

public class ImmutableExercise {

	public static void main(String[] args) {

		Immutable immutable = null;
		immutable= new Immutable(1," hi", new Mutable(2));
		
		Immutable immutable2;
		immutable2 = immutable;
		
	
		System.out.println(immutable.equals(new Immutable(1," hi", new Mutable(2))));
		
		System.out.println(immutable.equals(immutable2));
		
		System.out.println(immutable.equals(new String("")));
	}
}
