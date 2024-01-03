package com.kod.Maps;

import java.util.HashMap;

public class MapDemo {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		citizen c1=new citizen("Omkar",22,"Male", 70125854, "Koddq@");
		citizen c2=new citizen("Abhyaya",23,"Female",448484489, "Nrestindn@");
		hm.put(100, c1);
		hm.put(120, c2);
		System.out.println(hm);

	}

}
