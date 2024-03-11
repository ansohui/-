package week10_1;

public class PercentDiscountPolicy implements DiscountPolicy {
    private double dDiscountPercent;//할인 값을 멤버 변수로 선언 

    public PercentDiscountPolicy(double dDiscountPercent) {//할인 값을 매개변수로 받는 생성자 작성  
        this.dDiscountPercent = dDiscountPercent;
    }

    @Override
    public double getPrice(double dBeforePrice) {//이 전의 값을 매개 변수로 받아 할인 값을 100으로 나눠 이 전의 가격에 곱해 뺄 값을 구한 후 할인 계산 한 값을 반
    
    	double discountAmount, dResult;
    	discountAmount = dBeforePrice * (dDiscountPercent / 100);
    	dResult = dBeforePrice - discountAmount;
        return dResult;
    }
}