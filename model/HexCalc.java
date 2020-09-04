package model;

public class HexCalc {
	private int result;

    public void enter(String n){
		result = Integer.parseInt(n, 16);
	}
	
	public int getResult(){
        return result;
    }
}
