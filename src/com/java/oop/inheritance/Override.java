package com.java.oop.inheritance;

public class Override {

	public static void main(String[] args) {
		
		Computer computer;// = new Computer();
		
		//System.out.println(computer.getSystemType());
		
		computer = new Laptop();
		
		System.out.println(computer.getSystemType());

	}
	
	
	
}
