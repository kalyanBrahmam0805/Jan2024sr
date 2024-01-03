package com.kod.customexception;

import java.util.Scanner;

public class DrivingLicense {

	public void applyDL() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur age");
		int age=sc.nextInt();
		if(age>=18 && age<=65)
		{
			System.out.println("Take ur DL");
		}
		else
		{
			System.out.println("Not Eligible for DL");
		}
	}
		class DrivingLicApp{
			public static void main(String[] args) {
			DrivingLicense Dl=new DrivingLicense();
				Dl.applyDL();
			}
		}
	}


