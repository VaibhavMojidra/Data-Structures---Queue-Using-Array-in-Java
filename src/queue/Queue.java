package queue;

import queue.queueexceptions.QueueOverFlowException;
import queue.queueexceptions.QueueUnderFlowException;

public class Queue {
	private int maxSize;
	private int front;
	private int rear;
	private int arr[];
	
	public Queue() {
		maxSize=10;
		front=rear=0;
		arr=new int[maxSize];
	}
	
	public Queue(int maxSize) {
		this.maxSize=maxSize;
		arr=new int[maxSize];
	}
	
	
	public boolean isFull() {//O(1)
		return rear==maxSize;
	}
	
	public boolean isEmpty() { //O(1)
		return rear==front;
	}
	
	public boolean enqueue(int data) throws QueueOverFlowException { //O(1)
		if(isFull()) {
			throw new QueueOverFlowException("Queue is full");
		}else {
			arr[rear]=data;
			rear++;
			return true;
		}
	}
	
	public boolean dequeue() throws QueueUnderFlowException { //O(n)
		if(isEmpty()) {
			throw new QueueUnderFlowException("Queue is empty");
		}else {
			for(int i=front;i<rear-1;i++) {
				arr[i]=arr[i+1];
			}
			if(rear<maxSize) {
				arr[rear]=0;
			}
			rear--;
			return true;
		}
	}
	
	public int peek() throws QueueUnderFlowException  {//O(1)
		if(isEmpty()) {
			throw new QueueUnderFlowException("Queue is empty");
		}else {
			return arr[front];
		}
	}
	
	public void displayQueue() { //O(n)
		for(int i=front;i<length();i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
	
	public int length() {
		return rear;
	}
}
