package ggmod;

import java.util.ArrayList;
import java.util.Scanner;

public class adgg6 {
	class inner{
		int head;
		int tail;
		int[] data=new int[100];
		
	}
	class box{
		int top;
		int[] data=new int[10];
	}
	public static void main(String[]args) {
		adgg6 main=new adgg6();
		inner p1=main.new inner();
		inner p2=main.new inner();
		box box=main.new box();
		p1.head=1;
		p1.tail=1;
		p2.head=1;
		p2.tail=1;
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=6;i++) {
			p1.data[i]=input.nextInt();
			p1.tail++;
		}
		for(int i=1;i<=6;i++) {
			p2.data[i]=input.nextInt();
			p2.tail++;
		}
		
		int match_count=0;
		box.top=0;
		int top=box.top;
//		System.out.println(top);
		int[] card_history=new int[10];
		ArrayList<Integer> book=new ArrayList<Integer>();
		int current=0;
		while(p1.head!=p1.tail&&p2.head!=p2.tail) {//&&p2.head!=p2.tail) {//自己比
			current=p1.data[p1.head];
//			//2 4 1 2 5 6
			//3 1 3 5 6 4
//			System.out.println(top);
			if(card_history[current]==0) {
				p1.head++;
				top++;
				box.data[top]=current;
				card_history[current]=1;
			}else {
				p1.head++;
				System.out.println();				
				p1.data[p1.tail]=current;//序列6號位置而實際也到6
				p1.tail++;
				while(box.data[top]!=current){
					p1.data[p1.tail]=box.data[top];
					card_history[box.data[top]]=0;
//					book.add(box.data[top]);//紀錄贏者牌
					top--;
					p1.tail++;
				}
			}
				current=p2.data[p2.head];
				System.out.println("p2:"+current);
//				//2 4 1 2 5 6
//				System.out.println(top);
				if(card_history[current]==0) {
					p2.head++;
					top++;
					box.data[top]=current;
					card_history[current]=1;
				}else {
					p2.head++;
					System.out.println();				
					p2.data[p2.tail]=current;//序列6號位置而實際也到6
					p2.tail++;
					while(box.data[top]!=current){
						p2.data[p2.tail]=box.data[top];
						card_history[box.data[top]]=0;
//						book.add(box.data[top]);//紀錄贏者牌
						top--;
						p2.tail++;
					}
				}
				System.out.println();
				for(int i=0;i<box.data.length;i++) {
					System.out.print(box.data[i]);
					
				}
			}
		if(p2.head==p2.tail) {
			System.out.println("p1win"+p1.head+p1.tail);
			shownowhand(p1.data,p1.tail,p1.head);
			
		}else {
			System.out.println("p2win");

			shownowhand(p2.data,p2.tail,p2.head);
		}
	}
	public static void shownowhand(int[] player_hand,int tail,int head){
		for(int i=head;i<tail;i++) {
			System.out.print(player_hand[i]+" ");
		}
		
	}
	
}
