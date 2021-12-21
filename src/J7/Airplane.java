/*
 * 과제: J7
 * 이름: 박진희
 * 학번: 202014015
 */
public class Airplane {
	private String company; // 제조회사를 나타내는 필드
	private String type; // 타입정보를 나타내는 필드
	private String id; // 식별정보를 나타내는 필드
	
	public Airplane(String company,String type,String id) { // 생성자
		this.company = company;
		this.type = type;
		this.id = id;
	}
	
	public String getCompany() { // 제조회사를 반환하는 매소드
		return company;
	}
	public String getType() { // 타입정보를 반환하는 메소드
		return type;
	}
	public String getId() { // 식별정보를 반환하는 메소드
		return id;
	}
}
