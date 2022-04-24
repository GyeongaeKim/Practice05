package com.javaex.ex06;

public class CConverter {
    
	//필드
	//private double dollar;
	//private double won;
	
	//생성자
	 //public CConverter(double dollar, double won) {
	//		this.dollar = dollar;
	//		this.won = won;
	//	}
	
	
    public static double rate;
    
   

	public static void setRate(double rate){
        CConverter.rate = rate;
    }
    
    public static double toDoller(double won){
        return won / rate;
    }

    public static double toKWR(double dollar){
        return dollar * rate;
    }
    

}
