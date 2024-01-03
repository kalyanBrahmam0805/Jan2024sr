package com.kodnest.Recursion;

public class gcdapp {
static int gcdd(int m,int n) {
	if(n==0)
	{
		return m;
	}
	else
	{
		return gcdd(n,m%n);
	}
}
}
