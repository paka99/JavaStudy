package com.junseok;

public class HelloStringPool {
	public static void main(String[] arg){
		
		String str1 = new String("tmp1");
		String str2 = new String("tmp1");
		String str3 = "tmp1";
		String str4 = "tmp1";
		
//		System.out.println("str1 is " + str1);
//		System.out.println("str2 is " + str2);
//		System.out.println("str3 is " + str3);
		
		System.out.println(System.identityHashCode("tmp1"));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		
//		if(str2 == str3.intern()){
//			System.out.println("str1 and str3 are same");
//		}
//		
//		str2 = str2.replace('t', 'n');
//		str3 = str3.replace('t', 'n');
//		
//		System.out.println("==========Transform============");
//		
//		System.out.println("str1 is " + str1);
//		System.out.println("str2 is " + str2);
//		System.out.println("str3 is " + str3);
	}

}
