package ggmod;

import java.util.ArrayList;
//�w���ɯŪ�
public class TGG9 {
	static String[] txt;
	static ArrayList<String> result;
	public static void main(String[]args) {
		txt=new String[]{"A","B","C","D","E"};
		result=new ArrayList<String>();
		for(int j=0;j<txt.length;j++) {
			String head=txt[j];
			//�p�������D�A���O�u���Y���ʴN�i�H��ܦ��ƦC�A�ƦC���̤p�������2�C
			System.out.println("���ɶ������G"+head);
			for(int i=0;i<txt.length;i++) {	
				if(txt[i].equals(head)) {//���F�o�@�X���~�������ɤW
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
			//�M�w�X�j����
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
			System.out.print("�ƦC"+txt[j]+"\t");
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
