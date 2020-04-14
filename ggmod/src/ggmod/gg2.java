package ggmod;

import java.util.Random;

public class gg2 {

		public static void main(String[] args) {
			Object[] getmydata;
			getmydata=getdata();
			int[] data=(int[])getmydata[1];
			for(int i=0;i<data.length;i++) {				
				for(int j=i+1;j<data.length;j++) {					
					if(data[j]<data[i]) {
						int temp=data[j];
						data[j]=data[i];
						data[i]=temp;
						
					}					
				}
			}
			show(data);
		}
		public static Object[] getdata() {
			int[] data_array=new int[5];
			int max=-1;
			for(int i=0;i<5;i++) {
				data_array[i]=new Random().nextInt(10);
				System.out.println(data_array[i]+"");
				if(max<data_array[i])
					max=data_array[i];				
			}
			Object[] ob_token=new Object[2];
			ob_token[0]=max;
			ob_token[1]=data_array;
			return ob_token;
		}
		public static void show(int[] data) {
			System.out.println("=======");
			for(int i=0;i<data.length;i++) 
				System.out.println(data[i]);	
		}
}
