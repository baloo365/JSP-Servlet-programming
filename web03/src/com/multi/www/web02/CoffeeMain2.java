package com.multi.www.web02;

public class CoffeeMain2 {

	public static void main(String[] args) {
		Coffee2 c2; //12
		Coffee2 c1; //12
			c2 = Coffee2.getInstance();
			c1 = Coffee2.getInstance();
			System.out.println(c2); //주소확인
			System.out.println(c1); //주소확인
		}

}
