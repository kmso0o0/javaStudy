package org.java.condition;

import java.util.Scanner;

public class Switch7 {

	public static void main(String[] args) {
		
		System.out.println("switch��");
		Scanner scn=new Scanner(System.in);
		
		System.out.println("�������� �Է��ϼ���(insert, select, update, delete)");
		String input=scn.next();
		switch(input) {
		case "insert":
			System.out.println("ȸ������ �������� �̵��մϴ�");
			break;
		case "select":
			System.out.println("ȸ����ȸ �������� �̵��մϴ�");
			break;
		case "update":
			System.out.println("ȸ������ �������� �̵��մϴ�");
			break;
		case "delete":
			System.out.println("ȸ��Ż�� �������� �̵��մϴ�");
			break;
		default:
			System.out.println("������ �Է� ����");
		}
		
		scn.close();
		
		System.out.println("java2022".charAt(0));
		System.out.println("java2022".charAt(1));
		System.out.println("java2022".charAt(2));
		System.out.println("java2022".charAt(3));
		System.out.println("java2022".charAt(4));
		
	}
}
