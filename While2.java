package org.java.loop;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		System.out.println("while");
		// ������ 2��~9��
		int i=2;
		while(i<10) {
			System.out.println(i+"���Դϴ�");
			
			int j=1;
			while(j<10) {
				System.out.println(i+"*"+j+"="+(i+j));
				j++;
			}
			
			i++;
			
		}
		
		System.out.println("===========================");
		
//		Scanner���� �Է´�(����)�� �̿��ؼ� �������� ����غ�����.
//		��) 4�Է��ϸ� 4�ܺ��� 9�ܱ��� ���
		Scanner scn=new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���");
		int dan = scn.nextInt();
		while(dan<10) {
			System.out.println(dan+"���Դϴ�");
			
			int dani=1;
			while(dani<10) {
				System.out.println(dan+"*"+dani+"="+(dan*dani));
				dani++;
			}
			dan++;
		}
		
		
		
		
		
	}
}