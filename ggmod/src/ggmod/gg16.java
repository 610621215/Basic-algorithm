package ggmod;

import java.util.*;
//�`���u���j�M���C�|���D
//���Ϭ��L�V��

public class gg16 {
		static final int width=6;
		static final int length=6;
		static Integer[][] map=new Integer[length][width];
		static int[][] record=new int[length][width];
		static ArrayList<Integer> x_list=new ArrayList<Integer>();
		static ArrayList<Integer> y_list=new ArrayList<Integer>();
		public static void main(String[]args) {
			create_a_map();
			show();
			DarknessFeatherS(map[0],0);
		}
		public static void inital() {		
			for(int i=0;i<width;i++) {			
				for(int j=0;j<length;j++){
					map[i][j]=new Integer(0);
				}
			}		
		}
		public static void create_a_map() {//random_map
				inital();
				for(int i=0;i<length;i++) {
					int block=new Random().nextInt(width);
					while(block==i) {
						block=new Random().nextInt(width);
						
					}
					for(int j=0;j<width;j++) {
							if(i==j) {
								map[i][j]=0;
							}else if(map[i][j]!=-1){
								map[i][j]=1;
								map[j][i]=1;
							}
					}
					map[i][block]=-1;
					map[block][i]=-1;
				}
		}
		public static void show() {
			for(int i=0;i<map.length;i++) {
				for(int j=0;j<map[0].length;j++) {
					
					System.out.print(map[i][j]+"\t");
					
				}
				System.out.println();
			}
		}
		public static void DarknessFeatherS(Integer[] tp,int flag) {
			for(int i=0;i<width;i++) {
				if(tp[i]==1&&record[flag][i]==0&&record[i][flag]==0) {
					//�L�׬Orecord[flag][i]��record[i][flag]�Ҭ��ۦP����ܪk
					System.out.println("��"+flag+"�B�A���X�F"+i);
					record[flag][i]=1;
					record[i][flag]=1;
					DarknessFeatherS(map[i],i);//�����U�h
				}
			}
		}
}
