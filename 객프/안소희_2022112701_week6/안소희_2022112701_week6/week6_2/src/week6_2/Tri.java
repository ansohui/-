package week6_2;

public class Tri { // Tri 클래스 정의
    private double width; // 밑변 필드 같은 클래스 내에서만 사용하므로 private 접근 지정자 사용 
    private double height; // 높이 필드 같은 클래스 내에서만 사용하므로 private 접근 지정자 사용 

    // 기본 생성자: 밑변과 높이를 0.0으로 초기화 Area class가 사용하므로 디폴트로 접근 지정자 설정 
    Tri() {
        this.width = 0.0;
        this.height = 0.0;
    }

    // 밑변, 높이 설정 메서드 Area class가 사용하므로 디폴트로 접근 지정자 설정 
    void setlength(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 삼각형의 넓이를 계산하는 메서드 Area class가 사용하므로 디폴트로 접근 지정자 설정 
    double getArea() {
        return 0.5 * width * height;
    }
}
