package model;

public class BtoDCalc {
	private int result;

    public void enter(String n){
		result = Integer.parseInt(n, 2);
	}
	
	public int getResult(){
        return result;
    }
}
