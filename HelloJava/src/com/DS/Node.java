package com.DS;

public class Node {
	protected int data;
	protected Node next;
	int[] myArr;
	
	//Application of Instance Initialization block
	{
		myArr = new int [10];
		for(int i = 0; i < 10; i++)
			myArr[i] = i+1;
	}
	
	Node(int d) {
		data = d;
		next = null;
	}
	
	public Node getNext(){
		return next;
	}
	
	public Node setNext(Node n) {
		next = n;
		return n;
	}
	

}
