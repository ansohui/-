package week13_1;


public class MyLinkedList<T>{
	private Node<T> head;
	private int size;
	
	private static class Node<T>{
		T data;
		Node<T> next;
		
		Node(T data){//생성자 
			this.data = data;
			this.next = null;
		}
		public String toString() {
			return "Node data: " + data.toString();
		}
	}
	public MyLinkedList() {//매개변수 없는 기본 생성자 
		head = null;
		size = 0;
	}
	public void add(T data) {
		
		Node<T> newNode = new Node<T>(data);//data를 매개변수로 받는 생성자 호출 
		if(head == null) {//head가 없다면 
			head = newNode;
		}else {
			Node<T> current = head;//head존재하면 헤드를 가리키는 current선언 
			while(current.next != null) {//끝까지 순회 
				current = current.next;
			}
			current.next = newNode;//그 다음에 연결되도록 함 
		}
		size++;//크기 증가 
		
	}
	public T get(int index) {//리턴 타입이 T인 get함수 
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
	public int getSize() {
		return size;
	}
	public void remove(int index) {//해당 인덱스 요소 삭제 
		// TODO Auto-generated method stub
		if(index == 0) {//첫 번째 요소라면 헤드가 그 다음을 가리키도록 함 
			head = head.next;
		}
		else {
			Node<T> current = head;
			for(int i = 0 ; i < index ; i++) {//해당 인덱스까지 이동 
				current = current.next;
			}
			current.next = current.next.next;
		}
		size--;
		
	}
}
