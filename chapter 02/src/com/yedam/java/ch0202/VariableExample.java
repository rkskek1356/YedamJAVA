package com.yedam.java.ch0202;

public class VariableExample {

	public static void main(String[] args) {
		// �젙�닔 由ы꽣�윺
		int var1 = 0b1011; // 2吏꾩닔
		int var2 = 0206; // 8吏꾩닔
		int var3 = 0xb3; //16吏꾩닔
		int var4 = 365; //10吏꾩닔
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		
		//byte ���엯
		byte v1 = -128;
		byte v2 = -30;
		byte v3 = 0;
		byte v4 = 30;
		byte v5 = 127;
		
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		System.out.println("v3: " + v3);
		System.out.println("v4: " + v4);
		System.out.println("v5: " + v5);
		
		//long ���엯
		long var10 = 20;
		long var11 = 100000000000000L; // long���엯 int踰붿쐞瑜� 踰쀬뼱�궇寃쎌슦 L�쓣 遺숈씠硫� �맖 (p.62)
		
		System.out.println("var10: " + var10);
		System.out.println("var11: " + var11);
		
		//char ���엯
		char c1 = 'A';       //臾몄옄
		char c2 = 65;        //10吏꾩닔
		char c3 = '\u0041';  //16吏꾩닔
		
//		char c4 = '媛�';       //臾몄옄
		char c5 = 44032;     //10吏꾩닔
		char c6 = '\uac00';  //16吏꾩닔
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
//		System.out.println("c4: " + c4);
		System.out.println("c5: " + c5);
		System.out.println("c6: " + c6);
		
		//string ���엯
		
		String name = "�솉湲몃룞";
		String job = "�룄�궗";
		String str = ("�궡�씠由꾩� �솉湲몃룞 \"�룄�궗\"吏�."); // 臾몄옄�뿴 �궡遺� �듅�닔臾몄옄瑜� �궗�슜�븷�븣 �뿭�뒳�옒�돩 �궗�슜
		
		System.out.println("�씠由�: " + name);
		System.out.println("吏곸뾽: " + job);
		System.out.println(str);
		
		//�떎�닔���엯
		float f1 = 3.14F;
		double d1 = 3.14;
		float varF = 0.1234567890123456789F;
		double varD = 0.1234567890123456789;
		
		System.out.println("f1 : " + f1);
		System.out.println("d1 : " + d1);
		System.out.println("varF : " + varF);
		System.out.println("varD : " + varD);
		
		//�끉由ы��엯
		boolean stop = false;
		if(stop) {
			System.out.println("以묒��빀�땲�떎.");
		}
		else {
			System.out.println("�떆�옉�빀�땲�떎.");
		}
				
	}

}
