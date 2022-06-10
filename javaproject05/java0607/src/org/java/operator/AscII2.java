package org.java.operator;

import java.util.Scanner;

public class AscII2 {

	public static void main(String[] args) {
		System.out.println("대문자 또는 소문자를 입력해 주세요(65~90 && 97~112)");

		Scanner scn = new Scanner(System.in);
		int alpa = scn.nextInt();
		if (alpa > 64 && alpa < 91) {
			System.out.println("입력값 :" + alpa);
			System.out.println("대문자 :" + (char) alpa);

			int upalpa = alpa + 32;
			System.out.println(upalpa);
			System.out.println("소문자 :" + (char) upalpa);
		} else if (alpa > 96 && alpa < 113) {
			System.out.println("입력값 :" + alpa);
			System.out.println("소문자 :" + (char) alpa);

			int downalpa = alpa - 32;
			System.out.println(downalpa);
			System.out.println("대문자 :" + (char) downalpa);
		} else {
			System.out.println("다시 65~90 && 97~112 정수입력해주세요");
		}
	}
}
