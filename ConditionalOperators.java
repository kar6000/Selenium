package com.corejava.practice;

public class ConditionalOperators {

	public static void main(String[] args) {

		//Comparison operator
		int x =10;
		int y =20;
		
		if(x ==y) {
			System.out.println("x is equal to y");
			
		}
				
				
		//Largest of 3 numbers		
		int a =300;
		int b =400;
		int c =200;
		
		if(a>b && a>c) {
			System.out.println("a is the largest no.");
		}
		else if(b>c){
			System.out.println("b is the largest no.");
			
		}else {
			System.out.println("c is the largest no.");
		}
		
	}

}
