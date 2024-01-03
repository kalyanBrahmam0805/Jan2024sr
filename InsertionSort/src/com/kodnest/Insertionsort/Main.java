package com.kodnest.Insertionsort;
//
//import arrays.Scanner;
//import arrays.SearchingandSorting;
//import arrays.String;
//import arrays.Student;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) 
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("How many objects you want to create");
			int noo=scan.nextInt();
			Student arr[]=new Student[noo];
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.println("Enter ID");
				int id=scan.nextInt();
				System.out.println("Enter Name");
				String name=scan.next();
				System.out.println("Enter marks");
				int marks=scan.nextInt();
				arr[i]=new Student(id, name, marks);
			}
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.print(arr[i].id+" "+arr[i].name+" "+arr[i].marks+" | ");
			}
			System.out.println();
			System.out.println("Enter Name to search in array using linear search:");
			String s=scan.next();
			SearchingandSorting.linearSearch(arr, s);
			System.out.println("Enter Id to search using binary search");
			int search=scan.nextInt();
			SearchingandSorting.binarySearch(arr, search);
			System.out.println("Do you want to sort the array enter true or false");
			boolean res=scan.nextBoolean();
			if(res) {
				SearchingandSorting.selectionSort(arr);
				for(int i=0;i<arr.length;i++) {
					System.out.print(arr[i].id+" "+arr[i].name+" "+arr[i].marks+" | ");
				}
			}
		
			
		}
	}
	class Student {
		int id;
		String name;
		int marks;
		public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		}
		public void study()
		{
		System.out.println(name+" is studying");
		}
	}
	class SearchingandSorting{
		static void linearSearch(Student[] arr,String search) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i].name.equals(search)) {
					System.out.println("Name found at Position "+(i+1));
					return;
				}
			}
			System.out.println("Name not found");
		}
		static void binarySearch(Student arr[],int key) {
			SearchingandSorting.selectionSort(arr);
			int low=0;
			int high=arr.length-1;
			while(low<=high) {
				int mid=(low+high)/2;
				if(arr[mid].id==key) {
					System.out.println("Id found ");
					return;
				}
				else if(key>arr[mid].id) {
					low=mid+1;
				}
				else {
					high=mid-1;
				}
			}
			System.out.println("Id not found");
		}
		static void selectionSort(Student[] arr) {
			for(int i=0;i<arr.length;i++) {
				int min=arr[i].id;
				int pos=i;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j].id<min) {
						min=arr[j].id;
						pos=j;
					}
				}
				Student temp=arr[i];
				arr[i]=arr[pos];
				arr[pos]=temp;
			}
		}
	

}

