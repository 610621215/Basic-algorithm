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

//�����y�m��2
public class TGG4 implements Serializable{//���n�A�A���������O����@�ǦC�ƫh�U�@�ӭn��X���]�n��@,�]��innerclass�O�L���������O�C
	class innerclass implements Serializable{
		String name="";
		String property="";
		//�@�몺�������O����ϥ�static �o�ӭ׹��r,�P�}�Y���@�P
		public innerclass(String name,String property) {
			this.name=name;
			this.property=property;
			
		}
		public void show() {
			
			System.out.println("�W�r"+name+"�ϥΤF"+property);
			
		}
		
	}
	static class a413512{
		
		public void show() {
			
			System.out.println("�ڥu�O��¦a�ɨ��o������");
		}
		
		
	}
	public static void main(String[] args) {
		TGG4 tg=new TGG4();
//		tg.new innerclass[] in = tg.new innerclass[2];
//		innerclass in=tg.new innerclass();
		innerclass[] in_array=new TGG4.innerclass[5];//�H�������O���W������x�}
		TGG4.a413512 a4=new TGG4.a413512();
		a4.show();
		for(int i=0;i<5;i++)
			in_array[i]=tg.new innerclass("������p����","�ޤM�N");
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
				while(true) {//�å��X�{EOF�������r
					innerclass ic=(innerclass)(ois.readObject());
					ic.show();
				}
		}
		catch(EOFException ex) {
			System.out.println("���N��X");
//			ex.printStackTrace();//���r�ӷ�
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}
}
