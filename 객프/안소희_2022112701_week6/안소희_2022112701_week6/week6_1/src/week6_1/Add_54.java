package week6_1;
import java.util.Scanner;
public class Add_54 {

	public static void main(String[] args) {
		
		double number;
		number = 0;
		String sInput; //입력을 저장하는 문자열 변수 선언 
		Scanner oInDev; //입력을 읽는 Scanner 객체 생성 
		
		oInDev = new Scanner(System.in); // Scanner 객체 초기화 
			
		while (true) {//무한 루프 
            System.out.print("숫자 입력 종료(q): ");
	        sInput = oInDev.next();// 사용자 입력을 읽어 문자열 변수 sInput에 저장

	        if (sInput.equals("q")) {// 만약 사용자가 "q"를 입력했다면
	                System.out.println("main 메소드 종료");
	                oInDev.close();//Scanner객체를 닫음 
	                break;//무한 루프 종료 
	            }

	        try {
	        	number = Double.parseDouble(sInput);// 문자열을 숫자로 변환하여 number 변수에 저장
	        	if(number%1!=0) {//정수가 아닐 때(부동소수점형)
	        		System.out.println("정수를 입력하세요 ");//정수 입력 조건 충족 
	        	}
	        	else {//정수일 때 
		        	number = number + 54.0;// 입력된 숫자에 54를 더하고 결과를 result 변수에 저장
		            System.out.println("숫자 + 54 : " + number);
	        	}
	        } 
	        catch (NumberFormatException e) {// 만약 변환이 실패하면 NumberFormatException 예외를 처리
	        	System.out.println("문자가 아닌 숫자 입력할 것 ");// 예외 메시지 출력
	        }
	
		}
		

	}


	

}
