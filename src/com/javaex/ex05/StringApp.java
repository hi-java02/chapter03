package com.javaex.ex05;

public class StringApp {

	public static void main(String[] args) {

		//표현식1
		String str = new String("안녕하세요");
		System.out.println(str);    //println 주소값을 파라미터로 사용하면 toString() 실행한다    -->java.lang.String@3432424
		//System.out.println(str.toString());
		
		
		String str01 = "안녕!!"; //표현식2
		System.out.println(str01);
		
		
		String s01 = new String("hi");
		String s02 = new String("hi");
		
		System.out.println(s01);
		System.out.println(s02);
		
		System.out.println(s01 == s02);
		System.out.println(s01.hashCode()); //hashCode값이 같다
		System.out.println(s02.hashCode()); //hashCode값이 같다
		
		if(s01 == s02) {
			//주소값이 경우
		}
		
		if(s01.equals("hi")) {   //널포인트가 되는 경우가 발생
			//문자열이 같은경우
		} 
		
		if("hi".equals(s01)) {   //널포인트가 발생되지 않게 한다.
			//문자열이 같은경우
		} 
		
		System.out.println("=특이케이스=========================================");
		String s03 = "hello";
		String s04 = "hello";  //같은 내용을 찾아서 기존것을 사용한다.
		
		System.out.println(s03);
		System.out.println(s04);
		
		System.out.println(s03 == s04); //같은 주소값을 갖는다
		
		System.out.println(s03.hashCode()); //hashCode값이 같다
		System.out.println(s04.hashCode()); //hashCode값이 같다
		
		s04 = "hi~~";    //약식으로 썼을때 글자를 변경하면 새로 메모리에 올린다.
		
		System.out.println(s04);
		System.out.println(s03); //이상해야함....
		
		System.out.println(s03==s04); //주소값이 다른걸로 확인
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
