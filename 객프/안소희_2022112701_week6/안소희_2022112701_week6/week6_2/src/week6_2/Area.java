package week6_2;
import java.util.Scanner;

public class Area {
	
	public static void main(String[] args) {
        Scanner oInDev;//사용자의 입력을 받기 위해 Scanner 객체 선언 
        double height1, height2;//높이 선언 
        double width1, width2;//밑변 선언 
        double area1,area2;//넓이 선언 
        oInDev = new Scanner(System.in);//Scanner 객체 초기화 
        
        Tri triangle1 = new Tri(); // Tri 클래스 기본 생성자 사용하여 생성 
        System.out.print("삼각형1 밑변: ");
        width1 = oInDev.nextDouble();//밑변 사용자에게 double형으로 입력 받음 
        System.out.print("삼각형1 높이: ");
        height1 = oInDev.nextDouble();//높이 사용자에게 double형으로 입력 받음 
        
        triangle1.setlength(width1,height1);//밑변, 높이 setWidth메서드를 이용해 초기화 
        
        Tri triangle2 = new Tri(); // Tri 클래스 기본 생성자 사용하여 생성, 위와 같음 
        System.out.print("삼각형2 밑변: ");
        width2 = oInDev.nextDouble();
        System.out.print("삼각형2 높이: ");
        height2 = oInDev.nextDouble();
        triangle2.setlength(width2, height2);
        
        oInDev.close();//Scanner 객체 닫음 
        
        area1 = triangle1.getArea();//getArea메서드로 넓이 할당받음 
        area2 = triangle2.getArea();
        
        System.out.print("삼각형1: " + area1 + " 삼각형2: " + area2 + "로 ");
        if (area1 > area2) {//넓이 비교 
            System.out.println("삼각형1이 더 넓습니다!");
        } else if (area2 > area1) {
            System.out.println("삼각형2가 더 넓습니다!");
        } else {
            System.out.println("두 삼각형의 넓이가 같습니다.");
        }
    }
}