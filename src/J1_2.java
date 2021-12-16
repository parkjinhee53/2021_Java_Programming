/*
 * 과제: J1_2
 */

import java.util.Scanner; // Scanner를 사용하기 위해 import문 사용

public class J1_2 {
	public static void main(String[] args) {
		double min; // 가장 작은 실수 저장할 변수
		Scanner num = new Scanner(System.in); // Scanner 클래스로 입력받기
		
		System.out.print("첫 번째 실수를 입력하세요: ");
		double x = num.nextDouble(); // 실수 읽기 
		
		System.out.print("두 번째 실수를 입력하세요: ");
		double y = num.nextDouble(); // 실수 읽기
		
		System.out.print("세 번째 실수를 입력하세요: ");
		double z = num.nextDouble(); // 실수 읽기 
		
		if((x <= y) && (x <= z)) // x가 y,z보다 작거나 같다면
			min = x;
		else if((y <= x) && (y <= z)) // y가 x,z보다 작거나 같다면
			min = y;
		else // z가 x,y보다 작거나 같다면
			min = z;
		System.out.println("세 실수 중 가장 작은 수는 " + min + "입니다.");
		num.close(); // num 객체 종료
	}

}