package org.java.varable2;

public class PrintlnEx {

	public static void main(String[] args) {
		
		System.out.println(10+10);		//20
		System.out.println(10+"10");	//1010
		System.out.println(10+10+"10");	//2010
		System.out.println(10+"10"+10);	//101010
		System.out.println(10+10+"");	//"20"
		
		System.out.print("�ڵ� �ٹٲ��� ����");
		System.out.printf("%d", 1000);//���� c���� ���� ���
		
		int num1=10;
		int num2=10;
		
		System.out.println(num1+"+"+num1+"="+(num1+num2));
	}
}
