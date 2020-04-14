package ggmod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//進階堆疊
//ArrayList堆疊
public class agg7 {
	public static void main(String[]args) {
//		float sa=0.5f;
//		int kk=(int)(sa*10);
//		System.out.println(kk);
		ArrayList<Integer>list=new ArrayList<Integer>();
		float sa=0.00f;
		for(int i=0;i<10;i++) {
			System.out.println(Math.random()*10);
			sa=(float)Math.random()*10;//注意變數的生命週期
			list.add(((int)sa));
		}
		//取出top元素
		Collection col=new ArrayList(list);
		System.out.println(list);
		Collections.reverse(list);//static的
//		System.out.println(list);
		System.out.println(list.remove(0));//移除top
		Collections.reverse(list);
		System.out.println(list);
		sa=(float)Math.random()*100;
		list.add((int)sa);//新增隨機元素
		System.out.println(list);//新增新的元素
	}
	
}
