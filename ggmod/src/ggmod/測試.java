package ggmod;

public class 測試 {
	static int[] qu= {3,5,1,2,3,4,7,8,9};
	public static void main(String[]args) {
//		測試 test1=new 測試();
//		test t1=test1.new test();
//		test t2=t1;
//		t1.gg=2;
//		System.out.println(t1.gg+" t2 "+t2.gg);//相同實體
//		int x=5_2;
//		System.out.println(x);
//		
//		
//305....
		int end_flag=qu.length-2;
		int start_flag=3;
		push_payload(qu.length-2,start_flag);
		qu[start_flag]=0;
		for(int i=0;i<qu.length;i++)
			System.out.print(qu[i]);
	}
	public static void push_payload(int start_flag,int end_flag) {
		qu[start_flag+1]=qu[start_flag];
		if(end_flag==start_flag) {
			System.out.println("推完了");
			return;
		}
		push_payload(start_flag-1,end_flag);
	}
//	class test{
//		int gg=1;
//		
//	}
}
