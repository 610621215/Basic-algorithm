package ggmod;

import java.util.Scanner;

public class ggg6 {
	static int count_hand=6;
	class queue{
		int[] data=new int[1000];
		int head;
		int tail;
		public void full_up_hand() {
			Scanner input=new Scanner(System.in);
			this.tail=0;
			for(int i=0;i<count_hand;i++) {
				data[i]=input.nextInt();
				this.tail++;
			}
			System.out.println(tail);
		}
		public void full_up_hand(String txt) {
			for(int i=0;i<txt.length();i++) {
				data[i]=txt.charAt(i)-'0';
			}
		}
	}
	class stack{//desk
		int top=0;//¬ö¿ý®à­±µP³»
		int[] data=new int[10];//¬ö¿ý®à­±
	}
	public static void main(String[]args){
		ggg6 g2=new ggg6();
		queue p1=g2.new queue();
		queue p2=g2.new queue();
		stack container=g2.new stack();
		p1.full_up_hand();
		p2.full_up_hand();
		p1.head=1;
		p2.head=1;
		container.top=0;
		int[] record=new int[10];
		while(p1.tail!=p1.head&&p2.tail!=p2.head) {
			int temp=p1.data[p1.head];
			if(record[temp]!=0) {
				System.out.println("\nThis card already exist~!\n");
				System.out.println("p1"+p1.data[p1.head]);
				
				while(container.data[container.top]!=temp) {
					p1.tail++;
					container.top--;
					p1.data[p1.tail]=container.data[container.top];
					System.out.println("p1get"+container.data[container.top]+"\n");
					record[container.data[container.top]]=0;
					
				}
				System.out.println("\nReturn\n");
				p1.tail++;
				p1.data[p1.tail]=temp;
				p1.head++;
			}else {
				p1.head++;
				container.data[container.top]=temp;
				record[temp]++;
				container.top++;
			}

			System.out.println();
			for(int i=0;i<container.data.length;i++)
				System.out.print(container.data[i]+" ");
			temp=p2.data[p2.head];
			if(record[temp]!=0) {
				System.out.println("\nThis card already exist~!\n");
				System.out.println("p2"+container.top);
				System.out.println(p2.data[p2.head]);
				while(container.data[container.top]!=temp) {
					p2.tail++;
					container.top--;
					p2.data[p2.tail]=container.data[container.top];
					System.out.println("p2get"+container.data[container.top]+"\n");
					record[container.data[container.top]]=0;
//					container.top--;
				}
				System.out.println("\nReturn\n");
				p2.tail++;
				p2.data[p2.tail]=temp;
				p2.head++;
			}else {
				p2.head++;
				container.data[container.top]=temp;
				record[temp]++;
				container.top++;
			}
			System.out.println();
			for(int i=0;i<container.data.length;i++)
				System.out.print(container.data[i]+" ");
		}
		if(p1.head==p1.tail) {
			System.out.println("p2\n");
			for(int i=p2.head;i<p2.tail;i++)
				System.out.print(p2.data[i]+" ");
		}else {
			System.out.println("p1\n");
			for(int i=p1.head;i<p1.tail;i++)
				System.out.print(p1.data[i]+" ");
			}

			
		}
	
}
