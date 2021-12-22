/*
 * 과제:J8
 * 이름: 박진희
 * 학번: 202014015
 */
public class Airplane {
	private String id; // 식별번호 필드
	private String company; // 제조회사 필드
	private int number; // 탑승인원 필드
	
	public Airplane(String id, String company, int number) { // 생성자
		this.id = id;
		this.company = company;
		this.number = number;
	}
	
	public String getId() { // 식별번호를 반환하는 메소드
		return id;
	}
	public String getCompany() { // 제조회사를 반환하는 매소드
		return company;
	}
	public int getNumber() { // 탑승인원을 반환하는 메소드
		return number;
	}
	
	@Override
	public String toString() { // 비행기 식별번호, 비행기 제조회사, 비행기 탑승인원 정보를 출력하는 toString() 메소드를 오버라이딩하여 작성
		return this.getId() +" "+
			   this.getCompany() +" "+
			   this.getNumber(); 
	} 
	
}
