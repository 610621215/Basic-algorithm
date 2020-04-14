package ggmod;

import java.util.Random;
//程式教學Day#1
//計算地雷
//5為地雷，判斷的方向為上下左右四方位
public class W2 {
	public static int[] test=new int[5];
	public static int[][] test2d=new int[5][5];
	public static void main(String[]args) {
		create_2d();
		for(int i=0;i<test2d.length;i++) {
			for(int j=0;j<test2d[i].length;j++) {
				if(test2d[i][j]%2==0) {
					test2d[i][j]=0;
					System.out.print(test2d[i][j]);
				}else {
					test2d[i][j]=5;
					System.out.print("x");
					
				}
			}

			System.out.println("");

		}
	
		System.out.println("");
		for(int i=0;i<test2d.length;i++) {		
			for(int j=0;j<test2d[i].length;j++) {
				if(test2d[i][j]!=5) {
					if(((j+1)<test2d[i].length)&&test2d[i][j+1]==5) {
						test2d[i][j]++;
						
					}
					if(((j-1)>=0)&&test2d[i][j-1]==5) {
						test2d[i][j]++;
						
					}
					if(((i-1)>=0)&&test2d[i-1][j]==5) {
						test2d[i][j]++;
						
					}
					if(((i+1)<test2d.length)&&test2d[i+1][j]==5) {
						test2d[i][j]++;
					}
				}
			}

			System.out.println("");

		}
		System.out.println("");
		for(int i=0;i<test2d.length;i++) {
			for(int j=0;j<test2d[i].length;j++) {

					System.out.print(test2d[i][j]);
			}

			System.out.println("");

		}
		System.out.println("");
	}
	public static void gg() {
		int i=0;
		for(i=0;i<test.length;i++) {
			test[i]=new Random().nextInt(5);
		}
		
		
	}
	public static void create_2d() {
		int i=0;
		int j=0;
		for(i=0;i<test2d.length;i++) {
			for(j=0;j<test2d[i].length;j++) {
				test2d[i][j]=new Random().nextInt(5);
			}
		}
		
		
	}
}
