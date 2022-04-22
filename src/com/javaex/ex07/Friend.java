package com.javaex.ex07;

public class Friend {

    private String name;          //이름
    private String hp;            //전화번호
    private String school;        //학교

    //선언자
    public Friend() {}
    public Friend(String name, String hp, String school) {
    	this.name = name;
    	this.hp = hp;
    	this.school = school;
    }
    
    
    // getter/setter 작성
    public void setName(String name) {
		this.name = name;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	public String getName() {
		return name;
	}
	public String getHp() {
		return hp;
	}
	public String getSchool() {
		return school;
	}
	
	
	
	public void showInfo(){
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
    }
	
	

}
