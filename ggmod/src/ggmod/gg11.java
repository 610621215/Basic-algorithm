package ggmod;

public class gg11 {
	static int[] deck=new int[10];
	static int[] boxes=new int[10];//4½c¤l
	static final int hand_count=9;
	
	public static void main(String[]args) {
		int step=0;

		 dfs(step);
	}
	public static void show(int[] test) {		
			for(int i=0;i<test.length;i++)
				System.out.print(test[i]+" ");
			System.out.println();
		
	}
	public static void dfs(int step) {
		if(step+1==boxes.length) {
			show(boxes);
			return;
			
		}
		for(int i=0;i<=hand_count;i++) {
			if(deck[i]==0) {
				boxes[step]=i;
				deck[i]=1;
				dfs(step+1);
				deck[i]=0;
			}
		}
		
	}
}
