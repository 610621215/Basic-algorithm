package ggmod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//�i�����|
//ArrayList���|
public class agg7 {
	public static void main(String[]args) {
//		float sa=0.5f;
//		int kk=(int)(sa*10);
//		System.out.println(kk);
		ArrayList<Integer>list=new ArrayList<Integer>();
		float sa=0.00f;
		for(int i=0;i<10;i++) {
			System.out.println(Math.random()*10);
			sa=(float)Math.random()*10;//�`�N�ܼƪ��ͩR�g��
			list.add(((int)sa));
		}
		//���Xtop����
		Collection col=new ArrayList(list);
		System.out.println(list);
		Collections.reverse(list);//static��
//		System.out.println(list);
		System.out.println(list.remove(0));//����top
		Collections.reverse(list);
		System.out.println(list);
		sa=(float)Math.random()*100;
		list.add((int)sa);//�s�W�H������
		System.out.println(list);//�s�W�s������
	}
	
}
