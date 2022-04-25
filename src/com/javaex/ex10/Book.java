package com.javaex.ex10;

public class Book {
    
	//필드
    private int bookNo;     //번호
    private String title;   //제목
    private String author;  //작가
    private int stateCode;  //상태코드
	
    //생성자
    public Book(){}
        
    public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		
		//stateCode는 생성자 호출시에 1로 세팅되도록 설정
		this.stateCode = 1;
	}
	
    
    
    
    
    
    //메소드 - 모든 메소드는 public으로 작성
    //bookNo, title, author에 대해서는 모든 g/s메소드 추가
    public int getBookNo() {
		return bookNo;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	
	
	
	//rent() - 대여기능을 수행하는 메소드
	public void rent() {
		//Book 클래스의 stateCode를 0으로 변경하며...
		this.stateCode=0;
		if(stateCode==0) {
			System.out.println("\n" + title + " 이(가) 대여 됐습니다.\n");
		}
	}
    
	//print() - 책의 정보가 출력형태와 같이 출력될 수 있도록 작성;
	public String print() {
		
		if(stateCode==1) {
			return "재고있음";
		}else {
			return "대여중";
		}
	}
    
    
    
}
