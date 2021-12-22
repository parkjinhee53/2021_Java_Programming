/*
 * 과제:J8
 * 이름: 박진희
 * 학번: 202014015
 */
import java.util.*;
import java.io.*;
public class AirplaneFinder{
	Scanner sc = new Scanner(System.in);
	HashMap<String, Airplane> h = new HashMap<String, Airplane>(); // HashMap<String, Airplane>으로 구체화된 HashMap 컬렉션
	
	void readAirplaneFile() { // airplane.txt 파일로부터 비행기 정보 읽기 기능
		try {
			//FileReader 객체를 생성하여 airplane.txt 파일과 연결
			FileReader fin = new FileReader("C:\\Java\\airplane.txt");
			BufferedReader br = new BufferedReader(fin); // bufferedReader로 파일에 저장된 모든 비행기 정보 입력받기

			String s = " "; // 문자를 저장할 변수
			while((s = br.readLine()) != null) { // 한 줄씩 읽다가 더이상 읽어줄 문자가 없을 때까지 반복
				String [] af = s.split(" "); // 공백으로 문자 나누어 문자열 배열 af에 저장
				// Airplane 객체 생성, af[0]은 식별정보, af[1]은 제조회사, af[2]는 탑승인원
				Airplane ap = new Airplane(af[0], af[1], Integer.parseInt(af[2]));
				h.put(af[0], ap); // key는 비행기의 식별정보이고 value는 Airplane 객체
			}
			fin.close();
			br.close();
		} catch(IOException e) { // 예외처리
			System.out.println("파일 입출력 오류");
		}
	}
	
	void writeAirplaneFile() { // 식별정보, 제조회사, 탑승인원을 입력받아 airplane.txt 파일에 추가 기능
		try {
			// FileWriter 객체를 생성하여 airplane.txt 파일과 연결하고 두 번째 인자를 true로 설정
			FileWriter fout = new FileWriter("C:\\Java\\airplane.txt",true);
			String r = ""; // Y/N 입력받아서 저장할 변수
			while(r.compareTo("N") != 0) {
				System.out.print("새로운 비행기 정보를 입력하시겠습니까? (Y/N): ");
				r = sc.nextLine();
				
				if(r.compareTo("Y") == 0) { // 입력받은 r이 Y면 0
					System.out.print("비행기 식별번호: ");
					String id = sc.nextLine();
					System.out.print("비행기 제조회사: ");
					String company = sc.nextLine();
					System.out.print("비행기 탑승인원: ");
					String number = sc.nextLine();
					System.out.println();
					
					fout.write(id + " "); // 파일에 id 추가
					fout.write(company + " "); // 파일에 company 추가
					fout.write(number); // 파일에 number 추가
					fout.write("\n");
				}
			}
			fout.close();
		} catch(IOException e) { // 예외처리
			System.out.println("파일 입출력 오류");
		}
	}
	void findAirplane() { // 식별번호를 이용해 비행기 정보 검색 기능
		System.out.print("검색할 비행기 식별번호를 입력하세요: ");
		String id = sc.nextLine();
		if(h.containsKey(id) == true) { // 입력받은 식별번호가 존재한다면
			Airplane p = h.get(id);
			System.out.println(p.toString()); // toString() 메소드가 호출
		}
		else { // 없다면
			System.out.println("존재하지 않는 비행기 식별번호입니다.");
		}
	}
	public static void main(String[] args) {
		AirplaneFinder a = new AirplaneFinder(); // 객체 생성
		a.readAirplaneFile(); // airplane.txt 파일로부터 비행기 정보 읽기 기능 메소드
		a.findAirplane(); // 식별번호를 이용해 비행기 정보 검색 기능 메소드
		System.out.println(); // 한줄 띄어쓰기
		a.writeAirplaneFile(); // 식별정보, 제조회사, 탑승인원을 입력받아 airplane.txt 파일에 추가 기능 메소드
	}
}
