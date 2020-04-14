package ggmod;

import java.util.ArrayList;
import java.util.Arrays;

//口口口+口口口=口口口
//dfs與全列舉數字問題
public class gg12 {
	static int num_count=9;
	static int[] bx=new int[10];
	static int[] dk=new int[10];
	static ArrayList<Object> ls=new ArrayList();
	static int[] empty=new int[10];
	static int score_index=0;
	public static void main(String[]args) {
		int step=0;
		dfs(step);
		System.out.println(ls.size());
		int ls_count=0;
		int[] test=new int[4];
		for(int i=0;i<ls.size();i++) {
			int[] tp=(int[])ls.get(i);
			for(int j=0;j<tp.length-1;j++) {
				System.out.print(tp[j]);
				
			}
			System.out.println();
			
		}
	}
	public static void show(int[] test) {	
		if(test[0]*100+test[1]*10+test[3]+test[4]*100+test[5]*10+test[6]==test[7]*100+test[8]*10+test[9]) {
			System.out.println((test[0]*100+test[1]*10+test[3])+"+"+(test[4]*100+test[5]*10+test[6])+"="+(test[7]*100+test[8]*10+test[9]));
		}
	}
	public static void dfs(int step) {
		if(step+1==bx.length) {
			show(bx);
			return;	
		}
		for(int i=1;i<=num_count;i++) {
				if(dk[i]==0) {
					dk[i]=1;
					bx[step]=i;
					dfs(step+1);
					dk[i]=0;
				}
			
		}
		
	}
}
