package model;

public class BinaryCalc {
	
	private String result;

    public void enter(int n){
		result = Integer.toBinaryString(n);
	}
	
	public String getResult(){
        return result;
    }

}
