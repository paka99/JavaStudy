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
		//소용없다. ref인 Integer a를 stack에 옮겨와서 heap영역을 할당받지만 
		//실제 ref는 main 메서드 stack에 잡혀있기 때문이다.
		//a = new Integer (5);
	}
}
