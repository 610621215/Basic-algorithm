package ggmod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class gg8 {
	//最佳炸法
	//小圖6x6
	public static ArrayList pb_list;
	public static ArrayList<Object> pb2_list;
	public enum Action {
	    UP("UP",0),
	    RIGHT("RIGHT",1),
	    LEFT("LEFT",2),
	    DOWN("DOWN",3);
		String dir;
		int act_code;
	    private Action(String dir,int act_code) {
	    	this.dir=dir;
	    	this.act_code=act_code;
	    }
	    public static Action get_act_code(int act_code){
	    	int key=act_code;
	    	switch (key) {
			case 0:
				return UP;
			case 1:
				return RIGHT;
			case 2:
				return LEFT;
			case 3:
				return DOWN;
			default:
				return null;
			}	
	    }
	}
	//?3*6528=3?*8256
	static String[][] mymap;
		public static void main(String[]args) {	
			//其他問題
			for(int i=0;i<=9;i++) {		
				for(int j=0;j<9;j++) {			
					if(((i*10+3)*6528)==((3*10+j)*8256)) {
						System.out.println(i+":\t"+j);				
					}	
				}
			}
			//其他問題
			create_map();
			show(mymap);
			Action gogo=Action.get_act_code(0);
			System.out.println(gogo+"\t");
			gaming();
			System.out.println(pb_list+":"+pb_list.size());
			int max=-333;
			ArrayList<Integer>max_list=new ArrayList();
			for(int i=0;i<pb_list.size();i++) {
				if((int)pb_list.get(i)>=max) {
					max=(int) pb_list.get(i);
					max_list.add(i);
				}
			}
			for(int j=0;j<max_list.size();j++) {
				int[] tp=(int[]) pb2_list.get(j);
				System.out.println((tp[0])+","+(tp[1])+"最大炸法："+pb_list.get(max_list.get(j)));
			}
//			for(int i=0;i<pb2_list.size();i++) {
//				int[] tp=(int[]) pb2_list.get(i);
//				
//				System.out.println((tp[0])+","+(tp[1])+","+pb_list.get(i));
//			}
//			twoarray();
		}
//		public static void twoarray() {
//			int[][] a=new int[4][];
//			System.out.println(a.length);
//			for(int i=0;i<a.length;i++) {
//				a[i]=new int[4];//插入
//			}
//			for(int i=0;i<a.length;i++) {
//				
//				for(int j=0;j<4;j++)
//					System.out.print(a[i][j]);
//				System.out.println();
//			}
//			System.out.println(a.length);
//		}
		public static void create_map() {
			String [][] a=new String[6][];
			a[0]= new String[]{"#","#","#","#","#","#"};
			a[1]= new String[]{"#","G","G",".","G","#"};
			a[2]= new String[]{"#","G",".","G","G","#"};
			a[3]= new String[]{"#",".","G","G","G","#"};
			a[4]= new String[]{"#","G",".","G","G","#"};
			a[5]= new String[]{"#","#","#","#","#","#"};
			mymap=a;
		}
		public static void show(String[][] a) {
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					System.out.print(a[i][j]);
				}
				System.out.println();		
			}
		}
		public static void gaming() {
//			TreeSet<Object> tree=new TreeSet();
			ArrayList<Integer>list=new ArrayList();
			ArrayList<Object> ob_list=new ArrayList();
			for(int i=0;i<mymap.length;i++) {
				
				for(int j=0;j<mymap[i].length;j++) {
					if(mymap[i][j]==".") {
						int total=0;
						int x=i;
						int y=j;
						System.out.println(x+","+y);
						int act_code=0;
						for(act_code=0;act_code<4;act_code++)
//							System.out.println(Action.get_act_code(act_code));
							total=total+searching(0,act_code,x,y);
//						Object item=new int[] {x,y};
						list.add(total);
						ob_list.add(new int[] {x,y});
					}
				}
			}

			pb_list=list;
			pb2_list=ob_list;
		}
		public static int searching(int sum,int dir,int x,int y) {
			switch(Action.get_act_code(dir)) {
				case UP:
					while(mymap[x][y]!="#") {
						System.out.println("Go up");
						if(mymap[x][y]=="G") {
							sum++;
						}
						x++;
					}
				break;
				case RIGHT:
					while(mymap[x][y]!="#") {
						System.out.println("Go RIGHT");
						if(mymap[x][y]=="G") {
							sum++;
						}
						y++;
					}
				break;
				case DOWN:
					while(mymap[x][y]!="#") {
						System.out.println("Go DOWN");
						if(mymap[x][y]=="G") {
							sum++;
						}
						x--;
					}
				break;
				case LEFT:
					while(mymap[x][y]!="#") {
						System.out.println("Go LEFT");
						if(mymap[x][y]=="G") {
							sum++;
						}
						y--;
					}
				break;
			
			}
			return sum;
		}
	
}
