package ggmod;

import java.util.ArrayList;
//�ƶ����D
//�W�h�pwhile�j��ҥ�
public class gg4 {
	public static void main(String[] args) {
		int[] list={6,3,1,7,5,8,9,2,4};
		//���Y�ɧ�
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
		System.out.println("���ɤj�p:"+data_list.size());
		try {
			while(data_list.size()!=0){
				int tp=data_list.get(0);//���o�Ĥ@�X
				data_list.remove(0);//��Ĥ@�X���X
				buff.add(tp);//�s�W�����o���Ĥ@�X
				tp=data_list.get(0);//�A�����o�Ĥ@�X
				data_list.add(tp);//��Ĥ@�X�X�J�ܫ��
				data_list.remove(0);//�R�����ƪ��Ĥ@�X
			}
			show(buff);
		}catch(Exception ex) {
			System.out.println("��Ƥw�g�������X");
			show(buff);		
		}
	}
}
