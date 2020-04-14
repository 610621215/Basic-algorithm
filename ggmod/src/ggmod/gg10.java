package ggmod;
//升級版排列組合問題
//書上交的解決辦法
public class gg10 {
	public static void main(String[]args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {	
				for(int k=1;k<=3;k++) {			
					if(i!=j&&i!=k&&j!=k) {	
						System.out.println(i+","+j+","+k+"");
					}
				}
			}
		}
	}
}
