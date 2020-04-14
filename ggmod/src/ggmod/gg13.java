package ggmod;

import java.util.Random;

import ggmod.gg8.Action;
//深度搜尋迷宮
public class gg13 {
	static gg13 g13=new gg13();
	static int target_x;
	static int target_y;
	static boolean searching=false;
	static int[][] map;
	static int[][] cpy_map=new int[5][5];
	static int[][] vec=new int[][] {
		{0,1},{1,0},{-1,0},{0,-1}	
	};
	public static void main(String[] args) {
		map=new int[5][5];
		show();
		dfs(0,0,0);
		if(searching) {
			
			System.out.println("找到了");
		}
		else {
			
			System.out.println("沒有找到人");
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
//		cpy_map=map.clone();
//		cpy_map=new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				cpy_map[i][j]=map[i][j];
			}	
		}
		
	}
	public static void pure_show() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(cpy_map[i][j]);
			}
			System.out.println();
		}
		
	}
	public static void dfs(int user_x,int user_y,int step) {
		if(user_x==target_x&&user_y==target_y) {
			searching=true;
			System.out.println("找到了");
			return;		
		}
		pure_show();
		System.out.println();
		if(user_x==target_x)
			System.out.println("整天都在想"+user_x+","+user_y+"z"+target_x+","+target_y);
		for(int i=0;i<4;i++) {
			int next_x=user_x+vec[i][0];
			int next_y=user_y+vec[i][1];
			if(next_x<0||next_x>=5||next_y<0||next_y>=5) {
//				System.out.println(next_y+"跳過"+next_x);
				continue;
			}
			if(cpy_map[next_x][next_y]==0&&map[next_x][next_y]==0) {
				cpy_map[next_x][next_y]=2;
				dfs(next_x,next_y,step+1);
				cpy_map[next_x][next_y]=0;		
			}
			
		}
	}
}
