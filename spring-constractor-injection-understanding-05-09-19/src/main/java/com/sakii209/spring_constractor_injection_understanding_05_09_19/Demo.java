package com.sakii209.spring_constractor_injection_understanding_05_09_19;

public class Demo {
	
	private Double numberOne;
	private Double numberTwo;
	
	
	
	@Override
	public String toString() {
		return "Demo [numberOne=" + numberOne + ", numberTwo=" + numberTwo + "]";
	}

	public Demo() {
		
		
	}
	
	public Demo(int firstno,int secondno) {
		System.out.println("from int constractor");
		this.numberOne=(double)firstno;
		this.numberTwo=(double)secondno;
	}

	public Demo(double firstno,Double secondno) {
		System.out.println("from double constractor");
		this.numberOne=firstno;
		this.numberTwo=secondno;
		
	}
}
