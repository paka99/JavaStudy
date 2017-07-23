package com.junseok;

import com.DS.Animal;
import com.DS.Dog;


public class HelloDownCasting {
	
	public static void main(String[] arg){
		//UpCasting
		Animal ani = new Dog();
		
		//Animal에 정의된 Method만 호출 가능하다.
		ani.sleep();
		ani.move();
		//ani.run();		//Compile Error!
		
		//DownCasting
		Dog dog = (Dog)ani;
		
		//DownCasting으로 Dog에 선언된 Method도 호출이 가능해진다.
		dog.run();
		//Animal의 instance인 ani만으로도 Dog class에 선언된 Method run을 호출할 수 있다.
		//이때, 괄호로 우선순위를 잘 지정해줘야한다.
		((Dog)ani).run();
		
		//ani의 type은 여전히 Animal이다.
		if(ani instanceof Animal){
			System.out.println("ani is Animal");
		}
		
		else if(ani instanceof Dog){
			System.out.println("ani is Dog");
		}
		
		Dog dog2 = (Dog)new Dog();
		
		//ani와 dog는 call by ref로 인해 같은 메모리 공간을 가리킨다.
		System.out.println("ani id" + ani.toString());
		System.out.println("dog id" + dog.toString());
		System.out.println("dog2 id" + dog2.toString());
		
	}
}
