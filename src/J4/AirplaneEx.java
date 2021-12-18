/*
 * 과제:J4
 */

import java.util.Scanner; // Scanner 사용하기 위해 import문 사용
public class AirplaneEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 클래스로 입력받기

		Airplane [] plane; // 레퍼런스 변수 plane 선언
		plane = new Airplane[3]; // 레퍼런스 배열 생성
		
		System.out.println("[비행기 정보 입력]");
		for(int i=0; i<plane.length; i++) // plane 배열 길이만큼 반복
		{
			System.out.print("비행기 모델: ");
			String model = sc.next(); // 비행기 모델 입력
			System.out.print("비행기 회사: ");
			String company = sc.next(); // 비행기 회사 입력
			System.out.print("탑승 인원수: ");
			int number = sc.nextInt(); // 탑승 인원수 입력
			plane[i] = new Airplane(model, company, number); // 입력받은 거 객체 배열에 저장
			System.out.println(); // 한줄 띄어쓰기
		}
		
		System.out.println("[주입할 연료 및 비행할 거리 입력]");
		for(int j=0; j<plane.length; j++) // 각 비행기 객체에 대하여 주입할 연료 정보와 비행할 거리 정보를 입력
		{
			System.out.print(plane[j].getModel()+"("+ plane[j].getCompany()+") " + "주입할 연료: ");
			double fuel = sc.nextDouble(); // 연료 입력
			plane[j].addFuel(fuel); // addFuel 메소드 호출
			System.out.print(plane[j].getModel()+"("+ plane[j].getCompany()+") " + "비행할 거리: ");
			double milege = sc.nextDouble(); // 거리 입력
			plane[j].flight(milege); //flight 메소드 호출
			System.out.println(); // 한줄 띄어쓰기
		}
		
		System.out.println("[비행기 정보 출력]");
		for(int k=0; k<plane.length; k++) // 모든 비행기 객체의 정보를 출력하도록 반복
		{
			plane[k].showAirplane(); // 모든 비행기 객체의 정보를 출력
			System.out.println(); // 한줄 띄어쓰기
		}
		
		System.out.println("[누적 승객 인원수 정보 출력]");
		System.out.print("누적 승객 인원수: " + Airplane.p() +"명"); // 누적 승객 인원수 출력
		sc.close(); // sc 객체 종료  	
	}
}
