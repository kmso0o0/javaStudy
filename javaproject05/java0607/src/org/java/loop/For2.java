package org.java.loop;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		System.out.println("for��");
		// ������
//		�� 2 3456789
//		�� 123456789
		for(int i=2; i<10; i++) {
			System.out.println(i+"���Դϴ�");
			for(int j=1; j<10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		System.out.println("====================");
		
//		9�ܺ��� 2�ܱ��� �������� ���, for
//		9*9~2*1
		for(int o=9; o>1; o--) {
			System.out.println(o+"���Դϴ�");
			for(int p=9; p>0; p--) {
				System.out.println(o+"*"+p+"="+(o*p));
			}
		}
		System.out.println("====================");
		
//		ScannerŬ���� �̿��ؼ� ���۴��� �Է¹޾Ƽ� �������� �Է´�~9�ܱ��� ���
		Scanner scn=new Scanner(System.in);
		
		System.out.println("���۴��� �Է��ϼ���");
		int gu = scn.nextInt();
		
		System.out.println("������ �Է��ϼ���");
		int e = scn.nextInt();
		
		System.out.println(gu+" "+e);
		if(gu>e) {
			System.out.println("���۴��� ���ܺ��� ũ�ų� ���ƾ��մϴ�.");
		}else {
		for(int k=gu; k<e+1; k++) {
			System.out.println(k+"���Դϴ�");
//			1~9
			for(int d=1; d<10; d++) {
				System.out.println(k+"*"+d+"="+(k*d));
				}
			}
		}
		
		scn.close();
		
		
		
		
		
		
	}
}