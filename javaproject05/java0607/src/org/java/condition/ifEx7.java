package org.java.condition;

import java.util.Scanner;

public class ifEx7 {
	public static void main(String[] args) {
		System.out.println("if�� ����");
		
		System.out.println("����, ����, ���� ������ �Է�, ����, ���, ����(���)");

//		����, ����, ����(0~100����), ����(����), ���(double)
//		����� �̿��ؼ� ���� ��� �غ�����
//		95�̻� A+, 90�̻� A
//		85�̻� B+, 80�̻� B
//		75�̻� C+, 70�̻� C
//		65�̻� D+, 60�̻� D
//		60�̸� F
		Scanner scn=new Scanner(System.in);
		
		System.out.println("���� ����:");
		int kor=scn.nextInt();
		System.out.println("���� ����:");
		int eng=scn.nextInt();
		System.out.println("���� ����:");
		int math=scn.nextInt();
		int sum=kor+eng+math;
		double avg=(double)sum/3;
		System.out.println("���� :"+sum+"��");
		System.out.println("��� :"+avg+"��");
		
		
		if(avg>=90) {
			if(avg>=95) {
				System.out.println("���� :A+");	
			}else {
				System.out.println("���� :A-");	
			}
		}else if (avg>=80) {
			if(avg>=85) {
				System.out.println("���� :B+");
			}else {
				System.out.println("���� :B-");
			}
		}else if (avg>=70) {
			if(avg>=75) {
				System.out.println("���� :C+");
			}else {
				System.out.println("���� :C-");
			}
		}else if (avg>=60) {
			if(avg>=65) {
				System.out.println("���� :D+");
			}else {
				System.out.println("���� :D-");
			}
		}else {
			System.out.println("���� :F");
		}
		
		
		
		
	
		
		scn.close();
		
		
		
		
		
	}
}
