package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	Friend[] friendArray = new Friend[3];
    	//friendArray[] = new Friend();
    	
    	
        Scanner sc = new Scanner(System.in);
        
 
        System.out.println("친구를 3명 등록해 주세요");

        //친구정보 3명 입력 로직 --> 반복문 사용
       for(int f=0; f<friendArray.length; f++) {
    	   System.out.print("이름: ");
	       String fname = sc.nextLine();
	       System.out.print("핸드폰: ");
	       String fhp = sc.nextLine();
	       System.out.print("학교: ");
	       String fschool = sc.nextLine();
	       System.out.println("-------------------------------------");
	       friendArray[f] = new Friend();{
	    	   friendArray[f].setName(fname);
	    	   friendArray[f].setHp(fhp);
	    	   friendArray[f].setSchool(fschool);
	    	   }
       }
    	  
        

        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}
