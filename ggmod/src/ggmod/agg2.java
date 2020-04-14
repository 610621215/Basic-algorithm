package ggmod;

import java.util.ArrayList;
import java.util.Scanner;

public class agg2 {
	//CPE 2019/3
	//2
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ArrayList<Integer> get_div_list=new ArrayList<Integer>();
		int data=214;
		get_div_list=div_list(data);	
		show(objtoint_array(get_div_list.toArray()));
		int[] div_data=objtoint_array(get_div_list.toArray());//¶¶§Ç¤Ïªº
		String str_data=data+"";
		String tp_str_data=(data/10)+"";
		while(str_data.length()!=tp_str_data.length()) {
			
			
		}
		
	}
	
	public static void show(int[] data) {
		System.out.println("\n=======\n");
		for(int i=0;i<data.length;i++) 
			System.out.print(data[i]+" ");	
	}
	public static int[] objtoint_array(Object[] ob) {		
		int[] ls=new int[ob.length];
		for(int i=0;i<ob.length;i++)
			ls[i]=(int)ob[i];		
		return ls;
	}
	public static int sum(int[] data) {
		int total=0;
		for(int i=0;i<data.length;i++){
			total=total+data[i];
		}
		return total;
		
	}
	public static ArrayList<Integer> div_list(int data){
		ArrayList<Integer> get_div_list=new ArrayList<Integer>();
		while(data!=0) {
			System.out.println(data);
			get_div_list.add(data%10);
			data=data/10;
			
		}
		return get_div_list;
		
	}
}
