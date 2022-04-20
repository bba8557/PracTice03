package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = sc.nextInt();
		int num = 1;

		for (int i = n; i > 0; i--) {
			num = num*i;
		}
		System.out.println("결과값: " + num);

		sc.close();
	}
}
