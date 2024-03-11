package week7_2;

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
	
	public void PrintMember() {//학번과 이름을 출력하는 메소드 
		System.out.println("Student ID: "+iID);
		System.out.println("Name: "+sName);
	}
	
}
