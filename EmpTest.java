package com.venki;
class emp {
	
	int eno=101;
	void display() {
		System.out.println(eno);
	}
}

class manager extends emp{
	void display() {
		System.out.println("Manager class");
	}
}

class EmpTest{
	public static void main(String[] args) {
		
		manager m=new manager();
		
		m.display();
		
	}

}
