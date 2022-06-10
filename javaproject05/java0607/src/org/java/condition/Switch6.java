package org.java.condition;

import java.util.Scanner;

public class Switch6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("점수를 입력");
		int num1 = scn.nextInt(); // 정수 입력
		int num2 = scn.nextInt(); // 정수 입력
		char op=scn.next().charAt(0);
		
		int result=0; // 초기화 필요
		// 만약에 op가 (+ - * / %) 하나면
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
		System.out.println("연산의 결과 :" +num1+ " " +op+ " " +num2 + "=" + result);
		
		
		
		scn.close();
	}
}
