package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();

		int n = 0;
		for (int i = n; i <= num; i++) {
			n = i + n;
		}
		System.out.println("합계: " + n);

		sc.close();
	}
}
