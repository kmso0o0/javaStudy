package org.java.varable;

public class VarEx1 {

	public static void main(String[] args) {
		
		System.out.println("����");
		
		
		int a;// ������ Ÿ���� int(������ 4����Ʈ)���κ��� a�� ���� �ߴ�.
		a=1000;// ����a�� 1000���� �ʱ�ȭ �ߴ�.
		
		int a2=100;// ����(�޸�(�������)�� ����);
		
		System.out.println("java�� primitive type");
		// 1byte = 8bit  -2^7~+2^7-1  -128~+127
		
		//������ ������
		byte b=10;// ������ ������ 1byte�� ������ �� �ִ� ���� b�� �����ϰ� 10���� �ʱ�ȭ �ߴ�.
		short s=10;// ������ ������ 2byte�� ������ �� �ִ� ���� s�� �����ϰ� 10���� �ʱ�ȭ �ߴ�.
		int i=10;// ������ ������ 4byte�� ������ �� �ִ� ���� i�� �����ϰ� 10���� �ʱ�ȭ �ߴ�.
		long l=10l;// ������ ������ 8byte�� ������ �� �ִ� ���� l�� �����ϰ� 10���� �ʱ�ȭ �ߴ�.
		//�Ǽ��� ������
		float f=1.1f;// �Ǽ��� ������ 4byte�� ������ �� �ִ� f�� �����ϰ� 1.1f�� �ʱ�ȭ �ߴ�.
		double d=(float)1.1;// �Ǽ��� ������ 8byte�� ������ �� �ִ� f�� �����ϰ� 1.1f�� �ʱ�ȭ �ߴ�.
		
		char ch='a';// ������ ������ 2byte�� ������ �� �ִ� ���� ch�� �����ϰ� 'a'�� �ʱ�ȭ �ߴ�.
		
		boolean bool=false;//boolean�� 1byte�� ������ �� �ִ� ���� bool�� �����ϰ� false�� �ʱ�ȭ �ߴ�.
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(bool);
		
			
	}
}
