//declaring package
package com.demo1;

//declaring class
public class Polymorphism {

	//main started
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape square = new Shape();
		square.calculateArea(89.7f);

		Shape rectangle = new Shape();
		rectangle.calculateArea(54.3f, 67.5f);

		Shape circle = new Shape();
		circle.calculateArea(5.4);

	}//end of main

}//end of class
