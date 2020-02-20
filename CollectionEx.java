package com.venki;
import java.util.Scanner;
import java.util.ArrayList;
 class CollectionEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(sc.nextInt());
		for(Integer o:a)
			System.out.println(o);
	}

}
