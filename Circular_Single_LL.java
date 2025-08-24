package LL;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int ele){
		this.data = ele;
		this.next = null;
	}
}
class LinkedList{
	static Node head= null, tail = null;
	void insert(int ele) {
		Node nw = new Node(ele);
		if(head == null) {
			head = nw;
			tail = nw;
		}
		else {
			tail.next = nw;
			tail = nw;
		}
		nw.next = head;
	}
	void display() {
		Node temp = head;
		do {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}while(temp != null);
	}
}
public class Circular_Single_LL {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		while(true){
			int ele = sc.nextInt();
			if(ele < 0)
				break;
			ll.insert(ele);
		}
		sc.close();
		ll.display();
	}
}
