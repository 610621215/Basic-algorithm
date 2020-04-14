package ggmod;

import java.util.Scanner;

public class ggg2 {
//定向推移
//遞迴
	static int[] data=new int[]{6,1,2,7,9,3,4,5,10,8};
		
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] data2=new int[data.length];
		int dope_flag=input.nextInt();
		int search_index=data.length-2;
		show(data);
//		for(int i=1;i<data.length;i++) {
//			
//			data2[i]=push(i,dope_flag);
//			
//		}
		push2(search_index,dope_flag);
		show(data);
		
	}
	public static int push(int search_index,int stop_flag) {
		
//		if(search_index==stop_flag) {
//			return 0;
//		}
		
		return data[search_index-1];
	}
	public static int push2(int search_index,int stop_flag) {
		data[search_index+1]=data[search_index];
		if(search_index==stop_flag) {	
			System.out.println("stop_flag"+stop_flag);
			data[search_index]=0;
			return 0;
		}
//		data[search_index+1]=data[search_index]; 少右推一碼，卻優先回傳了
			return push2(search_index-1,stop_flag);
	}
	public static void show(int[] data) {
		System.out.println("=======");
		for(int i=0;i<data.length;i++) 
			System.out.print(data[i]+" ");	
	}
}
