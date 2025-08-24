package LL;
import java.util.*;
class Node{
	int data;
	Node next;
	
	Node(int ele){
		this.data = ele;
		this.next = null;
	}
}

class Linkedlist{
	static Node head = null, tail = null;
	void insert(int ele) {
		Node nw = new Node (ele);
		if (head == null) {
			head = nw;
			tail = nw;
		}
		else {
			tail.next = nw;
			tail = nw;
		}
	}
	void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
	}
}
public class Single_LL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Linkedlist ll = new Linkedlist();
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