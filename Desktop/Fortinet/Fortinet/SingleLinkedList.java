package com.yonas;

public class SingleLinkedList {
	//Time Complexity: O(n)
	//Space Complexity: O(1)
	
	public Node reverse(Node head){
		if(head==null || head.next==null){
			return head;
		}
		
		Node temp = head.next;
		head.next=null;
		
		while(temp.next!=null){
			Node temp2 = temp.next;
			temp.next = head;
			temp = temp2;
			head = temp;
			
		}
		temp.next = head;
		head = temp;
		
		return head;
	}

}


class Node {
	Node next;
	int value;
}