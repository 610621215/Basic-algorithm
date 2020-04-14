package go_package;

import java.io.IOException;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.*;
public class gog {
	public static void main(String[]args) {
		int i=new Integer(3);
		System.out.println("off white");
		subclass s=new ss();
		System.out.println(s.a);//變數任形態
		s.show();//方法任實體
		ArrayList<?> test=null;
		ArrayList<Integer> t1=null;
		test=t1;
		book<Integer> b=new book<Integer>(3);
//		Collection<? extends Number>cc=new ArrayList<Integer>();
//		Number num=new Integer(33);
//		System.out.println(num.intValue()+"\t"+num.floatValue());
//		cc.add(num);
	book2<Integer> bitem=new book2<Integer>();
	bitem.tag=30;
	book2<Integer> b2=new book2<Integer>(bitem);
	ArrayList list=new ArrayList();
	list.add("true");
	list.add(1);
	list.add(bitem);
	for(Object ob:list) {
		System.out.println(ob.toString());
	}
	}
}
class subclass{
	int a=3;
	void test(int x) throws IOException{}
	void show() {
		System.out.println(a);
	}
	
}
class ss extends subclass{
	int a=5;
	void test(int lkk) throws RuntimeException {}
	void test(double lcc) throws IOException{}
	void show() {
		System.out.println(a);
	}
}
class book2<T>{
	T e;
	int tag=0;
	public book2() {	
	}
	public book2(book2<? extends Number> e){
		this.tag=e.tag;
		System.out.println(this.tag+"||"+e.tag);
	}
}
class book<T>{
	T e;
	public book(T e){
		this.e=e;
		System.out.println(e);
	}
}
