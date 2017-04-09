package com.DS;
import java.util.*;


public class LinkedList {
	private Node head = null;
	
	//{	head = null;	}
	
	public Node getHead(){
		return head;
	}
	
	public Node insertNode(int d){
		if(head == null){
			head = new Node(d);
			return head;
		}
		
		Node tmp = head;
		
		while(tmp.getNext() != null){
			tmp = tmp.getNext();
		}
		
		Node tmp2 = new Node(d);
		//tmp.next = tmp2;
		tmp.setNext(tmp2);
		
		
		return head;
	}
	
	public Node deleteNode(int d){
		if(head.data == d){
			head = head.next;
			return head;
		}
		
		Node prev = head;
		Node tmp = head.next;
		while(tmp != null && tmp.data != d){
			prev = prev.next;
			tmp = tmp.next;
		}
		
		if(tmp != null){
			prev.next = tmp.next;
		}
		
		return head;
	}
	
	public void printAllNode(){
		Node tmp = head;
		
		while(tmp != null){
			System.out.print(tmp.data+", " );
			tmp = tmp.next;
		}
		
		System.out.println("");
		
		return;
	}
	
	
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		ArrayList<String> myArr = new ArrayList<String>();
		
		for(int i = 0 ; i < 10; i++){
			list.insertNode(i);
			myArr.add("String"+ i);
		}
		list.printAllNode();
		list.deleteNode(5);
		list.printAllNode();
	}
	
}
