package org.java.varable;

public class VarEx1 {

	public static void main(String[] args) {
		
		System.out.println("변수");
		
		
		int a;// 데이터 타입이 int(정수형 4바이트)형인변수 a를 선언 했다.
		a=1000;// 변수a를 1000으로 초기화 했다.
		
		int a2=100;// 혈당(메모리(저장공간)에 변수);
		
		System.out.println("java의 primitive type");
		// 1byte = 8bit  -2^7~+2^7-1  -128~+127
		
		//정수형 데이터
		byte b=10;// 정수형 데이터 1byte를 저장할 수 있는 변수 b를 선언하고 10으로 초기화 했다.
		short s=10;// 정수형 데이터 2byte를 저장할 수 있는 변수 s를 선언하고 10으로 초기화 했다.
		int i=10;// 정수형 데이터 4byte를 저장할 수 있는 변수 i를 선언하고 10으로 초기화 했다.
		long l=10l;// 정수형 데이터 8byte를 저장할 수 있는 변수 l를 선언하고 10으로 초기화 했다.
		//실수형 데이터
		float f=1.1f;// 실수형 데이터 4byte를 저장할 수 있는 f를 선언하고 1.1f로 초기화 했다.
		double d=(float)1.1;// 실수형 데이터 8byte를 저장할 수 있는 f를 선언하고 1.1f로 초기화 했다.
		
		char ch='a';// 문자형 데이터 2byte를 저장할 수 있는 변수 ch를 선언하고 'a'로 초기화 했다.
		
		boolean bool=false;//boolean형 1byte를 저장할 수 있는 변수 bool을 선언하고 false로 초기화 했다.
		
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

