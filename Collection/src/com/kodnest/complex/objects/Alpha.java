package com.kodnest.complex.objects;

import java.util.Comparator;

public  class Alpha implements Comparator <Employeee> {
	public int compare(Employeee o1, Employeee o2) {
		{
			if(o1.id>o2.id)
			{
				return 1;
			}
			else
			{
				return -1;
			}
		}
	}
}

