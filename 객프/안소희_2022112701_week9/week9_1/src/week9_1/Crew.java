package week9_1;

public class Crew extends Member{//Member클래스 상속받음 
	
	private String sDepartment;//부서 기능 추가 

	
	Crew(){//기본 생성자 생성 
		super();//super()를 통해 명시적으로 슈퍼 클래스의 생성자를 호출한다. 
		sDepartment = "";
	}
	
	Crew(int id, String name, String Department) {//학번과 이름 부서를 매개변수로 한 생성자 
		super(id,name);//super()를 통해 명시적으로 슈퍼 클래스의 생성자를 호출한다. 이때 매개변수를 기준으로 호출함 
		sDepartment = Department;
	}
	//Member 클래스의 toString메소드 오버라이딩 
	public String toString() {//Crew정보를 출력한다. 
        return super.toString() + "\nRole: " + sDepartment;//슈퍼클래스의 toString()을 호출하여 문자열로 정보를 받고 Crew가 확장한 정보인 Department를 출력한다. 
    }
}
