package org.java.condition;

import java.util.Scanner;

public class Switch5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("������ �Է�");
		int num = scn.nextInt(); //�����Է�(����)
		char grade = ' ';
		
		switch (num/10) { //�����Է�(����)
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
		System.out.println("���� :"+ grade);
		scn.close();
	}
}