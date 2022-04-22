package com.javaex.ex10;

public class Book {
    
	//필드
    private int bookNo;     //번호
    private String title;   //제목
    private String author;  //작가
    private int stateCode;  //상태코드
	
    //생성자
    public Book(int stateCode) {
    	this.stateCode = 1;
    }
    public Book(int bookNo, String title, String author, int stateCode) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}
	
    
    
    
    
    
    //메소드
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
    
    
	
	
	public void rent() {
		if(stateCode==0) {
			System.out.println(title+" 이(가) 대여 됐습니다.");
		}
	}
    
	public void print() {
		if(stateCode==0) {
			System.out.println();
		}
	}
    
    
    
}
