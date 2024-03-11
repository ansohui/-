package week13_1;

import java.util.Scanner;

public class StudentEx {
	private static final Scanner oInDev = new Scanner(System.in);
	
    public static void main(String[] args) {
        MyLinkedList<Student> studentList = new MyLinkedList<>();
        
        while (true) {
            System.out.println("1. 전체 학생의 학점 평균 조회");
            System.out.println("2. 학생 정보 등록");
            System.out.println("3. 학생 정보 삭제");
            System.out.println("4. 학생 학점 평균 검색");
            System.out.println("5. 종료");
            System.out.print("선택: ");

            int choice = oInDev.nextInt();
            oInDev.nextLine(); // 개행 문자 처리
            
            
      
            switch (choice) {
                case 1:
                	displayAverageGrade(studentList);//전체 학생의 학점 평균 조회
                    break;
                case 2:
                    registerStudent(studentList);//학생 정보 등록 
                    break;
                case 3:
                    deleteStudent(studentList);//학생 정보 삭제 
                    break;
                case 4:
                	SearchAverageGrade(studentList);//학생의 학점 검색 
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    oInDev.close();
                    System.exit(0);
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }
        }

        
        
    }
 // 전체 학생의 학점 평균 조회 메서드 
    public static void displayAverageGrade(MyLinkedList<Student> studentList) {
    	
        double dTotal = 0.0;
        int iSize =  studentList.getSize();//전체 학생 수 
        if(iSize > 0) {
	        for (int i = 0; i < iSize; i++) {
	        	dTotal += studentList.get(i).averageGrade;//학점 총합 구하기 
	        }
	        double dAverage = dTotal / iSize;//나누어 평균 구함 
	        System.out.println("전체 학생의 학점 평균: " + dAverage);
        }
        else {
        	System.out.println("등록된 학생이 없습니다");
        }
    }
    //학점 평균 검색 메서드 
    public static void SearchAverageGrade(MyLinkedList<Student> studentList){
    	
    	int i;
    	int ID;
    	int iSize = studentList.getSize();
    	
    	
    	if(iSize > 0 ) {
    		System.out.print("학번 입력: ");
        	ID = oInDev.nextInt();
	    	for (i = 0; i < iSize ; i++) {//순회하며 있는지 확인 
	            Student student = studentList.get(i);
	            if (student.studentID == ID) {
	            	System.out.println(student.averageGrade);
	            	break;
	            }
	        }
	    	if(i == iSize) {// 입력한 학번에 해당하는 학생이 없는 경우
	    		System.out.println("해당하는 학생이 없습니다.");
	    		
	    	}
    	}
    	else {//총 학생수가 0인 경우 
    		System.out.println("등록된 학생이 없습니다.");
    		
    		
    	}
       
        
    }
    //학생 등록 메서드 
    public static void registerStudent(MyLinkedList<Student> studentList) {
    	
    	System.out.println("학번 입력: ");
		int iID = oInDev.nextInt();
		System.out.println("이름 입력: ");
		String sName = oInDev.next();
		System.out.println("학과 입력: ");
		String sDepartment = oInDev.next();
		System.out.println("학점평균 입력: ");
		double dAverageGrade = oInDev.nextDouble();
		
		
		
		studentList.add(new Student(iID, sName, sDepartment, dAverageGrade));//위의 정보를 매개변수로 하는 객체 생성 후 리스트에 저장 
		
    }
    //학생 정보 삭제 
    public static void deleteStudent(MyLinkedList<Student> studentList) {
    	int i ;
    	int ID;
    	int iSize = studentList.getSize();
    	if (iSize > 0) {
    		System.out.print("학번 입력: ");
        	ID = oInDev.nextInt();
    		for (i = 0; i < iSize; i++) {
                Student student = studentList.get(i);
                if (student.studentID == ID) {
                    break;
                }
            }
    		if(i == iSize) {//해당하는 학생 없을 시 
    			System.out.println("해당하는 학생이 없습니다.");
    		}
    		else {//학생 존재 
	            Student removedStudent = studentList.get(i);//해당 인덱스의 객체 반환 
	            System.out.println("삭제된 학생 정보: " + removedStudent);//문자열과 연결하며 자동으로 toSring()호출 
	            studentList.remove(i);
    		}
        }
    	else {//학생 수가 0명일 때 
    		System.out.println("등록된 학생이 없습니다.");
    		
    	}
    }
    
}

