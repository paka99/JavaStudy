package com.junseok;

import java.lang.ref.*;

public class HelloGC {
	public static void main(String[] arg){
		Integer num = new Integer(4);
		System.out.println("Before Alloc: " + num.intValue());
		getInstance(num);
		System.out.println("After Alloc: " + num.intValue());
		
		WeakReference<Integer> wr = new WeakReference<Integer>( new Integer(0));
		SoftReference<Integer> wr2 = new SoftReference<Integer>( new Integer(0));

	}
	
	static void getInstance(Integer a){
		//�ҿ����. ref�� Integer a�� stack�� �Űܿͼ� heap������ �Ҵ������ 
		//���� ref�� main �޼��� stack�� �����ֱ� �����̴�.
		//a = new Integer (5);
	}
}
