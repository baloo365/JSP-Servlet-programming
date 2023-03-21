package com.multi.www.web02;

public class Car2 {
	//멤버변수
	//멤버메서드
	//toString()
	//객체 생성시 멤버변수값을 한꺼번에 넣어서 초기화하고 싶어요
	//-> 객체 생성시 자동호출되는 메서드를 추가해주세요.
	//-> 생성자 (메서드), constructor
	// alt + enter 파일 경로 알 수 있다.
	// 빨간 오류가 뜬다면 제일 먼저 부품의 경로가 제대로 있는지 확인. build path에 들어가서 내가 사용할 부품들이
	// 라이브러리에 제대로 들어있는지 확인한다.
	
	//싱글톤은 해당 클래스에서 하나만 만들어서 제공!
	String color;
	int price;
	int speed;
	//하나만 제공하는 객체는
	//static: 하나의 변수만 만들때, 전역변수 만들때
	//public: 제공하는 car2를 아무데서나 쓸 수 있도록함.
	public static Car2 car2;
	
	public static Car2 getInstance() {
		if(car2==null) {
		car2 = new Car2("빨강", 100, 110);
		}
		return car2; // null일때만 한번 만들라는 뜻
	}
	
	public void run() {
		System.out.println("달리자~~~~~~~~~!!.");
	}
	
	public Car2(String color, int price, int speed) {
		this.color = color;
		this.price = price;
		this.speed = speed;
	}
	
}
