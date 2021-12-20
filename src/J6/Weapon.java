/*
 * 과제: J6
 * 이름: 박진희
 * 학번: 202014015
 */
package airplane;

public interface Weapon {
	String[] weaponList = {"미사일", "레이저", "폭탄"}; // String 타입의 weaponList 배열
	
	public abstract void loadWeapon(); // 추상 메소드
	public abstract void showWeapon(); // 추상 메소드
	public abstract void selectWeapon(); // 추상 메소드
}
