package com.yedam.java.package02;

import com.yedam.java.package01.A;
import com.yedam.java.package01.B;

public class C {
//	A a;  //default접근제한이기대문에 같은 패키지가 아니여서 import를 할수가 없음
	A a;
	B b;
	
	
	//필드
	A a1 = new A(true);
//	A a2 = new A(1);
//	A a3 = new A("문자열");
//	
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1;
//		a.field3 = 1;
//		
		a.method1();
//		a.method2();
//		a.method3();
	}

}
