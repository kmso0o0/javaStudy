package org.java.condition;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("���� �� �� �Է�");

		char ch =scn.next().charAt(0);
		
		switch (ch) {
		case 'A':
		case 'a':
			System.out.println("A�Դϴ�");
			break;
		case 'B':
		case 'b':
			System.out.println("B�Դϴ�");
			break;
		case 'C':
		case 'c':
			System.out.println("C�Դϴ�");
			break;
		default:
			System.out.println("A, B, C�̿��� ���ĺ��Դϴ�");
		}
		scn.close();

	}
}
