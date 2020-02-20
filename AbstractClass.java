package com.venki;

public class AbstractClass {

	public static void main(String[] args) {
		
		Animal a;
		a=new Tiger();
		a.eat();
		a=new Goat();
		a.eat();

	}

}

abstract class Animal{
	abstract void eat();
}
class Tiger extends Animal{
	void eat() {
		System.out.println("I eat only Non-veg");
	}
}
class Goat extends Animal{
	void eat() {
		System.out.println("I eat only Veg");
	}
}
