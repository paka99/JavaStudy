package com.junseok;

interface PrintAny{
	public abstract void sayHello();
	public abstract void printNum(int n);
}

class A implements PrintAny{
	@Override
	public void sayHello(){
		System.out.println("Hello");
	}
	
	@Override
	public void printNum(int a){
		System.out.println(a);
	}
	
	//@Override
	public void myMethod(){
		System.out.println("Hi~");
	}
}


public class HelloInterface {

	public static void main (String[] args){
		//EXAMPLE: Implements Practice
		//2017.3.1
		A implementedInstance = new A();
		implementedInstance.sayHello();
		implementedInstance.printNum(5);
		implementedInstance.myMethod();
		
//		EXAMPLE: Virtual Method Experiment
		PrintAny definedIntefaceName = new A();
		definedIntefaceName.sayHello();
		//definedIntefaceName.myMethod();
		
		
		//PrintAny cc = new printAny();	//Error: interface must be implemented
		
		//EXAMPLE: Practice of Anonymous Inner Class		
		PrintAny myPrintAny = new PrintAny() {
			@Override
			public void sayHello() {
				System.out.println("It is Anonymous inner class");
			}
			
			@Override
			public void printNum(int a){
				System.out.println(a + ": Anonymous inner class");
			}
			
		};
		
		myPrintAny.sayHello();
		myPrintAny.printNum(5);
	}
	
	
}
