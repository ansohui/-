package week7_1;

public class ColorTV extends TV{
	private int	color;
	
	public ColorTV() {//기본생성자 
		super();
		color = 0;
	}

	public void setColor(int color) {//color이 private이므로 다른 클래스에서 이 함수를 이용해 값을 변경시킨다. 

		this.color = color;
	}
	
	public void printProperty() {//정보를 출력하는 함수 
		int size = getSize();//size가 private이므로 슈퍼 클래스이더라도 접근할 수 없으므로 getSize()함수 이용해 값을 받는다. 
		System.out.println(size+"인치 "+color+"컬러 ");//출력 
	}
}
