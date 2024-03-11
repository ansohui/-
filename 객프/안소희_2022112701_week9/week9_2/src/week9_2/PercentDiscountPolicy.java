package week9_2;

public class PercentDiscountPolicy extends DiscountPolicy{

	public PercentDiscountPolicy(int dDiscountPrice) {//할인값을 매개변수로 하는 생성자 
		super(dDiscountPrice);//슈퍼클래스 생성자 호출 
		
	}
	//오버라이딩 
	public double getPrice(double dBeforePrice) {//할인 이전의 값을 매개변수로 받음 
		double discountAmount,dResult;
		discountAmount = dBeforePrice * (double)(dDiscountPrice / 100);
		dResult = dBeforePrice - discountAmount;
		
        return dResult;//할인 이후의 가격 반환  
	
	}

}
