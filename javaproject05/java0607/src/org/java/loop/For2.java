package org.java.loop;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		System.out.println("for문");
		// 구구단
//		단 2 3456789
//		하 123456789
		for(int i=2; i<10; i++) {
			System.out.println(i+"단입니다");
			for(int j=1; j<10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		System.out.println("====================");
		
//		9단부터 2단까지 구구단을 출력, for
//		9*9~2*1
		for(int o=9; o>1; o--) {
			System.out.println(o+"단입니다");
			for(int p=9; p>0; p--) {
				System.out.println(o+"*"+p+"="+(o*p));
			}
		}
		System.out.println("====================");
		
//		Scanner클래스 이용해서 시작단을 입력받아서 구구단을 입력단~9단까지 출력
		Scanner scn=new Scanner(System.in);
		
		System.out.println("시작단을 입력하세요");
		int gu = scn.nextInt();
		
		System.out.println("끝단을 입력하세요");
		int e = scn.nextInt();
		
		System.out.println(gu+" "+e);
		if(gu>e) {
			System.out.println("시작단이 끝단보다 크거나 같아야합니다.");
		}else {
		for(int k=gu; k<e+1; k++) {
			System.out.println(k+"단입니다");
//			1~9
			for(int d=1; d<10; d++) {
				System.out.println(k+"*"+d+"="+(k*d));
				}
			}
		}
		
		scn.close();
		
		
		
		
		
		
	}
}
