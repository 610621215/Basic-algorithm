package ggmod;
//小貓釣魚
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
public class gg6 {
	static int count_hand=6;
	class queue{
		int[] data=new int[1000];
		int head;
		int tail;
		public void full_up_hand() {
			Scanner input=new Scanner(System.in);
			for(int i=0;i<count_hand;i++)
				data[i]=input.nextInt();
		}
		public void full_up_hand(String txt) {
			for(int i=0;i<txt.length();i++) {
				data[i]=txt.charAt(i)-'0';
			}
		}
	}
	class stack{//desk
		int top=0;//紀錄桌面牌頂
		int[] data=new int[10];//紀錄桌面
	}
	public static void main(String[]args) {
		gg6 g6=new gg6();
		queue p1=g6.new queue();
		queue p2=g6.new queue();
		stack dsk=g6.new stack();
		String txt="241256";
		dsk.top=0;
		p1.full_up_hand("241256");
		p2.full_up_hand("313564");
		p1.tail=txt.length()-1;//位置5
		p1.head=0;
		p2.tail=txt.length()-1;//位置5
		p2.head=0;
		int[] win=new int[10];//當一張牌出現第二次的時候
		while(p1.head!=p1.tail&&p2.head!=p2.tail) {
			//p1出招
			int temp_card=p1.data[p1.head];
			System.out.println("\nP1打過的牌"+temp_card);
			if(win[temp_card]!=0) {
				System.out.println("P1重複了");
				p1.head++;
				int top_flag=dsk.top;
				
				while(dsk.data[dsk.top]!=temp_card) {
					System.out.println("p1找到了"+"位置"+dsk.top+"至"+top_flag+"頂部"+dsk.top);
					System.out.println("p1Get card:"+dsk.data[dsk.top]);
					win[dsk.data[dsk.top]]=0;
					p1.tail++;
					p1.data[p1.tail]=dsk.data[dsk.top];//先空出一個位置給住列
					dsk.top--;
				}
				System.out.println("p1抽取結束"+dsk.top);
			}else {
				dsk.top++;
				dsk.data[dsk.top]=temp_card;
				System.out.println("\n頂部"+dsk.top);
				win[temp_card]++;
				p1.head++;
			}
			System.out.println("\nDesk:");
			for(int i=0;i<dsk.data.length;i++) {
				System.out.print(dsk.data[i]+" ");
			}
			temp_card=p2.data[p2.head];
			System.out.println("\nP2打過的牌"+temp_card);
			if(win[temp_card]!=0) {
				System.out.println("P2說重複了");
				int top_flag=dsk.top;
//				p2.head++;
				System.out.println(p2.head);
				
				while(dsk.data[dsk.top]!=temp_card) {
					System.out.println("p2找到了"+"位置"+dsk.top+"至"+top_flag+"頂部"+dsk.top);
					System.out.println("p2Get card:"+dsk.data[dsk.top]);
					win[dsk.data[dsk.top]]=0;
					p2.data[p2.tail]=dsk.data[dsk.top];
					p2.tail++;
					dsk.top--;
				}
				System.out.println("p2抽取結束"+dsk.top);
			}else {
				dsk.top++;
				dsk.data[dsk.top]=temp_card;
				System.out.println("\n頂部"+dsk.top);
		
				win[temp_card]++;
				p2.head++;
			}
			System.out.println();
			for(int i=0;i<dsk.data.length;i++) {
				System.out.print(dsk.data[i]+" ");
				
			}

		}
		if(p2.tail==p2.head) {
			System.out.println("\np1贏了,手上:");
			shownowhand(p1.data,p1.tail,p1.head);
			System.out.println("\n牌桌:\n");
			shownowhand(dsk.data,dsk.top,0);
		}else {
			System.out.println("\np2贏了,手上:");
			System.out.println(p1.head+"\t"+p1.tail);
			shownowhand(p2.data,p2.tail,p2.head);
			System.out.println("\n牌桌:");
			shownowhand(dsk.data,dsk.top,0);
		}
	}
	public static void shownowhand(int[] player_hand,int tail,int head){
		for(int i=head;i<tail;i++) {
			System.out.print(player_hand[i]+" ");
		}
		
	}
	
	
	

	
}
