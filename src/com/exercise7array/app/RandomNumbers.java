package com.exercise7array.app;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		final int Elements_Array =100;
		
		double generatedNumber=0;
		int generatedNumberInt=0;
		byte generatedNumberByte=0;
		byte evenValues=0;
		byte oddValues=0;
		byte zeroValues=0;
		byte positiveValues=0;
		byte negativeValues=0;
		
		//Process
		byte[] miArray1= new byte [Elements_Array];
		
		//Way 1 -> random
		Random randomNumbers = new Random(System.nanoTime()); //de tener un numero definido entonces no 
		//genera una serie aleatoria. Para ello es necesario el nanoTime(). 
		
		for (int i=0; i<Elements_Array;i++) {
			generatedNumber = randomNumbers.nextDouble();
			System.out.println(generatedNumber);
		}
		for (int i=0;i<Elements_Array;i++) {
			generatedNumberInt = randomNumbers.nextInt(51)+50;
			
			System.out.println(generatedNumberInt);
		}
		//Way 2 -> random Math Class
		for (int i=0; i<Elements_Array;i++) 
		{
			generatedNumberInt= (int) (Math.random()*50+51);
			System.out.println(generatedNumberInt);
		}
		//Start
		for (int i=0; i<miArray1.length;i++) {
			generatedNumberByte= (byte) randomNumbers.nextInt(101);
			//System.out.println();
			miArray1[i]=generatedNumberByte;
		}
		//Second round ->process
		for (int i=0; i<Elements_Array;i++) {
			if (miArray1[i]==0) {
				zeroValues++;
			}
			else if (miArray1[i]%2==0) {
				evenValues++;
			}
			else if (miArray1[i]%2==0) {
				oddValues+=1;
		}
			else if (miArray1[i]>0) {
				positiveValues+=1;
			}
			else if (miArray1[i]<0) {
				negativeValues+=1;
			}
		//Third round -> output
		System.out.println("Zeros: "+zeroValues);
		System.out.println("Odds: "+oddValues);
		System.out.println("Even: "+evenValues);
		System.out.println("Positives: "+positiveValues);
		System.out.println("Negatives: "+negativeValues);
		
	}
	}
}
