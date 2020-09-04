package model;

public class DtoHCalc {
	private String result;

    public void enter(int n){
		result = Integer.toHexString(n);
	}
	
	public String getResult(){
        return result;
    }
}
