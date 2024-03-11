package week10_2;

public class Member {
    private int iID;
    private String sName;

    Member() {//매개변수 없는 생성자 
        iID = 0;
        sName = "";
    }

    Member(int id, String name) {//ID와 name을 매개변수로 하는 생성자 
        iID = id;
        sName = name;
    }

    public int getID() {//ID반환 메소드 
        return iID;
    }
    public String getName() {//Name반환 메소드 
        return sName;
    }

    // ID를 기준으로 같은지 확인한다. 
    @Override
    public boolean equals(Object obj) {//매개변수를 object로 지정 
        
        Member member = (Member) obj;//다운캐스팅 
        boolean bResult;
        
        bResult = (iID == member.iID);//둘이 같은지 비교연산자로 확인 후 결과를 boolean형태로 반환하여 bResult에 저장 
        
        if(bResult==true) {//결과가 true
        	return true;//true반환 
        }
        else {//아니면 
        	return false;//false반환 
        }
        
        
    }

  
    @Override
    public String toString() {//toString()오버라이딩 현재 객체의 정보를 스트링형태로 반환 
        return "Student ID: " + iID + "\nName: " + sName;
    }
}
