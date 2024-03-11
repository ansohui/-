package week13_1;

class Student {
	int studentID;
    String name;//이름 
    String department;//학과 
    double averageGrade;//학점 평균 
	

    public Student(int studentID, String name, String department, double averageGrade) {//위 멤버 변수를 초기화 하는 생성자 
        this.studentID = studentID;
    	this.name = name;
        this.department = department;
        this.averageGrade = averageGrade;
    }
    public Student() {//기본 생성자
    	studentID  = 0;
    	name = null;
    	department = null;
    	averageGrade = 0;
    }
    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
