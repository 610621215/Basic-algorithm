package ggmod;

import java.util.Random;
//�ֳt�Ƨ�
public class gg3 {

	static int[] data=new int[]{6,1,2,7,9,3,4,5,10,8};
	
	public static void main(String[] args) {
		data=(int[])getdata()[1];
		re(0,data.length-1);
		show(data);
	}
	public static void re(int left,int right) {
		if(left>right) {
//			show(data);
//			System.out.println("�����F");
			return;
		}
		int i=left;
		int j=right;
		int temp=data[left];//�����Ĥ@�X
//		System.out.println("����F"+i+j);
		while(i!=j) {
			
			while(data[j]<=temp&&j>i) {//��k��j��,�O�o�g�@��=���M�ۦP���ܷ|�X�Ʊ�
				j--;
			}
			while(data[i]>=temp&&j>i) {//�䥪��p��,�o�ˤl�~�����p���V���
				i++;
			}
			if(j>i) {//���ŦX�W�h���ܴN�洫
				int swap_temp=data[j];
				data[j]=data[i];
				data[i]=swap_temp;	
			}
		}
		int swap_temp=data[j];//�����X
		data[j]=temp;//�Ĥ@�X�m��
		data[left]=swap_temp;//�N�����X�ɦܲĤ@�X	
		re(left,right-1);
		re(left+1,right); 
	}
	public static void show(int[] data) {
		System.out.println("=======");
		for(int i=0;i<data.length;i++) 
			System.out.println(data[i]);	
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
