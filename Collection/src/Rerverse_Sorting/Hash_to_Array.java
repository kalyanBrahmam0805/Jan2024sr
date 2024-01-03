package Rerverse_Sorting;

import java.util.HashSet;

//import com.kodnest.complex.objects.Employee;

public class Hash_to_Array {
	public static void main(String[] args) {
		HashSet <Employee>hs=new HashSet<Employee>();
		hs.add(new Employee(1, "Prathiba",123,"Male"));
		hs.add(new Employee(2,"Shivani",133,"Female"));
		hs.add(new Employee(3,"Sharmila",153,"Female"));
		hs.add(new Employee(4,"Kajal",125,"Female"));
		System.out.println(hs);
		Employee arr[]=new Employee[hs.size()];
		hs.toArray(arr);
		for(Employee em:arr)
		{
			System.out.println(em);
		}
		
		
		
		
	}

}
