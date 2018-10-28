/****************************************************************************
 *
 * Created by: Peter Zhu
 * Created on: Oct 2018
 * This is a program about stack which import MrCoxallClass
 *
 ****************************************************************************/

import java.util.ArrayList;
import java.util.Scanner;

public class Stack {
	
	public static void main(String[] args) {
		
		MrCoxallStack stack = new MrCoxallStack();
		
		do {
			
			System.out.println("Enter an Integer that can put on the stack or enter a command to run the function .");
			System.out.println("Note: -1 is pop. Positive numbers still numbers");
			
			Scanner scanner = new Scanner(System.in);
			
			if(scanner.hasNextInt()) {
				int user = scanner.nextInt();
				
				// Push the number on the array
				if(user == -1) {
					stack.pop();
				}
				else if (user >= 0) {
					stack.push(user);
				}
				
				stack.print();
				stack.count();
				
			}else{
				System.out.println("Invalid Input! Please input some integers! ");
			}
			
		}while(true);
		
	}
	
}
