package com.yedam.java.ch1103;

import com.yedam.java.ch1101_Object.Member;

public class ClassExmaple {

	public static void main(String[] args) throws ClassNotFoundException{
		
//		Class clazz = Class.forName("com.yedam.java.ch01.object.Member");
		Member member = new Member("홍길동");
		Class clazz = member.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getCanonicalName());
		System.out.println(clazz.getMethods());
	}

}
