package lab1;

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
	/*	StackX st1 = new StackX(10);
		st1.push('a');
		st1.push('b');
		st1.push('v');
		st1.push('d');
		st1.push('e');
		
		st1.peek();
		
		while(!st1.isEmpty()) {
			System.out.println(st1.pop());
		}
	 */
		//Part 2 Labsheet1
		System.out.print("Enter An Expression : ");
		Scanner sc = new Scanner(System.in);
		String val = sc.nextLine();
		sc.close();
		int len = val.length();

		StackX st1 = new StackX(len);
		
		for(int i=0; i < len ; i++) {
			char ch = val.charAt(i);
			if(ch == '(') {
				st1.push(ch);
			}
			else if(ch == ')') {
				char ch2 = st1.pop();
				if(ch2 != '(') {
					System.out.println("Invalid String !");
					return ;
				}
			}
		}
		
		if(st1.isEmpty())
			System.out.println("Valid String!");
		else
			System.out.println("Invalid String");
		
	}

}
