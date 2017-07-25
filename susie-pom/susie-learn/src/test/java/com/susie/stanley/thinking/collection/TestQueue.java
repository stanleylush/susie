package com.susie.stanley.thinking.collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

import org.junit.Test;

public class TestQueue {
	
	/**
	 * 存 queue
	 * Queue <-- LinkedList
	 * 先进先出
	 */
	@Test
	public void testQueueLinkedList(){
//		Queue<Integer> qi = new LinkedList<Integer>();
//		Random r = new Random(47);
//		for(int i=0; i<10; i++){
//			qi.offer(r.nextInt(i+10));
//		}
//		printQueue(qi);
		Queue<Character> qc = new LinkedList<Character>();
		for(char c: "stanleylus".toCharArray()){
			qc.offer(c);
		}
		printQueueNull(qc);
	}
	
	/**
	 * priorityQueue 按优先级排序
	 */
	@Test
	public void testPriorityQueue(){
		Set<Character> set = new HashSet<Character>();
		for(char c: "stanleylus".toCharArray()){
			set.add(c);
		}
		PriorityQueue<Character> pq = new PriorityQueue<Character>(set);
		printQueueException(pq);
	}

	/**
	 * 取 queue 能取到null
	 * 
	 * Object java.util.Queue.peek()
	 * 	Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
	 * 	Returns:the head of this queue, or null if this queue is empty
	 * Object java.util.Queue.poll()
	 * 	Retrieves and removes the head of this queue, or returns null if this queue is empty.
	 * 	Returns:the head of this queue, or null if this queue is empty
	 * @param queue
	 */
	private void printQueueNull(Queue queue){
		while(queue.peek() != null){
			System.out.println(queue.size()+"-"+queue.poll()+"-"+queue.size()+" ");
		}
	}
	
	/**
	 * 取 queue null 时 Exception
	 * Object java.util.Queue.remove()
	 * 	Retrieves and removes the head of this queue. This method differs from poll only in that it throws an exception if this queue is empty.
	 * 	Returns:the head of this queue
	 * 	Throws:NoSuchElementException - if this queue is empty
	 * @param queue
	 */
	private void printQueueException(Queue queue){
		while(queue.element() != null){
			System.out.println(queue.size()+"-"+queue.remove()+"-"+queue.size()+" ");
		}
	}

}
