package ggmod;
//河內之塔
public class ggg1 {
	public static void main(String[] args) {
		//僅步驟
		tower(3,"A","B","C");
		
	}
	public static void tower(int n,String A,String B,String C){
		if(n==1) {
			System.out.println("從 " +A+ " 到 " +C);//直到最後一個可以移動為止
			return;
		}
		else {
			System.out.println("\n"+"=====0====="+"\n");
			tower(n-1,"A","C","B");//盡可能的丟到柱B
			System.out.println("\n"+"=====1====="+"\n");
			tower(1,"A","B","C");//一定只剩一個，偷偷的把他丟過去
			System.out.println("\n=====2=====\n");
			tower(n-1,"B","A","C");//盡可能的都往A柱子扔，反正最後再疊回去
		}
		
	}
}
