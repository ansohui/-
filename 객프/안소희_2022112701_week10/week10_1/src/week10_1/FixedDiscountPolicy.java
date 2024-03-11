package week10_1;

public class FixedDiscountPolicy implements DiscountPolicy {//인터페이스 DiscountPolicy의 추상메소드를 구현하므로 implements 작
    private double dDiscountPrice;//할인값 멤버변수 선언 

    public FixedDiscountPolicy(double dDiscountPrice) {//할인 값을 매개변수로 받는 생성자 
        this.dDiscountPrice = dDiscountPrice;
    }

    @Override
    public double getPrice(double dBeforePrice) {//할인 전의 값을 매개 변수로 받아 할인값을 뺀 값을 반환 
    	double dResult = dBeforePrice - dDiscountPrice;
        return dResult;
    }
}