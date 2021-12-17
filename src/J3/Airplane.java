/*
 * 과제:J3
 * 이름: 박진희
 * 학번: 202014015
 */
public class Airplane {
	String model; // 비행기 모델을 나타내는 필드
	String company; // 비행기 회사를 나타내는 필드
	int number; // 최대 승객수를 나타내는 필드
	
	public Airplane() { // 비행기 모델과 비행기 회사를 빈 문자열("")로, 최대 승객수를 0으로 초기화하는 생성자
		this.model = "";
		this.company = "";
		this.number = 0;
	} 
	public Airplane(String model, String company) { // 비행기 모델을 model로, 비행기 회사를 company로 초기화하는 생성자
		this.model = model;
		this.company = company;
	}
	public Airplane(String model, String company, int number) { // 비행기 모델을 model로, 비행기 회사를 company로, 최대 승객수를 number로 초기화하는 생성자
		this.model = model;
		this.company = company;
		this.number = number;
	}
	
    public void setModel(String model) { // 비행기 모델을 설정하는 메소드
		this.model = model;
	}
	public void setCompany(String company) { // 비행기 회사를 설정하는 메소드
		this.company = company;
	} 
	public void setNumber(int number) { // 최대 승객수를 설정하는 메소드
		this.number = number;
	} 
	public String getModel() { // 비행기 모델을 반환하는 메소드
		return model;
	} 
	public String getCompany() { // 비행기 회사를 반환하는 메소드
		return company;
	}
	public int getNumber( ) { // 최대 승객수를 반환하는 메소드
		return number;
	}
	public void showAirplane() { // 비행기 모델, 비행기 회사, 최대 승객수 정보를 출력하는 메소드
    	System.out.println("비행기의 모델: " + model);
		System.out.println("비행기의 회사: " + company);
		System.out.println("최대 승객수: " + number);
    }
	
	public static void main(String[] args) {
		Airplane plane1 = new Airplane(); //new 연산자를 사용하여 plane1 객체 생성
		plane1.model = "A100"; // plane1 객체의 필드
		plane1.company = "아시아나"; // plane1 객체의 필드
		plane1.number = 300; // plane1 객체의 필드
		Airplane plane2 = new Airplane("K300","코리아나"); //new 연산자를 사용하여 plane2 객체 생성
		plane2.number = 400; // plane2 객체의 필드
		Airplane plane3 = new Airplane("S200","성공회에어",500); //new 연산자를 사용하여 plane3 객체 생성
		
		plane1.showAirplane(); // plane1 객체 출력
		System.out.println(); // 한줄 띄어쓰기
		plane2.showAirplane(); // plane2 객체 출력
		System.out.println(); // 한줄 띄어쓰기
		plane3.showAirplane(); // plane3 객체 출력
	}
}
