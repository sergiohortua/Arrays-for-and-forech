package com.sergioh.arrays;

public class The1To3Dimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// recorrido de arreglos con for y forech

		// recorrido de un vector
		System.out.println("recorrido de un vector");
		int[] vector = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };// inicializacion del vector de 10 posiciones
		for (int i : vector) {// inicializacion de la iteracion
			System.out.println("se imprime el vector con un forech: " + vector[i]);// instruccion
		}
		System.out.println();
		for (int i = 0; i < vector.length; i++) {// inicializacion de la iteracion
			System.out.println("se imprime el vector con un for: " + vector[i]);// instruccion
		}
		System.out.println();

		// recorrido de un vector de dos dimensiones
		System.out.println("recorrido de un arreglo de dos dimensiones");
		int[][] array2 = { { 1, 2, 3, 4, 5, 6, 7 }, { 7, 6, 5, 4, 3, 2, 1 } };// inicializacion del arreglo 2x7
																				// posiciones
		for (int i = 0; i < array2.length; i++) {// inicializacion de la iteracion 1
			for (int j = 0; j < array2[i].length; j++) {// inicializacion de la iteracion 2
				System.out.print(array2[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (int[] is : array2) {
			for (int i : is) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("recorrido de un arreglo de 3 dimensiones");
		// recorrido de un arreglo de tres
		int[][][] array3 = { { { 1, 2 }, { 3, 4 }, { 5, 6 } }, { { 7, 8 }, { 9, 10 }, { 11, 12 } },
				{ { 13, 14 }, { 15, 16 }, { 17, 18 } } };// inicializacion de arreglo de 3D 3x3x2=18 elementos
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				for (int k = 0; k < array3[i][j].length; k++) {
					System.out.print(array3[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();
	}

}
