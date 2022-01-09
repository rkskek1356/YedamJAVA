package com.yedam.java.Quiz05;

public class Won2Dollar extends Converter {
	
	
	Won2Dollar(int ratio){
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) { 
		return src / ratio;
	}

	@Override
	protected String getSrcString() {
		
		return "원";
	}

	@Override
	protected String getDestString() {
		
		return "달러";
	}

}
