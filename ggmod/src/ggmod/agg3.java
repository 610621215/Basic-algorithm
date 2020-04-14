package ggmod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class agg3 {
//cpe 2019/12
//3
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			HashMap<Integer,Integer> goals=compute_data(input.nextLine());
			TreeSet<Integer> tree_goals=new TreeSet<Integer>();

			for(int i=0;i<26;i++) {
				if(goals.containsKey(i)) {
					tree_goals.add(goals.get(i));
					System.out.println(i+"\t"+goals.get(i));
				}
			}
			Iterator<Integer> it=tree_goals.iterator();
			ArrayList<Integer> ary_list=new ArrayList<Integer>();
			while(it.hasNext()) {
				ary_list.add(it.next());
			}
			int max=-3;
			for(int i=0;i<ary_list.size();i++) {
				if(max<(int)(ary_list.toArray()[i])) {			
					max=(int)(ary_list.toArray()[i]);
				}
			}
			System.out.println("max:"+max);
			boolean cool_check=true;
			for(int j=3;j<max;j++) {
				if(!ary_list.contains(j)) {
					cool_check=false;
//					System.out.println(ary_list.get(i));
					break;
				}
			}
			if(cool_check&&max>=3)
				System.out.println("Cool");
			else
				System.out.println("not cool");
		}
		public static HashMap<Integer,Integer>  compute_data(String txt) {
			HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
			int[] words=new int[26];
			for(int i=0;i<txt.length();i++)
				words[txt.charAt(i)-'a']++;
			
			System.out.println();
			for(int i=0;i<words.length;i++)
				if(words[i]!=0)
					map.put(i,words[i]);	
			return map;
		}
}
