package ggmod;

import java.util.ArrayList;
//排隊問題
//規則如while迴圈所示
public class gg4 {
	public static void main(String[] args) {
		int[] list={6,3,1,7,5,8,9,2,4};
		//砍頭補尾
		ArrayList<Integer> data_list=new ArrayList<Integer>();
		for(int i=0;i<list.length;i++) {
			data_list.add(list[i]);
		}
		show(data_list);
		System.out.println();
		System.out.println();
		System.out.println();
		show2(data_list);
	}
	public static void show(ArrayList<Integer> data_list) {
		for(int i=0;i<data_list.size();i++) {
			System.out.print(data_list.get(i)+"\t");
		}
		
	}
	public static void show2(ArrayList<Integer> data_list) {
		ArrayList<Integer> buff=new ArrayList<Integer>();
		System.out.println("此時大小:"+data_list.size());
		try {
			while(data_list.size()!=0){
				int tp=data_list.get(0);//取得第一碼
				data_list.remove(0);//把第一碼取出
				buff.add(tp);//新增剛剛取得的第一碼
				tp=data_list.get(0);//再次取得第一碼
				data_list.add(tp);//把第一碼出入至後排
				data_list.remove(0);//刪除重複的第一碼
			}
			show(buff);
		}catch(Exception ex) {
			System.out.println("資料已經全部取出");
			show(buff);		
		}
	}
}
