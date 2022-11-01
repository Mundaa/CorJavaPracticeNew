//declaring package
package com.demo;

//declaring a class
public class BankVariables {

	int instVariable; // 0
	String strVariable; // null
	static int sm; // 0 belongs to class ...

	//main started
	public static void main(String[] args) {

		int localVar = 0;
		BankVariables v1 = new BankVariables();
		System.out.println(v1.instVariable);
		System.out.println(v1.strVariable);
		System.out.println(localVar);
		System.out.println(sm);

	}//end of main
}//end of class
