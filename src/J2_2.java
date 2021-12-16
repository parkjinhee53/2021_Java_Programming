/*
 * 과제: J2_2
 */

import java.util.Scanner; // Scanner 사용하기 위해 import문 사용

public class J2_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner 클래스로 입력받기
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 단위를 배열에 저장
		int i; // 반복문에 사용할 변수 정의
		int a[] = new int[unit.length]; // 금액이 unit 배열에 있는 단위로 각각 몇 개씩 환산되는지를 저장할 배열 선언과 초기화
		
		System.out.print("금액을 입력하시오: "); // 금액 입력받기
		int money = scanner.nextInt();
		
		for (i = 0; i < unit.length; i++) // i를 0으로 초기화하고 unit 배열 길이만큼 반복
		{
			a[i] = money /unit[i]; // 입력받은 금액을 unit 배열에 있는 단위로 순서대로 나눴을 때 몫을 저장
			money = money % unit[i]; // unit 배열에 있는 단위로 나눈 나머지를 다시 다른 단위로 나누기 위해 money에 저장
			if (a[i] == 0) // 환산되는 개수가 0이면
			{ 
				continue; // 다음 반복으로 진행
			}
			System.out.println(unit[i] + "짜리: " + a[i] + "개");
			scanner.close(); // scanner 객체 종료
		}
	}

}
