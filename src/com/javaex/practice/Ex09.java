package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {

		for (int num = 1; num <= 10; num++) {
			for (int num2 = num; num2 <= 10 + num; num2++) {
				System.out.print(num2 + "\t");
			}
			System.out.println("");
		}
	}
}
