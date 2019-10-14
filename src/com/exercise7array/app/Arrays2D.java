package com.exercise7array.app;

public class Arrays2D {

	public static void main(String[] args) {
		final int Rows=10;
		final int Cols=10;
		
		int cont=1;
		
		//array2D
		int [][] matrix= new int [Rows][Cols];
		
		//first cycle for 1 row x row 
		for (int i=0; i<Rows; i++) {
			for (int j=0; j<Cols; j++) {
				matrix[i][j]=cont;
				cont++;
				System.out.print(matrix[i][j]+" ");
				
			}
			System.out.println(" ");
		}

	}

}
