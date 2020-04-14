package ggmod;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//�{���о�Day#2
//�XA�XB
interface go_game{
	public void winandlose();//�XA�XB
	public void create_data();//�ͦ����
	public void input_data();//��J���
}
public class W1 implements go_game{
	public static int[] data=new int[4];
	public static Object[] answer=new Object[4];
	public static int A=0;
	public static int B=0;
	public static int check=0;
	public static void main(String[]args) {
		W1 hl6=new W1();
		hl6.create_data();
		while(true) {
			if(A==4) {
				System.out.println("����F");
				break;
			}else {
				check++;
			}
			if(check==5) {
				System.out.println("�s��q��"+check+"��");
				break;
			}
			show_answer();
			hl6.input_data();
			hl6.winandlose();
		}
	}

	@Override
	public void winandlose() {
		// TODO Auto-generated method stub
		Integer[] answer=new Integer[this.answer.length];
		for(int i=0;i<this.answer.length;i++) {
			System.out.println(this.answer[i]);
			answer[i]=(Integer)this.answer[i];
		}
		A=0;
		B=0;
		for(int i=0;i<answer.length;i++) {
			for(int j=0;j<answer.length;j++) {
				if(answer[i]==data[j]&&i==j) {	
					A++;
				}else if(answer[i]==data[j]&&i!=j) {
					B++;
				}
				
			}
			
		}
		show_answer();
		System.out.println("\n"+A+"A"+B+"B");
		data=new int[4];
	}

	@Override
	public void create_data() {
		// TODO Auto-generated method stub
		int[] num_table=new int[10];
		ArrayList<Integer> answer=new ArrayList<Integer>();
		int num=0;
		for(int i=0;i<4;i++) {
			num=(new Random().nextInt(9))+1;
			while(num_table[num]!=0) {
				num=(new Random().nextInt(9))+1;
			}
			num_table[num]=1;
			answer.add(num);
		}
		this.answer=answer.toArray();
		
	}

	@Override
	public void input_data() {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("input");
		int index=0;
		int[] input_table=new int[10];
		while(true) {
			String tp=input.next();
			if(tp.length()>=2) {
				System.out.println("�ȭ�1-9�����A����O�t�ƤΥ��N������ƩҲզ����Ʀr�A��J���~");
			}else if(!Character.isDigit(tp.charAt(0))) {
					System.out.println("���O�Ʀr");		
			}else if(input_table[tp.charAt(0)-'0']!=0){
				System.out.println("���ƪ���J");			
			}else {
				data[index]=tp.charAt(0)-'0';
				System.out.println("���T����J");
				input_table[tp.charAt(0)-'0']++;
				index++;
			}
			if(index==4) {
				break;
			}
			System.out.println("�ثe����J�W�d(x��ܥ���J,�ο�J����)");
			for(int i=0;i<data.length;i++) {
				if(data[i]>0) {
					System.out.print(data[i]);
				}else {
					System.out.print("x");
				}
				
			}
		}
	}
	public static void show_answer() {
		System.out.println("����");
		for(int i=0;i<answer.length;i++) {
			System.out.print((Integer)answer[i]);
			
		}
		System.out.println();
	}
}
