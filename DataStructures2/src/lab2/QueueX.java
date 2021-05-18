package lab2;

public class QueueX {

	private int maxSize;
	private int front;
	private int rear;
	private int [] arrayQueue;
	private int nItems;
	
	public QueueX(int s) {
		this.maxSize = s;
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
		arrayQueue = new int[maxSize];
	}
	
	public void insert(int x) {
		if(rear == maxSize-1) {
			System.out.println("Queue is FULL ! ");
			return ;
		}
		else {
			arrayQueue[++rear] = x;
			nItems++;
		}
	}
	
	public int remove() {
		if(nItems == 0) {
			System.out.println("Queue is Empty !");
			return -99;
		}
		else {
			nItems--;
			
			return arrayQueue[front++];
		}
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == maxSize-1);
	}
}
