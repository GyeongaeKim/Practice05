package com.javaex.ex09;

public class StringUtil {
    
	
	//필드
	//생성자
	
	//메소드; String 배열 타입의 파라미터 -> (String[] strArray)
	public static String concatString(String[] strArray) {
		//메소드 내용작성
		String result=("");
		for(int i=0; i<strArray.length; i++) {
			result+=strArray[i];
		}
		return result;
	}
	
	
	
	
	

}
