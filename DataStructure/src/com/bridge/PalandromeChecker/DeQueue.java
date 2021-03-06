package com.bridge.PalandromeChecker;

import com.bridge.CashCounter.Person;

public class DeQueue {
	char ch[] ;
	int front,rear,size,l;
	
	/******Constructor to inithialize a variable*****/
	public DeQueue(int num) {
		l = num;
		ch = new char[l];
		front = -1;
		rear = -1;
		size = 0;
	}
	/*********Methode to check Queue is empty or not***********/
	public boolean isEmpty() {
		if(front == -1)
			return true;
		if(size == 0)
			return true;
		return false;
	}
	/*********Methode to check Queue is Full or not***********/
	public boolean isFull() {
		if(size == l)
			return true;
		return false;
	}
	/*********Methode to front EnQueue***********/
	public void frontEnqueue(char chr) {
		
		if(front == 0) 
			System.err.println("You cannot enqueue from front");
		else
			ch[--front] = chr;
		size--;
		
	}
	/*********Methode to front DeQueue***********/
	public char frontDequeue() {
		if(isEmpty())
			throw new IllegalStateException("UnderFlow");
		char temp = ch[front];
		front++;
		size--;
		return temp;
	}
	/*********Methode to rear EnQueue***********/
	public void rearEnqueue(char chr) {
		if(front == -1 && rear == -1){
			front++;
			rear++;
			ch[rear] = chr;
			size++;
		}else {
			ch[++rear] = chr;
			size++;
		}
	}
	/*********Methode to rear DeQueue***********/
	public char rearDeQueue() {
		char temp ;
		if(isEmpty())
			throw new IllegalStateException("UnderFlow");
		else {
			temp = ch[rear];
			rear--;
			size--;
		}
			return temp;
	}
}
