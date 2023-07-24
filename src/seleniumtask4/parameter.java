package seleniumtask4;

import java.util.ArrayList;
import java.util.Set;

public class parameter {
	
	
	private void m1(int a) {
		
	}
	private void m2(int a , int b) {
		
	}
	private void m3 (ArrayList<Integer> i) {
		
	}
	private void m4 (Set<Integer>i) {
		
	}

	public static void main(String[] args) {
		parameter a = new parameter ();
		a.m1(10);
		a.m2(10, 20);
		
		ArrayList<Integer> i = new ArrayList<Integer>();
	    i.add(12);
	    i.add(1212);
	    i.add(12234);
	    a.m3(i);
	    
		
		
		

	}

}
