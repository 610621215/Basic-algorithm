package ggmod;

public class gg9 {
	//���㤣����
	//�HA!=B���j����AA+B=C�PB+A=C�������
	//+,=�N�ݭn2�ڤ���A�G�ȳ�20��
	//20��10��1
	//�Ҽ{��A��B�O�i�H�Q�M�w���A�GA������5��1(10�ڤ���)
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
