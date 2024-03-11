package week7_1;

public class TV {
	private int size;
	public TV() {//기본 생성자 
		size = 0;
	}
	
	public void setSize(int size) {//size를 입력받는 메소드 
		this.size = size;
	}
	
	protected int getSize() {//size를 반환하는 메소드 
		return size;
	}
}

