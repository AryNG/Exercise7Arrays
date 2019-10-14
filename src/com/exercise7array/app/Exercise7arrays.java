package com.exercise7array.app;

public class Exercise7arrays {

	public static void main(String[] args) {
		final int Elements_Array = 10; // only 10 for practice purposes
		
		int[] intArray = new int[Elements_Array];
		char[] charArray = new char[Elements_Array];
		boolean[] boolArray = new boolean[Elements_Array];
		double[] dblArray = new double[Elements_Array];
		String[] strArray = new String[Elements_Array];
		
		int [] intArray2 = {10,20,30,40,50};
		char [] charArray2 = {'a','b','c','d','e'};
		boolean[] boolArray2 = {true, false, true, false, true};
		double[] dblArray2 = {1.0, 2.0, 3.0, 4.0, 5.0};
		String[] strArray2 = {"First", "Second","third","fourth", "Fifth"};
		
		for (int i=0; i<intArray2.length; i++) {
			System.out.println(intArray2[i]);
		}
		for (int i=0; i<charArray2.length; i++) {
			System.out.println(charArray2[i]);
		}
		for (int i=0; i<boolArray2.length; i++) {
			System.out.println(boolArray2[i]);
		}
		for (int i=0; i<dblArray2.length; i++) {
			System.out.println(dblArray2[i]);
		}
		for (int i=0; i<strArray2.length; i++) {
			System.out.println(strArray2[i]);
		}

	}

}
