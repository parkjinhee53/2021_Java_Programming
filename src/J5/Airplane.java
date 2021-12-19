/*
 * 과제: J5
 * 이름: 박진희
 * 학번: 202014015
 */
class Airplane {
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
	public void showInfo() { // 식별 번호와 비행기 타입을 출력하는 메소드
		System.out.println("식별 번호: " + id);
		System.out.println("비행기 타입: " + type);
	}
	public Airplane(String id, String type) { // 객체 생성 시 전달받은 id와 type 값으로 필드를 초기화하는 메소드
		this.id = id;
		this.type = type;
	}
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
}

class Fighter extends Airplane {
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
}
