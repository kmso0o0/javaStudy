package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("국어 점수 입력");
		int i1=scn.nextInt();
		System.out.println("국어:"+i1);
		
		System.out.println("영어 점수 입력");
		int i2=scn.nextInt();
		System.out.println("영어:"+i2);
		
		System.out.println("수학 점수 입력");
		int i3=scn.nextInt();
		System.out.println("수학:"+i3);
		
		System.out.println("총점:"+(i1+i2+i3));
		System.out.println("평균:"+(((double)i1+i2+i3)/3));
		
		
		
		scn.close();
	}
}
