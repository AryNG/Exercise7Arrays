
package com.exercise7array.app;

import java.util.Random;

public class PrimosyNoprimos {

	public static void main(String[] args) {
		// primos y no primos
		final int Array = 100;
		
		byte Prime=0;
		boolean isPrime=true;
		
		//vector
		byte [] vector = new byte[Array];
		
		//Objets 
		Random randomNumbers = new Random(System.nanoTime());
		//Poblar el vector
		for (int i=0; i<Array;i++) {
			vector[i]= (byte) randomNumbers.nextInt(101);
			System.out.println(vector[i]);
		}
		for (int i=0;i<Array;i++) {
			isPrime=true;
			for (int j=2;j<vector[i];j++) {
				if(vector[i]%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				Prime++;
			}
		}
		System.out.println("Quantity of prime numbers is: "+Prime);
	}

}
