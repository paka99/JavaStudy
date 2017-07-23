package com.DS;


public class Car {
	public static int Numcar;
	static int init = 5;
	public static final Car M1 = new Car();
	public EmptyInterface mEmptyInterface;
	
	static{
		//Numcar = 5;
		System.out.println("Call Static");
	}
	
	public Car(){
	}
	
	public static int getCarNum(){
		Numcar++;
		return Numcar;
	}
	
	public static int getCarInit(){
		return init;
	}
	
	public interface EmptyInterface {
		boolean onTouch();
	}
	
	

}
