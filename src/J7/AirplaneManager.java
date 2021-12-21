/*
 * 과제: J7
 * 이름: 박진희
 * 학번: 202014015
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class AirplaneManager {
	static Scanner sc = new Scanner(System.in); // Scanner 클래스로 입력받기
	ArrayList<Airplane> a = new ArrayList<Airplane>(); // Airplane 객체로 구체화된 ArrayList 컬렉션에 Airplane 객체를 저장
	
	public int order = 0 ; // AirplaneManager 클래스는 비행기가 등록될 때마다 1씩 증가하는 등록순서 필드
	
	void regist() { //  비행기 등록 기능
		System.out.println("=== 아래 정보를 입력하세요. ===");
		System.out.print("비행기 제조회사: ");
		String company = sc.nextLine(); // 제조회사 입력받기
		System.out.print("비행기 타입정보: ");
		String type = sc.nextLine(); // 타입정보 입력받기
		System.out.println(); // 한줄 띄어쓰기
		
		//  generateID() 메소드로부터 생성된 식별정보 정보와 함께 Airplane 객체를 생성
		String air = generateID(company, type);
		Airplane plane = new Airplane(company, type, air);
		a.add(plane); // ArrayList에 추가
	}
	
	String generateID(String company, String type) { // 제조회사, 타입정보, 계수번호로 구성된 식별정보 계산 기능
		String s = ""; // 식별번호를 저장할 변수
		
		if(company.compareTo("아시아나") == 0) { // 제조회사가 아시아나면 0
			s += "A";
		}
		else if(company.compareTo("대한항공") == 0) { // 제조회사가 대한한공이면 0
			s += "K";
		}
		else { // 그 외의 경우면
			s += "Z";
		}
		
		if(type.compareTo("여객기") == 0) { // 타입정보가 여객기이면 0
			s += "L";
		}
		else if(type.compareTo("전투기") == 0) { // 타입정보가 전투기면 0
			s += "F";
		}
		else { // 그 외의 경우면
			s += "Z";
		}
		
		++order; // 비행기가 등록될 때마다 1씩 증가
		s += String.format("%03d", order);
		
		return s; // 식별번호 s 반환
	}
	
	void showAll() { // 전체 비행기 정보 출력 기능
		// Iterator<E> 인터페이스 타입의 Iterator 객체를 활용하여
		// ArrayList의 모든 Airplane 객체에 대해 비행기 제조회사, 비행기 타입정보, 비행기 식별번호 정보를 출력
		Iterator<Airplane> it = a.iterator();
		while(it.hasNext()) {
			Airplane ap = it.next();
			System.out.println("--------------------------");
			System.out.println("비행기 제조회사: " + ap.getCompany());
			System.out.println("비행기 타입정보: " + ap.getType());
			System.out.println("비행기 식별번호: " + ap.getId());
		}
	}
	public static void main(String[] args) {
		AirplaneManager am = new AirplaneManager(); // 객체 생성
		for(int i = 0; i < 3; i++) { // 반복문으로 regist() 메소드를 통해 세 개의 Airplane 객체를 생성
			am.regist();
		}
		am.showAll(); // 전체 정보 출력
		sc.close(); // sc 객체종료
	}
}
