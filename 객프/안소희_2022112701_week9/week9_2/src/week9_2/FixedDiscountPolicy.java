package week9_2;

public class FixedDiscountPolicy extends DiscountPolicy {

	public FixedDiscountPolicy(double dDiscountPrice) {//할인값을 매개변수로 하는 생성자 
		super(dDiscountPrice);//슈퍼클래스 생성자 호출 
		
	}
	//오버라이딩 
	public double getPrice(double dBeforePrice) {//할인 이전의 가격을 매개변수로 받음 
		double dResult;
		dResult = dBeforePrice - dDiscountPrice;
        return dResult;//할인 이후 가격 반환 
    }
	
}
