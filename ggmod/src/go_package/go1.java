
package go_package;
public class go1 {
	
	public static void main(String[] args) {
		int num=3;
		int div_num=0;
		try {
			calc(num,div_num);
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}
	public static void calc(int num,int div_num)  {//或throws皆可
		if(div_num==0) {
			try {
				throw new Exception("沒有人的除數是零的吧");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(((double)num/div_num)+"");
		
	}
}

class outclass{
	
	
	
	
}
