
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
	public static void calc(int num,int div_num)  {//��throws�ҥi
		if(div_num==0) {
			try {
				throw new Exception("�S���H�����ƬO�s���a");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(((double)num/div_num)+"");
		
	}
}

class outclass{
	
	
	
	
}
