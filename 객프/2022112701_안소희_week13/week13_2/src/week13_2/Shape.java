package week13_2;

public class Shape {//Shape 클래스 
	private int size;//사이즈를 멤버 변수로 가짐 
	static private int i = 0;//인덱스를 저장하기 위해 선언 
	int index;
	public Shape(int size) {
        this.size = size;
        i++;//생성할 때 마다 증가시켜 인덱스 카운트를 해준다 
        index = i;
    }

	public void draw() {
		System.out.println("Shape");
	}
	public int getSize() {//size반환 
        return size;
	}
	public String toString() {//멤버 변수 정보 스트링으로 반환
		return "Shape"+index+": "+size;
	}
}

