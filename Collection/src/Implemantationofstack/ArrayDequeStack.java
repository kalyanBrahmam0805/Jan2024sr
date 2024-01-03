package Implemantationofstack;

import java.util.ArrayDeque;

public class ArrayDequeStack {
	public static void main(String[] args) {
		ArrayDeque ad =new ArrayDeque();
		Long time1=System.currentTimeMillis();
		System.out.println(time1);
		System.out.println("==============");
		for(int i=0;i<=1000000;i++)
		{
			ad.push(i);
		}
		Long time2=System.currentTimeMillis();
		System.out.println(time2);
		System.out.println("======================");
		System.out.println("Time Taken to push 1000000 is"+" "+(time2-time1)+"ms"+" ");
		
	}

}
