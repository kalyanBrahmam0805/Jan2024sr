package Implemantationofstack;

import java.util.LinkedList;

public class LinkedListStack {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		Long time1=System.currentTimeMillis();
		System.out.println(time1);
		System.out.println("====================");
		for(int i=0;i<=10000000;i++)
		{
			ll.push(i);
		}
		Long time2=System.currentTimeMillis();
		System.out.println(time2);
		System.out.println("======================");
		System.out.println("Time Taken to push 1000000 is "+" "+(time2-time1)+" ms"+ " ");

	}

}
