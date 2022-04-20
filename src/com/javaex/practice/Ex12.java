package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();

		int n = 0;

		for (int i = num; i > 0; i = i - 2) {
			n = (i * num);
		}
		System.out.println("결과값: " + n);

		sc.close();
	}
}
