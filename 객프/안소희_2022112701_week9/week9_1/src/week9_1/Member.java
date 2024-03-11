package week9_1;

public class Member {
	private int iID;//학번과 이름을 필드로 가지는 Member클래스 
	private String sName;
	
	Member(){//기본 생성자 
		iID = 0;
		sName = "";
	}
	Member(int id, String name){//학번과 이름을 매개변수로 가지는 생성자 
		iID = id;
		sName = name;
	}
	
	public int getID(){//ID를 반환, 메인함수에서 ID중복을 확인할 때 사용한다. 
		return iID;
	}
	//오버라이딩 본래 있던 object 클래스의 toString 오버라이딩 
	public String toString() {//Member 정보(ID, 이름)를 출력한다. 
        return "Student ID: " + iID + "\nName: " + sName;
    }
	
}
