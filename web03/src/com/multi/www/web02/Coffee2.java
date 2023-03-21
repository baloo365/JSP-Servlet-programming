package com.multi.www.web02;

public class Coffee2 {
		
		String name = "핸드드립";
		int price = 5000;
	
		public static Coffee2 c2; //null 변수만 만들었지 값은 없음
		
		public static Coffee2 getInstance() {
			if(c2 == null) {
				c2 = new Coffee2();
			}
			return c2;
		}
		
		private Coffee2() {
		}
		
		
		
}
