package org.java.loop;

public class For1 {
	public static void main(String[] args) {
		System.out.println("for문");
		
		for(int i=0;i<10;i++) {
//			System.out.println(i);
//			System.out.println(i+" ");
//			1~10까지 콘솔에 출력
//			마지막 ,를 제거해보세요, if문 사용
//			int i2=i+1;
//			System.out.println(i2);
//			if(i==9) {
//				System.out.println((i+1));
//			}else {
//				System.out.println((i+1)+", ");
//			}
			
			if(i==9) {
				System.out.println((i+1));
				break;// 하위 명령문을 실행 안하고 반복문이 종료
			}
			
			System.out.println((i+1)+",");
			
		}//break문
		
		
		
		for(int i=0; i<10; i++) {
//			String url="";
			System.out.println("url(img/bg"+i+".jpg) no-rpeat 50%/cover");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
