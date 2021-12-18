/*
 * 과제:J4
 */
public class Airplane {
    private String model; // 비행기 모델을 나타내는 필드
	private String company; // 비행기 회사를 나타내는 필드
	private int number; // 탑승 인원수를 나타내는 필드
	private double milege; // 총 비행거리를 나타내는 필드
	private double fuel; // 현재 연료량을 나타내는 필드 
	
	private static int people=0; // 누적 승객 인원수를 저장하는 static 필드
	static int p() { // 누적 승객 인원수를 반환하는 static 메소드
		return people;
	} 
	private final double F = 36.5; // 연비를 나타내는 double형 상수
	
	public Airplane(String model, String company, int number) { // 비행기 모델을 model로, 비행기 회사를 company로, 탑승 인원수를 number로 초기화하는 생성자
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
	public void setNumber(int number) { // 탑승 인원수를 설정하는 메소드
		this.number = number;
	} 
	public String getModel() { // 비행기 모델을 반환하는 메소드
		return model;
	} 
	public String getCompany() { // 비행기 회사를 반환하는 메소드
		return company;
	}
	public int getNumber() { // 탑승 인원수를 반환하는 메소드
		return number;
	}
    public void addFuel(double fuel) { // 주입할 연료량 정보를 전달받아 현재 연료량을 증가하는 메소드
        this.fuel += fuel;
    }
    public double getFuel() { // 현재 연료량을 반환하는 메소드
    	return fuel;
    }
    public double getMilege() { // 총 비행거리를 반환하는 메소드
    	return milege;
    }
    public void flight(double milege) { // 비행할 거리 정보를 전달받아 연료량과 연비를 통해 비행 가능 여부를 판단하고 아래 기능을 수행하는 메소드
    	if (F * milege > fuel) // 연비가 주입할 연료보다 크면
    	{
    		System.out.println("비행 불가");
    	}
    	else 
    	{	
    		System.out.println("비행 가능");
    		people += number; // 누적 승객 인원수
    	    this.milege += milege; // 총 비행거리
    		this.fuel = fuel - (F * milege); // 현재 연료량
    	}
    }
	public void showAirplane() { // 비행기 모델, 비행기 회사, 탑승 인원수, 총 비행거리, 현재 연료량 정보를 출력하는 메소드
    	System.out.println("비행기의 모델: " + model);
		System.out.println("비행기의 회사: " + company);
		System.out.println("탑승 인원수: " + number + "명");
		System.out.println("총 비행거리: " + milege + "km");
		System.out.println("현재 연료량: " + fuel + "L");
    }
}
