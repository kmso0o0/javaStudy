package org.java.condition;

import java.util.Scanner;

public class Switch5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("점수를 입력");
		int num = scn.nextInt(); //점수입력(정수)
		char grade = ' ';
		
		switch (num/10) { //점수입력(정수)
			case 10: //100
			case  9: //90~99
				grade='A';
				break;
			case 8: //80~89
				grade='B';
				break;
			case 7: //70~79
				grade='C';
				break;
			case 6: //60~69
				grade='D';
				break;
			case 5: //50~59
				grade='E';
				break;
			default: //0~49
				grade='F';
			}
		System.out.println("학점 :"+ grade);
		scn.close();
	}
}
