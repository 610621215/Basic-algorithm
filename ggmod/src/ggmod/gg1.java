package ggmod;

import java.util.Arrays;
import java.util.Random;

public class gg1 {
	static int[] get_data_array;
	static int get_max;
	static Object[] get_ob_token;
	public static void main(String[]args) {
		get_ob_token=getdata();
		get_data_array=(int[])get_ob_token[1];
		get_max=(int)get_ob_token[0];
		int[] sort_array=new int[get_max+1];
		System.out.println(get_max+"");
		for(int i=0;i<get_data_array.length;i++) {		
			sort_array[get_data_array[i]]++;		
		}
		System.out.println("桶子排序結果");
		for(int i=sort_array.length-1;i>0;i--) {
			if(sort_array[i]!=0) {
				
				System.out.println(i);
				
			}
			
		}
	}
	public static Object[] getdata() {
		int[] data_array=new int[5];
		int max=-1;
		for(int i=0;i<5;i++) {
			data_array[i]=new Random().nextInt(10);
			System.out.println(data_array[i]+"");
			if(max<data_array[i])
				max=data_array[i];				
		}
		Object[] ob_token=new Object[2];
		ob_token[0]=max;
		ob_token[1]=data_array;
		return ob_token;
	}
}
