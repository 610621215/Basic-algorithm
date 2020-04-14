package ggmod;

import java.util.PriorityQueue;
import java.util.*;
//字串比較大小的規則
public class TGG6 {
	 public static void main(String[] args) {
	        // Create a Priority Queue
	        PriorityQueue<String> namePriorityQueue = new PriorityQueue<>();

	        // Add items to a Priority Queue (ENQUEUE)
	        namePriorityQueue.add("elephant");
	        namePriorityQueue.add("tiger");
	        namePriorityQueue.add("monkey");
	        show("Lisa");
	        show("John");
	        // Remove items from the Priority Queue (DEQUEUE)
	        while (!namePriorityQueue.isEmpty()) {
	            System.out.println(namePriorityQueue.remove());
	        }

	    }
	 public static void show(String name) {
	     int total=0;
	     for(int i=0;i<name.length();i++)
	        total=total+name.charAt(i);
	     System.out.println(total);
		 
	 }
}
