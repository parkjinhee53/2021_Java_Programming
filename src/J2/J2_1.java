/*
 * 과제: J2_1
 */

import java.util.Scanner; // Scanner 사용하기 위해 import문 사용

public class J2_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner 클래스로 입력받기
		int i; // 반복문에서 시용할 변수 정의
		int sum = 0; // 배수에 속하는 수들의 합을 저장
		int result = 0; // 배수를 제외한 수들의 합을 저장
		
		System.out.print("시작: "); // 시작 수 입력받기
		int start = scanner.nextInt();
		
		System.out.print("종료: "); //종료 수 입력받기
		int end = scanner.nextInt();
		
		System.out.print("배수: "); // 배수 입력받기
		int mul = scanner.nextInt();
		
		for(i=start; i<=end; i++) // 반복문, i를 start로 초기화하고 end까지 반복, 1씩 증가
		{
			if (i%mul == 0) // 입력한 수의 배수이면
			{
				sum += i; // sum에 저장
			}
			else // 배수가 아니면
			{
				result += i; // result에 저장
			}
		}
		
		System.out.println(start + "부터 " + end + "까지 "+ mul + "의 배수에 속하는 수들의 합: " +sum);
		System.out.println(start + "부터 " + end + "까지 "+ mul + "의 배수를 제외한 수들의 합: " +result);
		scanner.close(); // scanner 객체 종료
	}
}
