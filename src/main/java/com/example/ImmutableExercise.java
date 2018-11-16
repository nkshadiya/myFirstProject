package com.example;

/**
 * @author nksha
 *
 */
public class ImmutableExercise {

	public static void main(String[] args) {

		Immutable immutable = null;
		immutable= new Immutable(1," hi", new Mutable(2));
		
		System.out.println(immutable.equals(new Immutable(1," hi", new Mutable(2))));
	}
}
