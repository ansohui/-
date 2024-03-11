package week9_2;

public abstract class DiscountPolicy {//추상클래스 
    protected double dDiscountPrice; // 할인액

    protected DiscountPolicy(double dDiscountPrice) {//할인값을 매개변수로 하는 생성자 생성 
        this.dDiscountPrice = dDiscountPrice;//이 클래스의 변수에 매개변수로 받은 dDiscountPrice할당 
    }

    // getPrice 메소드를 추상 메소드로 정의
    protected abstract double getPrice(double dBeforePrice);
}