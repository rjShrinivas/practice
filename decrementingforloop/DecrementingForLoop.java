package com.kn.decrementingforloop;

import java.util.Scanner;

public class DecrementingForLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range");
		int num = scan.nextInt();
		for (int i = num; i >= 2; i--) {
			System.out.println(i);
			scan.close();
		}
	}

}
