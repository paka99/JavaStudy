package com.DS;

public class Dog extends Animal{
	public int age;

	public void run(){
		System.out.println("Dog is running!!!");
	}
	
	@Override
	public void sleep(){
		System.out.println("Dog Zzzz...");
	}

	public void eat(){
		System.out.println("Nyam Nyam");
	}
}
