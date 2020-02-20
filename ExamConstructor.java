package com.venki;

public class ExamConstructor {
	
public static void main(String[] args) {
	String name1="pooja lakshmi";
	String name2="yashika";
	System.out.println(name1.equals(name2));
	System.out.println(name1.charAt(2));
	System.out.println(name1.concat(name2));
	System.out.println(name1.indexOf('j'));
	System.out.println(name1.lastIndexOf('a'));
	System.out.println(name1.length());
	System.out.println(name1.replace("lakshmi","Sri"));
	
	StringBuffer sb=new StringBuffer("Hello World");
	
	System.out.println(sb.append("Welcome"));
}
}
