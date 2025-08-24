package LL;
import java.util.*;
class Node{
	int data;
	Node next;
	Node prev;
	
	Node(int ele){
		this.data = ele;
		this.next = null;
		this.prev = null;
	}
}

class LinkedList{
	static Node head = null, tail = null;
	void insert(int ele) {
		Node nw = new Node (ele);
		if (head == null) {
			head = nw;
			tail = nw;
		}
		else {
			tail.next = nw;
			nw.prev = tail;
			tail = nw;
		}
		tail.next = head;
		head.prev = tail;
	}
	void display() {
		Node temp = head;
		do {
			System.out.print(temp.data + " ");
		}while(temp != null);
	}
}
public class Double_Circular{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		while (true) {
			int ele = sc.nextInt();
			if(ele < 0)
				break;
			ll.insert(ele);
		}
		ll.display();
		sc.close();
	}
}