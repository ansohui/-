package week10_1;

interface DiscountPolicy {//인터페이스 작성 
   abstract double getPrice(double dBeforePrice);//할인 후 가격을 구하는 추상메소드 
}