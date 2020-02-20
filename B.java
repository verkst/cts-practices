package com.venki;

class B extends A {
	public static void main(String[] args) {
		A aa;

		aa=new B();
		aa.display();
		
		aa=new A();
		aa.display();
		
	}
	void display() {
		System.out.println("Child Class");
	}
}

class A{
	void display() {
		System.out.println("Parent class");
	}
}