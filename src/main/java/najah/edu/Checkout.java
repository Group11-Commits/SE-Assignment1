package najah.edu;

public class Checkout {
//private int runningTotal=0;
	private int total=0;
	public void add(Integer itemCount,int price) {
		total=total+(itemCount*price);
		
	}
public int total() {

//return runningTotal;
return this.total;

      }

}
//return total=total+(itemCount*price);


