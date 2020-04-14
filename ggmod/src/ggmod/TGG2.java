package ggmod;

public class TGG2 {
	
	public static void main(String[]args) {
		test(3,"aa","bb","cc","zz");
	
		TGG2 tg=new TGG2();
		
		test2(tg.new ob(3),tg.new ob(5),tg.new ob(10));//物件參數列表範例
		
		System.out.println(""+new book().ma());
		System.out.println(""+new computerbbook().ma());//Override
	}
	public static void test(int k,String... names) {
		System.out.println(k);
		for(String ss:names) {
			
			System.out.println(ss);
			
		}
		
	}
	
	class ob{
		int give_me_num=0;
		
		public ob(int con) {
			give_me_num=con;
			
		}
		
	}
	
	public static void test2(Object... objects) {	
		for(Object token:objects) {
			ob myob=(ob)token;
			System.out.println(myob.give_me_num);
			
		}
		
	}
}
class book{
	boolean istradeable;
	int ma() {return 0;}
}
class computerbbook extends book{
	
	int ma() {
		istradeable=false;
		return 1;
	}
	
	
}
