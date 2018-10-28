/****************************************************************************
 *
 * Created by: Peter Zhu
 * Created on: Oct 2018
 * This is a program about stack class that can import to other class
 *
 ****************************************************************************/

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MrCoxallStack {
	
	ArrayList<Integer> list = new ArrayList<Integer> ();
	
	public void push(int userInput) {
		list.add(userInput);
	}
	
	public void pop() {
		if (list.size() == 0 || list.size() < 0) {
			System.out.println("The arrayList is empty! ");
		}
		else {
			list.remove(list.size()-1);
		}
	}
	
	public void print() {
		System.out.println(list);
	}
	
	public void count() {
		System.out.println("The length of the arrayList is " + list.size());
	}
	
}
