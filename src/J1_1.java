/*
 * 과제: J1_1
 */

import java.util.Scanner; // Scanner를 사용하기 위해 import문 사용

public class J1_1 {
	public static void main(String[] args) {
		int thisYear = 2021; 
		Scanner scanner = new Scanner(System.in); // Scanner 클래스로 입력받기
		
		System.out.print("이름: ");
		String name = scanner.next(); // 문자열 읽기 
		
		System.out.print("생년: ");
		int year = scanner.nextInt(); // 정수 읽기 
		int age = thisYear - year + 1; // 한국나이 구하기 
		
		System.out.println("이름은 " + name +"이고 " + "나이는 " + age + "입니다.");
		scanner.close(); // scanner 객체 종료
	}
}