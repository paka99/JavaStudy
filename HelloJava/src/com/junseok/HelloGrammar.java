package com.junseok;

class AccessSpecifierTest {
	public final static int CONST = 4;
	
	public static int b = 6;
	public final static int REF = b;
	
	
	protected class Struct{
		int a;
	}

}

class ASTChild extends AccessSpecifierTest{

	public void func(){
		Struct a = new ChildStruct();
//		AccessSpecifierTest.CONST = 5;
//		AccessSpecifierTest.REF =6;
		AccessSpecifierTest.b = 8;
	}
	
	public class ChildStruct extends Struct{
		
		public void foo(){
			//Java에서 Static local variable을 허용하지 않는 이유:
			//-> 그렇게 쓸바엔 차라리 field에서 static variable 멤버로 선언하는게 오류가 적기 때문에
			//static int imFinal;
			
			//super.a = 1;	//ERROR: Unvisible
		}
	}
	
	
}


public class HelloGrammar {

	public static void main(String[] args){
//		EXAMPLE: Assignment statement and prefix increment, post-fix increment
		int i =2;
		i = ++i - i++;
		System.out.println(i);
		
		i =2;
		i = i++ - ++i;
		System.out.println(i);
		
		
		
		
		
	}
	
	
	
	
}
