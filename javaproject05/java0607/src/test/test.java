package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("���� ���� �Է�");
		int i1=scn.nextInt();
		System.out.println("����:"+i1);
		
		System.out.println("���� ���� �Է�");
		int i2=scn.nextInt();
		System.out.println("����:"+i2);
		
		System.out.println("���� ���� �Է�");
		int i3=scn.nextInt();
		System.out.println("����:"+i3);
		
		System.out.println("����:"+(i1+i2+i3));
		System.out.println("���:"+(((double)i1+i2+i3)/3));
		
		
		
		scn.close();
	}
}