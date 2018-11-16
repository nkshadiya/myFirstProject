package com.example;

public final class Immutable {
	
	private final int a;
	private final String b;
	private final Mutable c;
	
	
	public Immutable(int a, String b, Mutable c) {

		this.a = a;
		this.b = b;
		this.c = new Mutable(c.getMutable());
	}
	
	
	public int getA() {
		return a;
	}
	public String getB() {
		return b;
	}
	
	public Mutable getC() {
		return new Mutable(c.getMutable());
	}
		

}
