package org.java.varable2;

//Ŭ���� VarSub
public class VarSub {

	//���: �ʵ�, �ż���, ������
	
	//�ʵ�(�Ӽ�)
	public int num1;//�ν��Ͻ� ���(����)
	public static int num2;//Ŭ���� ���(����)
	private int num3;

	public void sum() {
		System.out.println(num1+num2);
	}
	//�ν����� �ż��� method
	public void method(int num1, int num2) {
		
		//��������(�ż���) num1, num2, num3
		int num3=num1+num2;
		
		System.out.println(num3);
	}
	
}
