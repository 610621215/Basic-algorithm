package ggmod;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//物件串流練習2
public class TGG4 implements Serializable{//重要，你的內部類別有實作序列化則下一個要輸出的也要實作,因為innerclass是他的內部類別。
	class innerclass implements Serializable{
		String name="";
		String property="";
		//一般的內部類別不能使用static 這個修飾字,與開頭不一致
		public innerclass(String name,String property) {
			this.name=name;
			this.property=property;
			
		}
		public void show() {
			
			System.out.println("名字"+name+"使用了"+property);
			
		}
		
	}
	static class a413512{
		
		public void show() {
			
			System.out.println("我只是單純地享受這場派對");
		}
		
		
	}
	public static void main(String[] args) {
		TGG4 tg=new TGG4();
//		tg.new innerclass[] in = tg.new innerclass[2];
//		innerclass in=tg.new innerclass();
		innerclass[] in_array=new TGG4.innerclass[5];//以內部類別為名的物件矩陣
		TGG4.a413512 a4=new TGG4.a413512();
		a4.show();
		for(int i=0;i<5;i++)
			in_array[i]=tg.new innerclass("佐佐木小次郎","拔刀術");
		File f=new File("test");
		try {
			FileOutputStream fos=new FileOutputStream(f);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			for(Object obj:in_array) {
				oos.writeObject(obj);
			}
			oos.flush();
			oos.close();
			fos.close();
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));
			Object obs=null;
				while(true) {//並未出現EOF的結束字
					innerclass ic=(innerclass)(ois.readObject());
					ic.show();
				}
		}
		catch(EOFException ex) {
			System.out.println("取代輸出");
//			ex.printStackTrace();//紅字來源
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}
}
