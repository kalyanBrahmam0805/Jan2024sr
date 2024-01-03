package com.kodnest.Hybridlevelinhertiance;

public class personapp {
	public static void main(String[] args) {
	person p=new person();
	engstudent es=new engstudent();
	bcomstudent bs=new bcomstudent();
	javateacher jt=new javateacher();
	testingteacher tt=new testingteacher();
	System.out.println(p.name+" "+es.name+ " "+bs.name+" "+jt.name+" "+tt.name);
}
}