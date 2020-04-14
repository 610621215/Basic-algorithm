package ggmod;

import java.util.ArrayList;
import java.util.Random;
//定點找人
//廣度優先搜尋by佇列
public class gg14 {
	static gg13 g13=new gg13();
	static int target_x;
	static int target_y;
	static boolean searching=false;
	static int[][] map;
	static int[][] cpy_map=new int[5][5];
	static int[][] action= {{1,0},{-1,0},{0,1},{0,-1}};
	static ArrayList<Integer> list_x=new ArrayList<Integer>();
	static ArrayList<Integer> list_y=new ArrayList<Integer>();
	public static void main(String[]args) {
		map=new int[5][5];
		show();

		int x=0;
		int y=0;
		list_x.add(x);
		list_y.add(y);
		int test_index=0;
		while(list_x.size()!=0&&list_y.size()!=0) {
			for(int i=0;i<action.length;i++) {
				System.out.println("執行了");
				int next_x=list_x.get(0)+action[i][0];
				int next_y=list_y.get(0)+action[i][1];
				System.out.println(next_x+","+next_y);
				if((next_x<0||next_x>=5)||(next_y<0)||(next_y>=5)) {
					continue;
				}
				if(cpy_map[next_x][next_y]==0&&map[next_x][next_y]==0) {
					cpy_map[next_x][next_y]=1;
					list_x.add(next_x);
					list_y.add(next_y);
				}
			}
			for(int i=0;i<list_x.size();i++) {
				System.out.print("x"+list_x.get(i)+"y"+list_y.get(i));
				System.out.println();
			}
			if(list_x.contains(target_x)&&list_y.contains(target_y)) {
				System.out.println("找到了");
				break;
				
			}
			System.out.println("list size"+list_x.size());
			list_x.remove(0);
			list_y.remove(0);
		}
	}
	
	public static void show() {//內至建立
		int target_lock=0;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(Math.random()<=0.15&&(i!=0)) {
					map[i][j]=1;				
				}	
				
			}
		}
		
		while(target_lock==0) {
			Random rd=new Random();
			int x=rd.nextInt(5);
			int y=rd.nextInt(5);
			if(map[x][y]!=1&&(x!=0&&y!=0)) {
				map[x][y]=0;
				target_lock=1;
				target_x=x;
				target_y=y;
			}	
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				cpy_map[i][j]=map[i][j];
			}	
		}
		System.out.println(target_x+","+target_y);
	}
	public static void pure_show() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(cpy_map[i][j]);
			}
			System.out.println();
		}
	}

	public static void push() {
		
		
	}
}
