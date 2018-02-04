package chap10;

public class Duck {
	private int size;
	public static void main(String[] args) {
		Duck one = new Duck();
		// TODO Auto-generated method stub
		System.out.println("size is   " + one.getSize());
	}
	public void setSize(int s){
		size = s;
	}
	public int getSize(){
		return size;
	}
}
