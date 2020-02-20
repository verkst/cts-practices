package com.venki;
import java.util.*;
public class Exercise08ThreadLife {
		public Exercise08ThreadLife() {
		}
	public static void main(String[] args) {
		ThreadQuestion tq=new ThreadQuestion();
		
	}

}
class ThreadQuestion implements Runnable{
	Thread td;
	Scanner sc=new Scanner(System.in);
	String Question[]=new String[10];
	public ThreadQuestion(){
		Question[0]="What is Your Name?";
		Question[1]="What is favourite place?";
		Question[2]="Who is your favourite Hero?";
		Question[3]="What is your favourite food?";
		Question[4]="what is your quote?";
		Question[5]="What is Your Name?";
		Question[6]="What is favourite place?";
		Question[7]="Who is your favourite Hero?";
		Question[8]="What is your favourite food?";
		Question[9]= "what is your quote?";
		td=new Thread();
		td.start();
	}
	public void run() {
		print();
	}
	synchronized void print() {
		
	}
			}
