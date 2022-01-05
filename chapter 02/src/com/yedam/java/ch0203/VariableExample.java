package com.yedam.java.ch0203;

public class VariableExample {

	public static void main(String[] args) {
		//�옄�룞 �깧�엯 蹂��솚 : 媛믪쓽 �쑀�슚踰붿쐞 弱� - > 鸚�
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
//		char charValue = '媛�';
		intValue = charValue;
		System.out.println("媛��쓽 �쑀�땲肄붾뱶 : " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue : " + doubleValue);
		
		System.out.println();
		//媛뺤젣 ���엯 蹂��솚
		intValue = 44032;
		charValue = (char)intValue;
		System.out.println(charValue);
		
		longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		System.out.println();
		//�젙�닔���엯�쓽 �뿰�궛
		byte result = 10 + 20;
		System.out.println(result);
		
		byte x = 10;
		byte y = 20;
		//byte result1 = x + y; �뿉�윭�쑙
		int result2 = x + y;
		System.out.println(result2);
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		
		long result3 = value1 + value2 + value3;
		System.out.println(result3);
		
		System.out.println();
	    //�떎�닔���엯�쓽 �뿰�궛
		int intV1 = 10;
		double doubleV1 = 5.5;
		double resultValue = intV1 + doubleV1;
		System.out.println(resultValue);
		
		System.out.println();
		//�뿰�궛�떇�뿉�꽌 �옄�룞 ���엯蹂��솚
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		int resultValue1 = byteValue1 + byteValue2;
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int resultValue2 = charValue1 + charValue2;
		System.out.println("�쑀�땲肄붾뱶 : " + resultValue2);
		System.out.println("異쒕젰臾몄옄 : " + (char)resultValue2);
		
		System.out.println();
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4); // int媛� �젙�닔�씠湲곕븣臾몄뿉 �냼�닽�젏遺�遺꾩� 紐⑤몢 �궇�젮踰꾨┝
		
		double doubleValue1 = intValue3/4.0;
		System.out.println(doubleValue1);
		
		System.out.println();
		int x1 = 1;
		int y1 = 2;
		double result1 = x1/y1;
		System.out.println(result1); // int媛믩겮由ъ쓽 怨꾩궛�씠湲곕븣臾몄뿉 0.5�씠吏�留� �냼�닽�젏�븘�옒�뒗 �궇�젮�꽌 0�쑝濡� �씫�쓬
		
		result1 = (double)x1 / y1; // 洹몃옒�꽌 �몮以묒뿉 �븯�굹�씪�룄 int媛��븘�땶 �떎�닔濡� �꽑�뼵�빐�빞�븿
		System.out.println(result1);
		
		System.out.println();
		//臾몄옄�뿴 寃고빀
		int value = 10 + 2 + 8;
		System.out.println(value);
		
		String str1 = 10 + 2 + "8";
		System.out.println(str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println(str2);
	
		String str3 = "10" + 2 + 8;
		System.out.println(str3);
		
		String str4 = "10" + (2 + 8); // 1010�씠 �굹�삤寃뚰븯湲�
		System.out.println(str4);		
		
		System.out.println();
		//湲곕낯 ���엯怨� 臾몄옄�뿴 媛꾩쓽 蹂��솚
		int var1 = Integer.parseInt("10");
		double var2 = Double.parseDouble("3.14");
		boolean var3 = Boolean.parseBoolean("true");
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		
		String strValue1 = String.valueOf(10);
		String strValue2 = String.valueOf(3.14);
		String strValue3 = String.valueOf(true);
		
		System.out.println("strValue1 : " + strValue1);
		System.out.println("strValue2 : " + strValue2);
		System.out.println("strValue3 : " + strValue3);

	}

}
