package com.kodnest.Hierachciallevelinhertiance;

public class employeeeapp {
	
		public static void main(String[]args)
		{
			employee e=new employee();
			e.name="kalyan";
			e.salary=20000;
			e.work();
			e.doingproject();
			System.out.println(e.name+" "+e.salary);
			System.out.println("=============");
			manager m=new manager();
			m.name="Brahmam";
			m.salary=10000;
			m.work();
			m.doingproject();
			System.out.println(m.name+" "+m.salary);
			System.out.println("=============");
			developer d=new developer();
			d.name="Munna";
			d.salary=10000;
			d.work();
			d.doingproject();
			System.out.println(d.name+" "+d.salary);
			System.out.println("=============");
			testing t=new testing();
			t.name="shyam";
			t.salary=1200;
			t.work();
			t.doingproject();
			System.out.println(t.name+" "+t.salary);
			System.out.println("=============");
			teamlead td=new teamlead();
			td.name="vikram";
			td.salary=2000;
			td.work();
			td.doingproject();
			System.out.println(td.name+" "+td.salary);
				
			}
	}




