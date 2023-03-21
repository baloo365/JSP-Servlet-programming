package com.multi.www.web02;

public class MainCar3 {

		public static void main(String[] args) {
			Car2 car2; //12
			for (int i = 0; i < 1000; i++) {
				car2 = Car2.getInstance();
				System.out.println(car2); //주소확인
			}
			//System.out.println("메모리 크기>>" + 12*1000);
			//아까 프로토타입은 주소가 1000개 만들어졌는데
			//싱글톤은 하나의 주소를 가지고 1000개 만듦.
			
			//new 이용해서 객체 생성시 new Car2()를 외부에서
			//
		}
}
