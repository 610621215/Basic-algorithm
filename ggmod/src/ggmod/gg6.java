package ggmod;
//�p�߳���
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
		int top=0;//�����ୱ�P��
		int[] data=new int[10];//�����ୱ
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
		p1.tail=txt.length()-1;//��m5
		p1.head=0;
		p2.tail=txt.length()-1;//��m5
		p2.head=0;
		int[] win=new int[10];//��@�i�P�X�{�ĤG�����ɭ�
		while(p1.head!=p1.tail&&p2.head!=p2.tail) {
			//p1�X��
			int temp_card=p1.data[p1.head];
			System.out.println("\nP1���L���P"+temp_card);
			if(win[temp_card]!=0) {
				System.out.println("P1���ƤF");
				p1.head++;
				int top_flag=dsk.top;
				
				while(dsk.data[dsk.top]!=temp_card) {
					System.out.println("p1���F"+"��m"+dsk.top+"��"+top_flag+"����"+dsk.top);
					System.out.println("p1Get card:"+dsk.data[dsk.top]);
					win[dsk.data[dsk.top]]=0;
					p1.tail++;
					p1.data[p1.tail]=dsk.data[dsk.top];//���ťX�@�Ӧ�m����C
					dsk.top--;
				}
				System.out.println("p1�������"+dsk.top);
			}else {
				dsk.top++;
				dsk.data[dsk.top]=temp_card;
				System.out.println("\n����"+dsk.top);
				win[temp_card]++;
				p1.head++;
			}
			System.out.println("\nDesk:");
			for(int i=0;i<dsk.data.length;i++) {
				System.out.print(dsk.data[i]+" ");
			}
			temp_card=p2.data[p2.head];
			System.out.println("\nP2���L���P"+temp_card);
			if(win[temp_card]!=0) {
				System.out.println("P2�����ƤF");
				int top_flag=dsk.top;
//				p2.head++;
				System.out.println(p2.head);
				
				while(dsk.data[dsk.top]!=temp_card) {
					System.out.println("p2���F"+"��m"+dsk.top+"��"+top_flag+"����"+dsk.top);
					System.out.println("p2Get card:"+dsk.data[dsk.top]);
					win[dsk.data[dsk.top]]=0;
					p2.data[p2.tail]=dsk.data[dsk.top];
					p2.tail++;
					dsk.top--;
				}
				System.out.println("p2�������"+dsk.top);
			}else {
				dsk.top++;
				dsk.data[dsk.top]=temp_card;
				System.out.println("\n����"+dsk.top);
		
				win[temp_card]++;
				p2.head++;
			}
			System.out.println();
			for(int i=0;i<dsk.data.length;i++) {
				System.out.print(dsk.data[i]+" ");
				
			}

		}
		if(p2.tail==p2.head) {
			System.out.println("\np1Ĺ�F,��W:");
			shownowhand(p1.data,p1.tail,p1.head);
			System.out.println("\n�P��:\n");
			shownowhand(dsk.data,dsk.top,0);
		}else {
			System.out.println("\np2Ĺ�F,��W:");
			System.out.println(p1.head+"\t"+p1.tail);
			shownowhand(p2.data,p2.tail,p2.head);
			System.out.println("\n�P��:");
			shownowhand(dsk.data,dsk.top,0);
		}
	}
	public static void shownowhand(int[] player_hand,int tail,int head){
		for(int i=head;i<tail;i++) {
			System.out.print(player_hand[i]+" ");
		}
		
	}
	
	
	

	
}
