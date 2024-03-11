package week13_2;
import java.util.Scanner;

public class ShapeEx {
	public static void main(String[] args) {
		int iCnt;
		int iSize;
		String sInput;
		int iInput;
		
		Scanner oInDev = new Scanner(System.in);
        ShapeSequence shapeManager = new ShapeSequence();
        
        System.out.print("Shape개수 입력: ");
        iCnt = oInDev.nextInt();
        
        for(int i = 0 ; i < iCnt ; i++) {//입력받은 Shape개수만큼 사이즈 입력받음 
        	System.out.print("Shape"+(i+1)+"의"+" size 입력: ");
        	iSize = oInDev.nextInt();
        	System.out.println("===========현재 상태===========");
        	shapeManager.add(new Shape(iSize));
        	System.out.println("=============================");
        	
        	
        }
       
        
        while(true) {
        	System.out.println("몇 번째 값을 가져올까요?(가장 큰 값: -1, 종료: q)");
        	sInput = oInDev.next();
        	if(sInput.equals("q")) {//q입력시 종료 
        		oInDev.close();
        		break;
        	}
       
        	iInput = Integer.parseInt(sInput);
        	if(iInput == -1) {//-1입력시 가장 큰 값 반환 
        		System.out.println(shapeManager.get());
        	}
        	else {//인덱스 입력시 해당 Shape 정보 반환 
        		System.out.println(shapeManager.get(iInput-1));
        	}
        	
        	
        }

        
    }
}
