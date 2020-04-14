package ggmod;
import go_package.¤º®M1;
public class ¥~®M1 {
	public static void main(String[]args) {
		do1 d=new do2();
		d.show();
		d.show2();
		int[][] ax= {{1,3},{4,4}};
		Object aax=ax;
		int[][]ss=(int[][])aax;
		System.out.println(ss[0][0]+"\t");
		int a=1;
		int b=++a;
		System.out.println(a+":"+b);
		int i=0;
		for(;i<5;i++) {
			System.out.println(i);
			
		}
		System.out.println(i);
	}
}

class do1{	
	public void show() {
		System.out.println("do2");
	}
	public void show2() {
		
		System.out.println(do1.class+"\t"+"show2");
	}
}
class do2 extends do1{
	
	public void show() {
		System.out.println("do2");
	}
}

class do3 extends do1{
	
	public void show() {
		System.out.println("do3");
	}
}
