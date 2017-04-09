package com.junseok;

import com.DS.Car;

public class EffectiveJava {
	public static void main(String[] args){
		//EXAMPLE: Static Factory Method
		//2016.12.1
		Boolean a = Boolean.valueOf(false);
		System.out.println(a);
		System.out.println(Car.getCarNum());
		Boolean.valueOf(true);
		
		//Bad case Getting static field
		//Car car1 = new Car();
		//System.out.println(car1.Numcar);
		
	}

}
