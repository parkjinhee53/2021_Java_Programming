/*
 * 과제: J6
 * 이름: 박진희
 * 학번: 202014015
 */
package airplane;
import java.util.Scanner; // Scanner 사용하기 위해 import문 사용
abstract class Airplane {
	private String id; // 식별 번호를 나타내는 필드
	private String type; // 비행기 타입을 나타내는 필드
	
	public void setID(String id) { // 식별 번호를 설정하는 메소드
		this.id = id;
	}
	public String getID() { // 식별 번호를 반환하는 메소드
		return id;
	}
	public void setType(String type ) { // 비행기 타입을 설정하는 메소드
		this.type = type;
	}
	public String getType() { // 비행기 타입을 반환하는 메소드
		return type;
	}
	public Airplane(String id, String type) { // 객체 생성 시 전달받은 id와 type 값으로 필드를 초기화하는 메소드
		this.id = id;
		this.type = type;
	}
	public abstract void takeoff(); //  비행기가 이륙하는 추상 메소드
	public abstract void landing(); // 비행기가 착륙하는 추상 메소드
	public abstract void flight(); // 비행기가 주행하는 추상 메소드
	public abstract void showInfo(); // 식별 번화와 비행기 타입을 출력하는 추상 메소드
}

class Airliner extends Airplane { // 여객기를 나타내는 Airliner 클래스
	private int passenger; // 탑승 인원수를 나타내는 필드
	
	public Airliner(String id) { // 슈퍼 클래스의 생성자를 호출하여 전달받은 id와 '여객기'를 전달하고 탑승 인원수를 0으로 초기화
		super(id, "여객기");
		this.passenger = 0;
	}
	public Airliner(String id, int passenger) { //슈퍼 클래스의 생성자를 호출하여 전달받은 id와 '여객기'를 전달하고 탑승 인원수를 전달받은 값으로 초기화
		super(id, "여객기");
		this.passenger = passenger;
	}
	
	public void setPassenger(int passenger) { // 탑승 인원수를 설정하는 메소드
		this.passenger = passenger;
	}
	public int getPassenger() { // 탑승 인원수를 반환하는 메소드
		return passenger;
	}
	public void showInfo() { // showInfo() 메소드를 오버라이딩하여 구현하고, 식별 번호, 비행기 타입, 탑승 인원수를 출력
		System.out.println("식별 번호: " + getID());
		System.out.println("비행기 타입: " + getType());
		System.out.println("탑승 인원수: " + passenger);
	}
	public void takeoff() { //비행기가 이륙하는 메소드
		System.out.println(getType()+" "+getID()+"가 이륙합니다.");
	}
	public void flight() { //비행기가 주행하는 메소드
		System.out.println(getType()+" "+getID()+"가 비행합니다.");
	}
	public void landing() { //비행기가 착륙하는 메소드
		System.out.println(getType()+" "+getID()+"가 착륙합니다.");
	}
}

class Fighter extends Airplane implements Weapon{
	private boolean stealth; // 스텔스 모드를 나타내는 필드
	
	public Fighter(String id) { // 슈퍼 클래스의 생성자를 호출하여 전달받은 id와 "전투기"를 전달하고, 스텔스 모드를 false로 초기화
		super(id, "전투기");
		this.stealth = false;
	}
	public Fighter(String id, boolean stealth) { //  슈퍼 클래스의 생성자를 호출하여 전달받은 id와 "전투기"를 전달하고, 스텔스 모드를 전달받은 값으로 초기화
		super(id, "전투기");
		this.stealth = stealth;
	}
	
	public void stealthOn(boolean stealth) { // 스텔스 모드를 true로 설정하는 메소드
		this.stealth = true;
	}
	public void stealthOff(boolean stealth) { // 스텔스 모드를 false로 설정하는 메소드
		this.stealth = false;
	}
	public boolean getStealth() { // 스텔스 모드의 상태를 반환하는 메소드
		return stealth;
	}
	public void showInfo() { // showInfo() 메소드를 오버라이딩하여 구현하고, 식별 번호, 비행기 타입, 탑승 인원수를 출력
		System.out.println("식별 번호: " + getID());
		System.out.println("비행기 타입: " + getType());
		System.out.println("스텔스 모드: " + stealth);
	}
	public void takeoff() { //비행기가 이륙하는 메소드
		System.out.println(getType()+" "+getID()+"가 이륙합니다.");
	}
	public void flight() { //비행기가 주행하는 메소드
		System.out.println(getType()+" "+getID()+"가 비행합니다.");
	}
	public void landing() { //비행기가 착륙하는 메소드
		System.out.println(getType()+" "+getID()+"가 착륙합니다.");
	}
	public void loadWeapon() { // 객체의 ID를 명시하고, 반복문을 활용하여 weaponList 배열에 저장된 무기를 장착한다.
		System.out.println(getID() + " 무기 장착");
		for(int i = 0; i < weaponList.length; i++) {
			System.out.println(weaponList[i] + " 무기가 장착되었습니다.");
		}
	}
	public void showWeapon() { // 객체의 ID를 명시하고, 반복문을 활용하여 weaponList 배열에 저장된 무기 목록을 출력한다.
		System.out.println(getID() + " 무기 목록");
		for(int i = 0; i < weaponList.length; i++) {
			System.out.println((i+1) +": " + weaponList[i]);
		}
	}
	public void selectWeapon() { // 무기 목록을 출력하고, 무기 번호를 입력하면 weaponList 배열의 해당되는 무기를 사용한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("무기를 선택하시오: "); // 무기 선택하기
		int num = sc.nextInt();
		
		if (num == 1) { // 1번을 고르면
			System.out.println("미사일이 발사되었습니다.");	
		}
		else if (num == 2) { // 2번을 고르면
			System.out.println("레이저가 발사되었습니다.");
		}
		else { // 3번을 고르면
			System.out.println("폭탄이 발사되었습니다.");
		}
		sc.close(); // sc 객체 종료
	}
}
