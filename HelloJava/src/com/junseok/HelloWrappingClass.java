package com.junseok;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HelloWrappingClass {
	public static void main(String[] arg){
		boolean primitiveBool = true;
		Boolean classBool;
		classBool = new Boolean(Boolean.TRUE);
		
		System.out.println(primitiveBool);
		System.out.println(classBool);		
		
		
		//AutoBoxing
		classBool = Boolean.TRUE;
		classBool = Boolean.valueOf(true);
		if(primitiveBool && classBool){
		//if(primitiveBool && classBool.booleanValue()){
			System.out.println("AND Operator Exec");
		}
		
//		Compile Error
//		int a;
//		if(a instanceof int){
//			DoNothing();
//		}
		
		Integer imInt = new Integer(5);
		if(imInt instanceof Integer){
			System.out.println("Yes, this is Integer with value " + imInt);
		}
		
		//Collection에는 Primitive type을 담을 수 없다.
		//Why????
		//Java Designer 마음
		Set <Integer> a = new HashSet <> ();
		ArrayList <Integer> b = new ArrayList<> ();
		ArrayList <Boolean> c = new ArrayList<> ();
		int[] d = new int[5];
		Boolean[] e = new Boolean [6];
	}
}
