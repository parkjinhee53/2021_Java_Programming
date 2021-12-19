/*
 * 과제: J5
 * 이름: 박진희
 * 학번: 202014015
 */
public class AirplaneEX {
	public static void main(String[] args) {
		Airliner a = new Airliner("A100"); // 객체 생성
		a.showInfo(); // 정보 출력
		System.out.println(); // 한줄 띄어쓰기
		Airliner b = new Airliner("A200", 500); // 객체 생성
		b.showInfo(); // 정보 출력
		System.out.println(); // 한줄 띄어쓰기
		
		Fighter f = new Fighter("F300"); // 객체 생성
		f.showInfo(); // 정보 출력
		System.out.println(); // 한줄 띄어쓰기
		Fighter g = new Fighter("F400", true); // 객체 생성
		g.showInfo(); // 정보 출력
		System.out.println(); // 한줄 띄어쓰기
	}
}