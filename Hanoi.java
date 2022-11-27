/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hanoi;


import java.util.Scanner;

public class Hanoi {


	private static String mover(int O, int D) {
                    return(O + " -> " + D);
	}


	static void hanoi(int n, int O, int D, int T) {

		if (n > 0) {
			hanoi(n - 1, O, T, D);
			mover(O, D);
			hanoi(n - 1, T, D, O);
		}

	}

	
	public static void main(String[] args) {

		int n; 

		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número de discos: ");
		n = entrada.nextInt();

		
		Hanoi.hanoi(n, 1, 3, 2);
	}
}