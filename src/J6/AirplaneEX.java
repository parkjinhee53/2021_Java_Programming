/*
 * 과제: J6
 * 이름: 박진희
 * 학번: 202014015
 */
package airplane;

public class AirplaneEX {
	public static void main(String[] args) {
		Airliner a = new Airliner("A100", 300); // 객체 생성
		a.showInfo(); // 정보 출력
		System.out.println(); // 한줄 띄어쓰기
		a.takeoff(); // 비행기가 이륙하는 메소드
		a.flight(); // 비행기가 주행하는 메소드
		a.landing(); // 비행기가 착륙하는 메소드
		System.out.println(); // 한줄 띄어쓰기
		
		Fighter f = new Fighter("F300"); // 객체 생성
		f.showInfo(); // 정보 출력
		System.out.println(); // 한줄 띄어쓰기
		f.loadWeapon();  // 무기 목록에 있는 무기 장착하기
		System.out.println(); // 한줄 띄어쓰기
		f.takeoff(); // 비행기가 이륙하는 메소드
		f.flight(); // 비행기가 주행하는 메소드
		f.showWeapon(); // 무기 목록 출력
		f.selectWeapon(); // 무기 선택
		System.out.println(); // 한줄 띄어쓰기
		f.landing(); // 비행기가 착륙하는 메소드

	}
}
