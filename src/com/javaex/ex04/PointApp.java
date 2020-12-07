package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {
	
		//equals() 성능향상
	    //일반적으로 equals() 와 hashCode()	
		Point p = new Point(2, 3);
		Point p01 = new Point(2, 3);
		Point p02 = new Point(5, 8);
		
		System.out.println(p.hashCode());
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		
		//System.out.println(p==p01); //실제주소비교
		
		System.out.println(p.equals(p01));
		System.out.println(p.equals(p02));
		
		System.out.println(p);
	}
	
}
