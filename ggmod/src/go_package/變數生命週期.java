package go_package;

public class 變數生命週期 {
	public static void main(String[]ars) {
		int a[]= {1,2,3};
		itemtest ss=new itemtest(33);
		ss.show();
		ss.upid(35);
		ss.show();
		System.out.println(ss.doit(1, 1)+"v.s"+ss.doit(1,2,3));
	}
}

class itemtest{
	private int id;
	public itemtest(int id) {
//		this.id++;
		this.id=id;
		System.out.println(this.id+"");
		
	}
	public void upid(int newid) {
		id=newid;
		
	}
	public void show() {
		System.out.println(id);
		
	}
	public String doit(int x,int y) {return "a";}
	

	public String doit(int... x) {return "b";}
	
	
}