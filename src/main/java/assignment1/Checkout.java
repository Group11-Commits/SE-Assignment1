package assignment1;

public class Checkout {
int total;
public Checkout(){
	total=0;
}
	public void add(int count,int price) {
		total=total+(count*price);
		
	}
	public int total() {
		return this.total;
	}
}
