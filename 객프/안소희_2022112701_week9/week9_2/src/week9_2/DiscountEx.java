package week9_2;
import java.util.Scanner;
public class DiscountEx {

	public static void main(String[] args) {
		
		Scanner oInDev = new Scanner(System.in);
		while(true) {
			
			System.out.println("상품의 가격을 입력하세요(종료시 음수 값 입력)");
			int iPrice = oInDev.nextInt();
			if(iPrice < 0) {//가격이 음수면 종료 
				break;
			}
			System.out.println("discountValue 설정 값을 입력하세요");
			int iDiscount = oInDev.nextInt();
			
			System.out.println("할인 정책을 선택하세요(1. 고정 금액 할인, 2. 퍼센트 할인)");
			int iChoice = oInDev.nextInt();
			if(iChoice == 1) {
				DiscountPolicy fixedPolicy = new FixedDiscountPolicy(iDiscount);//업캐스팅 
		        int discountedPrice1 = (int)fixedPolicy.getPrice(iPrice);//상품의 본래 가격을 매개변수로 넣어 할인 후 가격을 얻음 
		        System.out.println("고정 금액 할인 후 가격: " + discountedPrice1);
	
			}
			
			else if(iChoice == 2){// PercentDiscountPolicy를 이용한 할인 정책
				if(iDiscount>100) {//100%를 초과할 때 에러 
					System.out.println("100%을 넘을 수 없습니다.");
					continue;
				}
		        DiscountPolicy percentPolicy = new PercentDiscountPolicy(iDiscount);//업캐스팅  
		        int discountedPrice2 = (int)percentPolicy.getPrice(iPrice);//상품의 본래 가격을 매개변수로 넣어 할인 후 가격을 얻음 
		        System.out.println("퍼센트 할인 후 가격: " + discountedPrice2);
			}
			else {
				System.out.println("번호를 잘못 입력하셨습니다");//1 또는 2가 아닐 때 
			}
		}
		oInDev.close();

	}

}
