package week10_2;

public class Crew extends Member {
    private String sDepartment;

    Crew() {//매개변수 없는 생성자 
        super();
        sDepartment = "";
    }

    Crew(int id, String name, String department) {//id, name, department가 매개변수인 생성자 
        super(id, name);
        sDepartment = department;
    }
    

    @Override
    public String toString() {//toString()오버라이딩하여 객체 정보 스트링으로 반환 
        return super.toString() + "\nDepartment: " + sDepartment;
    }
}
