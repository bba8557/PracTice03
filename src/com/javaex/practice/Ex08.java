package com.javaex.practice;

public class Ex08 {
	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			System.out.println("");
			for (int dan = 2; dan < 10; dan++) {
				System.out.print(dan + "*" + i + "=" + (dan * i) + "\t");
			}
		}
	}
}
