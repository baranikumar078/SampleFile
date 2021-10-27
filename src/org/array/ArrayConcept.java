package org.array;



public class ArrayConcept {

	public static void main(String[] args) {
	 String a[]=new String[5];
	 a[0]="Best ";
	 a[1]="in ";
	 a[2]="the";
	 a[3]="World";
	 a[4]=".";

   for (String i : a) {
	System.out.println(i);
}
   int b[]=new int[4];
	 b[0]=10;
	 b[1]=20;
	 b[2]=30;
	 b[3]=40;
	
	for (int i = 0; i < 3; i++) {
		System.out.println(b[i]);
	}	

	}
	
}
