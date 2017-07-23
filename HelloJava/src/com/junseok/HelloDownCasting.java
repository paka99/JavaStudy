package com.junseok;

import com.DS.Animal;
import com.DS.Dog;


public class HelloDownCasting {
	
	public static void main(String[] arg){
		//UpCasting
		Animal ani = new Dog();
		
		//Animal�� ���ǵ� Method�� ȣ�� �����ϴ�.
		ani.sleep();
		ani.move();
		//ani.run();		//Compile Error!
		
		//DownCasting
		Dog dog = (Dog)ani;
		
		//DownCasting���� Dog�� ����� Method�� ȣ���� ����������.
		dog.run();
		//Animal�� instance�� ani�����ε� Dog class�� ����� Method run�� ȣ���� �� �ִ�.
		//�̶�, ��ȣ�� �켱������ �� ����������Ѵ�.
		((Dog)ani).run();
		
		//ani�� type�� ������ Animal�̴�.
		if(ani instanceof Animal){
			System.out.println("ani is Animal");
		}
		
		else if(ani instanceof Dog){
			System.out.println("ani is Dog");
		}
		
		Dog dog2 = (Dog)new Dog();
		
		//ani�� dog�� call by ref�� ���� ���� �޸� ������ ����Ų��.
		System.out.println("ani id" + ani.toString());
		System.out.println("dog id" + dog.toString());
		System.out.println("dog2 id" + dog2.toString());
		
	}
}
