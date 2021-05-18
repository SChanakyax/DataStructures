package lab2;

import java.util.Scanner;

public class QueueApp {

	public static void main(String[] args) {
	
		QueueX printerQueue = new QueueX(5);
		QueueX evenQueue = new QueueX(5);
		QueueX oddQueue = new QueueX(5);
		
		Scanner sc = new Scanner(System.in);
		int input;
		for(int i=0;i<5;i++) {
			
			System.out.print("Enter transaction ID"+ i+ ":");
			input = sc.nextInt();
			printerQueue.insert(input);
		}
		sc.close();
		
		int temp;
		
		for(int j=0; j<5 ;j++) {
			temp = printerQueue.remove();
			if(temp%2 == 0) {
				evenQueue.insert(temp);
			}
			else {
				oddQueue.insert(temp);
			}		
		}//-for
		
		System.out.println("PC1:");
		
		while(!evenQueue.isEmpty()) {
			System.out.println("Transaction : " + evenQueue.remove());
		}
		System.out.println();
		System.out.println("PC2 :");
		while(!oddQueue.isEmpty()) {
			System.out.println("Transaction : " +oddQueue.remove());
		}
		
	}//-main

}//-class
