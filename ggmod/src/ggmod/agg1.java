package ggmod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class agg1 {
	//CPE 2019/3
	//1
//	static int[] data1=new int[] {1,1,2,3,5,7,8,8,9,15};
//	static int[] data2=new int[] {2,2,2,3,4,6,10,11,11};
	static int[] data1=new int[] {1,3,5};
	static int[] data2=new int[] {2,4,6,8};
	public static void main(String[] args) {
		data1=totreeset(data1);
		data2=totreeset(data2);
		show(data1);
		show(data2);
		ArrayList<Integer> data_list=new ArrayList<Integer>();
		ArrayList<Integer> data_list2=new ArrayList<Integer>();
		for(int i=0;i<data1.length;i++)
			data_list.add(data1[i]);
		for(int i=0;i<data2.length;i++)
			data_list2.add(data2[i]);
		int min=caulate(data_list,data_list2);
		if(min>caulate(data_list2,data_list))
			min=caulate(data_list2,data_list);
		System.out.println("\na\n"+min);
	}
	public static void show(int[] data) {
		System.out.println("\n=======\n");
		for(int i=0;i<data.length;i++) 
			System.out.print(data[i]+" ");	
	}
	public static int caulate(ArrayList<Integer> data_list,ArrayList<Integer> data_list2) {
		int count=0;
		for(int i=0;i<data_list.size();i++) {		
			if(!data_list2.contains(data_list.get(i)))
				count++;
			
		}
		return count;
	}
	public static int[] totreeset(int[] data1) {
		TreeSet<Integer> ts1=new TreeSet<Integer>();
		for(int i=0;i<data1.length;i++) 
			ts1.add(data1[i]);
		int[] com_data1=new int[ts1.size()];
		int index=0;
		Iterator<Integer> it=ts1.iterator();
		while(it.hasNext()) {
			com_data1[index]=it.next();
			index++;
		}
		return com_data1;
	}
}
