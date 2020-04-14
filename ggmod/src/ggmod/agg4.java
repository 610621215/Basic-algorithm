package ggmod;

import java.util.ArrayList;
import java.util.Random;

public class agg4 {
	//cpe 2019/12
	//1
	static int[] clock=new int[4];
	public static void main(String[] args) {
		clock=new int[]{23,34,14,34};
		//0 1 2 3
		//相同天？
		//隔天是從0點開始算的，實際上0點24點
		
		if(clock[0]==clock[2]) {
			System.out.println((1440+(clock[3]-clock[1])));			
		}
		else {			
			if(clock[2]==0) {	//0->24	
				clock[2]=24;
			}
			if(clock[2]>clock[0])
				System.out.println((60*Math.abs(clock[0]-clock[2])+(clock[3]-clock[1])));	
			if(clock[2]<clock[0])
				System.out.println((60*Math.abs(Math.abs(clock[0])-(clock[2]+23))+(clock[3]-clock[1])));	//21 5 問題
		}
		
	}
	
	
}
