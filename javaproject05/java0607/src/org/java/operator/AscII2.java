package org.java.operator;

import java.util.Scanner;

public class AscII2 {

	public static void main(String[] args) {
		System.out.println("�빮�� �Ǵ� �ҹ��ڸ� �Է��� �ּ���(65~90 && 97~112)");

		Scanner scn = new Scanner(System.in);
		int alpa = scn.nextInt();
		if (alpa > 64 && alpa < 91) {
			System.out.println("�Է°� :" + alpa);
			System.out.println("�빮�� :" + (char) alpa);

			int upalpa = alpa + 32;
			System.out.println(upalpa);
			System.out.println("�ҹ��� :" + (char) upalpa);
		} else if (alpa > 96 && alpa < 113) {
			System.out.println("�Է°� :" + alpa);
			System.out.println("�ҹ��� :" + (char) alpa);

			int downalpa = alpa - 32;
			System.out.println(downalpa);
			System.out.println("�빮�� :" + (char) downalpa);
		} else {
			System.out.println("�ٽ� 65~90 && 97~112 �����Է����ּ���");
		}
	}
}
