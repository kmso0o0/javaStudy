package org.java.condition;

import java.util.Scanner;

public class Switch8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("ù��° ����(����) �Է�");
		int num1 = scn.nextInt();
		
		System.out.println("�ι�° ����(����) �Է�");
		int num2 = scn.nextInt();
		
		System.out.println("���� ��ȣ�� �Է��ϼ���(+-*/)");
		String op = scn.next();
		
		switch(op) {
		case "+":
			System.out.println(num1+"+"+num2+"="+((double)num1 + num2));
			break;
		case "-":
			System.out.println(num1+"-"+num2+"="+((double)num1 - num2));
			break;
		case "*":
			System.out.println(num1+"*"+num2+"="+((double)num1 * num2));
			break;
		case "/":
			System.out.println(num1+"/"+num2+"="+((double)num1 / num2));
			break;
		default:
			System.out.println("������ �Է¿���");
		}
		
		scn.close();
		}
		
	}
