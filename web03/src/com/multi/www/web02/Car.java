package com.multi.www.web02;

public class Car {
	//멤버변수
	//멤버메서드
	//toString()
	//객체 생성시 멤버변수값을 한꺼번에 넣어서 초기화하고 싶어요
	//-> 객체 생성시 자동호출되는 메서드를 추가해주세요.
	//-> 생성자 (메서드), constructor
	// alt + enter 파일 경로 알 수 있다.
	// 빨간 오류가 뜬다면 제일 먼저 부품의 경로가 제대로 있는지 확인. build path에 들어가서 내가 사용할 부품들이
	// 라이브러리에 제대로 들어있는지 확인한다.
	String color;
	int price;
	int speed;
	
	public Car(String color, int price, int speed) {
		this.color = color;
		this.price = price;
		this.speed = speed;
	}
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", price=" + price + ", speed=" + speed +"]";
	}
}
