
import java.util.*;
public class StudentManagement {
	Node start=null,end=null;
	
public class Node{
	String name;
	String dept;
	int number;
	Node next;

public Node(String name,String dept,int number) {
	this.name=name;
	this.dept=dept;
	this.number=number;
	this.next=null;
	
}
}
void insert(String name,String dept,int number) {
	Node newnode=new Node(name,dept,number);
	if(start==null) {
		start=newnode;
		end=newnode;
	}else {
		end.next=newnode;
		end=newnode;
		
	}
}
void display() {
	Node i=start;
	while(i!=null) {
		System.out.println("Studentname: "+i.name+" dept:  "+i.dept+" Number: "+i.number);
		i=i.next;
	}
}
public static void main(String args[]) {
	StudentManagement s=new StudentManagement();
	s.insert("vidya","CSE",813450430);
	s.insert("Uma","IT",813450430);
	s.insert("Durga","ECE",953450430);
	s.insert("Devi","EEE",753450430);
	s.display();
	
}
}
