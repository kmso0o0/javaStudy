package org.java.condition;

import java.util.Scanner;

public class ifEx7 {
	public static void main(String[] args) {
		System.out.println("if문 예제");
		
		System.out.println("국어, 영어, 수학 점수를 입력, 총점, 평균, 학점(평균)");

//		국어, 영어, 수학(0~100정수), 총점(정수), 평균(double)
//		평균을 이용해서 학점 계산 해보세요
//		95이상 A+, 90이상 A
//		85이상 B+, 80이상 B
//		75이상 C+, 70이상 C
//		65이상 D+, 60이상 D
//		60미만 F
		Scanner scn=new Scanner(System.in);
		
		System.out.println("국어 점수:");
		int kor=scn.nextInt();
		System.out.println("영어 점수:");
		int eng=scn.nextInt();
		System.out.println("수학 점수:");
		int math=scn.nextInt();
		int sum=kor+eng+math;
		double avg=(double)sum/3;
		System.out.println("총점 :"+sum+"점");
		System.out.println("평균 :"+avg+"점");
		
		
		if(avg>=90) {
			if(avg>=95) {
				System.out.println("학점 :A+");	
			}else {
				System.out.println("학점 :A-");	
			}
		}else if (avg>=80) {
			if(avg>=85) {
				System.out.println("학점 :B+");
			}else {
				System.out.println("학점 :B-");
			}
		}else if (avg>=70) {
			if(avg>=75) {
				System.out.println("학점 :C+");
			}else {
				System.out.println("학점 :C-");
			}
		}else if (avg>=60) {
			if(avg>=65) {
				System.out.println("학점 :D+");
			}else {
				System.out.println("학점 :D-");
			}
		}else {
			System.out.println("학점 :F");
		}
		
		
		
		
	
		
		scn.close();
		
		
		
		
		
	}
}

