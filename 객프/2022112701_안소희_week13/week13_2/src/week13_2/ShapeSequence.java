package week13_2;
import java.util.ArrayList;


public class ShapeSequence extends ArrayList<Shape> {
	
	private void sortShapes() {
        // 내림차순 정렬
		for (int i = 0; i < this.size(); i++) {
            for (int j = i + 1; j < this.size(); j++) {
                if (this.get(i).getSize() < this.get(j).getSize()) {
                    // swap
                    Shape temp = this.get(i);
                    this.set(i, this.get(j));
                    this.set(j, temp);
                }
            }
        }
    }
	@Override
	public boolean add(Shape shape) {
	    super.add(shape);//ArraList의 add메서드 사용 
	    sortShapes();//내림차순 정렬 
	    
	 // 추가됐을 때 현재 있는 모든 Shape 출력
	    System.out.println("현재 있는 모든 Shape:");
	    for (Shape s : this) {
	        System.out.println(s.toString());
	    }
	    
	    return true;
	}

    public Shape get() {
        // 리스트가 비어있을 경우 null 반환
    	if(this.isEmpty()) {
    		return null;
    	}
    	else {
    		return this.get(0);
    	}
        
    }
    
    public Shape get(int i) {
        // 유효한 인덱스인지 확인 후 반환
    	if(i >= 0 && i < this.size()) {
    		return super.get(i);//ArrayList의 get메서드 사용 
    	}
    	else {
    		return null;
    	}
        
    }
}
