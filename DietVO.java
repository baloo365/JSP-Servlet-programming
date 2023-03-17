package multi;

//RAM에 만드는 저장공간을 만든다.
public class DietVO {
	//MemberVO가방에 넣은 데이터는 Member테이블에 들어갈 예정
	//각 컬럼과 일치시켜 줌. 
	private String no;
	private String morning;
	private String lunch;
	private String dinner;
	
	//하나의 변수당 set/get하나씩 만들어줌. 
	//가방에 하나씩 값을 넣어주어야 함. ==> setter
	public void setNo(String no) {
		this.no = no;
	}
	
	//가방에 하나씩 값을 꺼내주어야 함. ==> getter
	public String getNo() {
		return no;
	}
	
	public void setMorning(String morning) {
		this.morning = morning;
	}
	
	public String getMorning() {
		return morning;
	}

	public String getLunch() {
		return lunch;
	}

	public void setLunch(String lunch) {
		this.lunch = lunch;
	}

	public String getDinner() {
		return dinner;
	}

	public void setDinner(String dinner) {
		this.dinner = dinner;
	}

	@Override
	public String toString() {
		return "DietVO [no=" + no + ", morning=" + morning + ", lunch=" + lunch + ", dinner=" + dinner + "]";
	}
	
	//가방에 어떤 값들이 들어있는지 string으로 다 찍어볼 수 있다.
	
}
