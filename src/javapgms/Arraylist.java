package javapgms;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a= new ArrayList<String>();
		
		
		a.add("Joshua");
		a.add("Jiljo");
		a.add("Jimosn");
		a.add("juby");
		System.out.println(a);
		a.add(a.size()+1, "Deepthi"); //if we have 4 elements in list, if we are trying to add value to 7 th index, it will throw error
		System.out.println(a);
		

	}

}
