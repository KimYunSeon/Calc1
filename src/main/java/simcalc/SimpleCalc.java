package simcalc;

public class SimpleCalc {
	private int result =0;
	public void add(int x, int y){
		result = x+y;
	}
	public void sub(int x, int y){
		result = x - y;
	}
	public int getResult(){
		return result;
	}
}
