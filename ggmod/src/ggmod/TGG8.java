package ggmod;

import java.util.ArrayList;
//3¶¥±Æ¦C
public class TGG8 {
	static String[] txt;
	static ArrayList<String> result;
	public static void main(String[]args) {
		txt=new String[] {"A","B","C"};
		result=new ArrayList<String>();
		String[] copy_txt;
		for(int i=0;i<txt.length;i++) {
			copy_txt=new String[] {"A","B","C"};
			String tp=copy_txt[0];
			copy_txt[0]=copy_txt[i];
			copy_txt[i]=tp;
			System.out.println("¦r¥ÀÀY:"+copy_txt[i]+"¦r¥À§À:"+copy_txt[txt.length-1]+"id"+i+"\n");
			
			for(int j=0;j<copy_txt.length;j++) {
				System.out.println(copy_txt[j]);
			}
			
			txt=copy_txt;
			result.add(arraytostring(txt));//´«ÀY
			for(int j=0;j<txt.length;j++) {
				System.out.println("txt:"+txt[j]);
			}
			swap(1);
		}
		for(int i=0;i<result.size();i++)
			System.out.println(result.get(i)+"\t");
		System.out.println(result.size());
	}
	public static void changefirst(String[] copy_txt,int i) {
		String tp=copy_txt[0];
		copy_txt[0]=copy_txt[i];
		copy_txt[i]=tp;
	
	}
	
	public static void swap(int swap_flag) {
		if(swap_flag==txt.length-1) {
			return;
		}
		
		String tp=txt[swap_flag];
		txt[swap_flag]=txt[swap_flag+1];
		txt[swap_flag+1]=tp;
		for(int j=0;j<txt.length;j++) {
			System.out.print(txt[j]+"\t");
		}
		System.out.println();
		if(!result.contains(arraytostring(txt)))
			result.add(arraytostring(txt));
		swap(++swap_flag);
		
		
	}
	public static String arraytostring(String[] txt) {
		String tp="";
		for(int i=0;i<txt.length;i++)
			tp+=txt[i];
		return tp;
	}
}
