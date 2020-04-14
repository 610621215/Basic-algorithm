package ggmod;

public class gg9 {
	//火柴不等式
	//以A!=B為大條件，A+B=C與B+A=C視為兩者
	//+,=就需要2根火柴，故僅剩20根
	//20為10個1
	//考慮到A跟B是可以被決定的，故A做不成5個1(10根火柴)
	static int[] book=new int[] {6,2,5,5,4,5,6,3,7,6};
	static final int count=24;
	public static void main(String[]args) {
		
		for(int i=0;i<11111;i++) {
			
			for(int j=0;j<11111;j++) {
				if(give_me_march(i)+give_me_march(j)+give_me_march(i+j)==count-4) {
					System.out.println(i+"+"+j+"="+(i+j));
					
				}
				
			}
			
		}
		
	}
	public static int give_me_march(int x) {
		int total=0;
		while(x/10!=0) {
			total+=book[x%10];
			x=x/10;
		}
		total+=book[x];
		
		return total;
	} 
}
