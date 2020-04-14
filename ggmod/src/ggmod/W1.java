package ggmod;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//程式教學Day#2
//幾A幾B
interface go_game{
	public void winandlose();//幾A幾B
	public void create_data();//生成資料
	public void input_data();//輸入資料
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
				System.out.println("答對了");
				break;
			}else {
				check++;
			}
			if(check==5) {
				System.out.println("連續猜錯"+check+"次");
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
				System.out.println("僅限1-9之間，不能是負數及任意由雙位數所組成之數字，輸入錯誤");
			}else if(!Character.isDigit(tp.charAt(0))) {
					System.out.println("不是數字");		
			}else if(input_table[tp.charAt(0)-'0']!=0){
				System.out.println("重複的輸入");			
			}else {
				data[index]=tp.charAt(0)-'0';
				System.out.println("正確的輸入");
				input_table[tp.charAt(0)-'0']++;
				index++;
			}
			if(index==4) {
				break;
			}
			System.out.println("目前的輸入規範(x表示未輸入,或輸入失敗)");
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
		System.out.println("答案");
		for(int i=0;i<answer.length;i++) {
			System.out.print((Integer)answer[i]);
			
		}
		System.out.println();
	}
}
