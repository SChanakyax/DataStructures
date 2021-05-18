package lab1;

public class StackX {

	private char [] Stackarray;
	private int top;
	private int maxSize;
	
	
	public StackX(int n) {
		this.top = -1;
		this.maxSize = n;
		Stackarray = new char[maxSize];
	}
	
	public void push(char j) {
		if(top==maxSize-1)
			System.out.println("Stack is FULL ! ");
		else {
			Stackarray[++top] = j;
		}
	}
	
	public char pop() {
		if(top ==-1) {
			System.out.println("Stack Is EMPTY !");
		return ' ';
	}
		else {
			return Stackarray[top--];
		}
	}
	
	public char peek() {
		if(top == -1) {
			System.out.println("Empty Stack");
			return ' ';
		}
		else {
			return Stackarray[top];
		}
	}
	
	public boolean isEmpty() {
		return (top == -1) ;
	}
	
	public boolean isFull() {
		return (top == maxSize-1);
	}
}
