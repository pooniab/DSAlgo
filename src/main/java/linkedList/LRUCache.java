package linkedList;

import java.awt.List;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;


public class LRUCache {
	
	Set<Integer> s1;
	int capacity;
	
	public LRUCache (int capacity) {
		this.s1 = new HashSet<Integer>(capacity);
		this.capacity = capacity;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUCache l1= new LRUCache(6);
		
		l1.check(1);
		l1.check(3);
		l1.check(5);
		l1.check(8);
		l1.check(3);
		l1.check(16);
		l1.check(20);
		l1.check(10);
		l1.check(3);
		l1.check(3);
		l1.check(5);
		l1.display();

	}

	private void display() {
		LinkedList< Integer> list = new LinkedList<>(s1);
		
		Iterator<Integer> it = list.descendingIterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

	private void check(int i) {
		
		if (getkey(i)==false) {
			putkey(i);
		}
		
		
	}

	private void putkey(int i) {
		if (s1.size()==capacity) {
			int firstkey = s1.iterator().next();
			s1.remove(firstkey);
		}
			s1.add(i);
		
	}

	private boolean getkey(int i) {
		
		if (!s1.contains(i)) 
		return false;
		s1.remove(i);
		s1.add(i);
		return true;			
		
	}
	

}
