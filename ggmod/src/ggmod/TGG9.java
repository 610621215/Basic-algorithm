package ggmod;

import java.util.ArrayList;
//定推升級版
public class TGG9 {
	static String[] txt;
	static ArrayList<String> result;
	public static void main(String[]args) {
		txt=new String[]{"A","B","C","D","E"};
		result=new ArrayList<String>();
		for(int j=0;j<txt.length;j++) {
			String head=txt[j];
			//小隊長難題，不是只有頭移動就可以表示成排列，排列的最小單位應為2。
			System.out.println("此時隊長為："+head);
			for(int i=0;i<txt.length;i++) {	
				if(txt[i].equals(head)) {//除了這一碼之外的全部補上
					int current_flag=i;
					System.out.println(current_flag);
					String tp=txt[current_flag];
					while(current_flag!=0) {
						System.out.println(txt[current_flag]);
						txt[current_flag]=txt[--current_flag];
						System.out.println(current_flag);
					}
				}
			}
			result.add(arraytostring(txt));
			//決定出大隊長
//			System.out.println();
//			show();
//			System.out.println();
//			swap(0);
			txt=new String[]{"A","B","C","D","E"};
		}
	
		System.out.println(result.size());
//		show();
	}
	public static void swap(int swap_flag) {
		if(swap_flag==txt.length-1) {
			return;
		}
		
		String tp=txt[swap_flag];
		txt[swap_flag]=txt[swap_flag+1];
		txt[swap_flag+1]=tp;
		for(int j=0;j<txt.length;j++) {
			System.out.print("排列"+txt[j]+"\t");
		}
		System.out.println();
		if(!result.contains(arraytostring(txt))) {
			result.add(arraytostring(txt));
		}
	
		swap(++swap_flag);
		
		
	}
	public static String arraytostring(String[] txt) {
		String tp="";

		for(int i=0;i<txt.length;i++)
			tp+=txt[i];
	
		return tp;
	}
	public static void show() {
		for(int i=0;i<txt.length;i++)
			System.out.print(txt[i]+"\t");
			
	}
}
