package org.java.condition;

import java.util.Scanner;

public class ifEx6 {
	public static void main(String[] args) {
		System.out.println("조건이 if");
		System.out.println("점수(정수)를 입력해서 학점을 구해보세요");
//		Scanner 클래스를 이용, 중첩 if문 이용해서 프로그래밍 해보세요
		Scanner scn=new Scanner(System.in);
		int grade=scn.nextInt();
		
		if(grade>=90) {
			if(grade>=95) {
				System.out.println("A+");	
			}else {
				System.out.println("A-");	
			}
		}else if (grade>=80) {
			if(grade>=85) {
				System.out.println("B+");
			}else {
				System.out.println("B-");
			}
		}else if (grade>=70) {
			if(grade>=75) {
				System.out.println("C+");
			}else {
				System.out.println("C-");
			}
		}else if (grade>=60) {
			if(grade>=65) {
				System.out.println("D+");
			}else {
				System.out.println("D-");
			}
		}else {
			System.out.println("F");
		}
		
	}
}

