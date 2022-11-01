//declaring package
package com.demo1;

//declaring class
public class Shape {

	double area;

	// polymorphsm with number of arguments & type
	public void calculateArea(float length, float breadth) {
		area = length * breadth;
		System.out.println("The area of rectangle is:" + area);
	}

	public void calculateArea(float side) {
		area = side * side;
		System.out.println("The area of square is:" + area);

	}

	public void calculateArea(double radius) {
		area = 3.14 * radius * radius;
		System.out.println("The area of circle is:" + area);

	}
}//end of class
