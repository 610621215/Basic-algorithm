package ggmod;


import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
//∞Ô≈|
public class gg7 {
	public static int count_len=10;
	public static int[] data;
	public static void main(String[]args) {
		setdata();
		show();
		 getdata();
		 stack_element();
		 
	}
	public static void setdata() {
		data=new int[count_len];
		for(int i=0;i<count_len;i++) {
			data[i]=new Random().nextInt(10);			
		}
	}
	public static void show() {
		for(int i=0;i<count_len;i++) {
			System.out.print(data[i]+"\t");
	
		}
		
	}
	public static void getdata(){
		Scanner input=new Scanner(System.in);
		int search_count=input.nextInt();
		int top=data.length-1;
		ArrayList<Integer> container=new ArrayList<Integer>();
		while(data[top]!=search_count) {
			container.add(data[top]);
			top--;
		}
		System.out.println(container);
	}
	public static void stack_element() {
		Scanner input=new Scanner(System.in);
		int input_count=input.nextInt();
		int insert_flag=data.length;
		try {
			data[insert_flag]=input_count;
		}catch(Exception ex) {
			data=Arrays.copyOf(data, data.length+1);
			count_len=data.length;
			data[insert_flag]=input_count;
			show();
		}
	}
}
