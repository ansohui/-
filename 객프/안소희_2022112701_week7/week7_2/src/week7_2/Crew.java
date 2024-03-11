package week7_2;

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
	
	public void PrintCrew(){
		PrintMember();//Member클래스의 출력 메소드를 통해 학번과 이름을 출력 
		System.out.println("Department: "+sDepartment);//추가 기능으로 부서 출력 
	}
	
}
