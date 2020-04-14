package ggmod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import ggmod.gg17.drink;
import ggmod.gg17.machine;
import ggmod.gg17.user;
//深度優先走訪
public class gg18 {

	static final int width=6;
	static final int length=6;
	static Integer[][] map=new Integer[length][width];
	static int[][] record=new int[length][width];
	static ArrayList<Integer> x_list=new ArrayList<Integer>();
	static ArrayList<Integer> y_list=new ArrayList<Integer>();
	static ArrayList<Integer> queue=new ArrayList<Integer>();
	public static void main(String[]args) {
		create_a_map();
		show();
		//DarknessFeatherS(map[0],0);
		BlackFeatherS();
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
	public static void BlackFeatherS() {
		System.out.println();
		int searching_index=0;
		queue.add(searching_index);//add root
		ArrayList<Integer> result=new ArrayList<Integer>();
		while(!queue.isEmpty()) {
			Integer[] tp=map[searching_index];
			for(int i=0;i<map[searching_index].length;i++) {
				int flag=i;
				if(tp[i]==1&&record[flag][searching_index]==0&&record[searching_index][flag]==0) {
					record[flag][searching_index]=1;
					record[searching_index][flag]=1;
					queue.add(i);
				}
			}
			if(!result.contains(queue.get(0)))//躲環路，重複不會再重複的新增				
				result.add(queue.get(0));
			queue.remove(0);
			if(queue.isEmpty())
				break;
			searching_index=queue.get(0);
		}	
		for(Integer element:result) {
			System.out.print(element);
			
		}
	}
	
}
