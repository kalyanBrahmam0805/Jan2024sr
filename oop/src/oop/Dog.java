package oop;

	public class Dog {
		String name;
		int age;
		String breed;
		String color;
		
		void eat()
		{
			System.out.println(name+" Dog is eating");
		}
		void sleep()
		{
			System.out.println(name+" "+color+" coloured Dog is sleeping");
		}
		void bark()
		{
			System.out.println("Angry "+name+" "+color+" coloured Dog Which is aged  "+age+" Years is Barking");
		}
		public Dog() {
			name="lobo";
			breed="Bull Dog";
			age=5;
			color="Brown";
		}
		public Dog(String a)
		{
			name=a;
			breed="GS";
			age=4;
			color="Black";
		}
		public Dog(String a,String b)
		{
			name=a;
			breed=b;
			age=6;
			color="Golden";
		}
		public Dog(String a,String b,int c)
		{
			name=a;
			breed=b;
			age=c;
			color="White";
		}
		public Dog(String a,String b,int c,String d)
		{
			name=a;
			breed=b;
			age=c;
			color=d;
		}
		public Dog(String a, int c)
		{
			name=a;
			age=c;
		}
		public Dog(String a,String b, String c)
		{
			name=a;
			breed=b;
		   color=c;
		}
	}

		
		
				
		
		
	

