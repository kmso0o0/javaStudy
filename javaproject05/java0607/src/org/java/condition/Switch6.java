package org.java.condition;

import java.util.Scanner;

public class Switch6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("������ �Է�");
		int num1 = scn.nextInt(); // ���� �Է�
		int num2 = scn.nextInt(); // ���� �Է�
		char op=scn.next().charAt(0);
		
		int result=0; // �ʱ�ȭ �ʿ�
		// ���࿡ op�� (+ - * / %) �ϳ���
		switch(op) { 
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		case '%':
			result=num1%num2;
			break;
		}
		System.out.println("������ ��� :" +num1+ " " +op+ " " +num2 + "=" + result);
		
		
		
		scn.close();
	}
}