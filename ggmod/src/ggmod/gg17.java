package ggmod;
//販賣機
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class gg17 {
	
	static Map<Integer,Object>mymap=new HashMap<Integer,Object>();
	static final String[] drink_name=new String[] {"zerg"};
	static final String[] coin_name=new String[] {"十元","五元","一元"};
	ArrayList<Object> result=new ArrayList<Object>();
	static gg17 g17=new gg17();
	class drink{
		String name="";
		int price=0;
		public drink(int price,String name) {
			this.name=name;
			this.price=price;
		}
		public String toString() {
			return name;
		}
		public int hashCode() {
			return this.price;
		}
	}
	public static void main(String[]args) {
		//int drink_tag=30;//共3瓶
		g17.new machine().show();
		Random rd=new Random();
		user ue=g17.new user();
		machine mach=g17.new machine(ue.get_info());
	
		//mach.drink_tag=drink_tag;
		mach.make_change();
		int[] result=mach.make_change();
		for(int i=0;i<result.length;i++) {
			System.out.print("找零為"+result[i]+"個"+coin_name[i]);
			if(i!=result.length-1)
				System.out.print("，");
		}
	}
	//10x+5y+z=價格
	//投入金額30元
	public static Map<Integer,Object> getMap(){
		
		return mymap;
		
	}
	class user{
		int cost;
		int select_tag;
		public user() {
			Scanner input=new Scanner(System.in);
			System.out.println("投入的金額:");
			this.cost=input.nextInt();
			System.out.println("選擇編號:");
			this.select_tag=input.nextInt();
		}
		public int[] get_info() {	
			return new int[] {cost,select_tag};
		}
		
	}
	class machine{
		int[] received_info;
		int drink_tag=0;
		public machine() {
		}
		public machine(int[] received_info) {
			this.received_info=received_info;
		}
		public void show() {
			Random rd=new Random();
			int drink_tag=30;//共30瓶
			for(int i=1;i<=drink_tag;i++) {
				drink drink=g17.new drink(rd.nextInt(20)+10,"zerg"+i);
				mymap.put(i,drink);
				
			}
			System.out.println("名稱"+"\t"+"價格");
			for(int i=1;i<=drink_tag;i++) {
				drink drink=(ggmod.gg17.drink) mymap.get(i);
				System.out.println(drink.name+"\t"+drink.price);
			}
		}
		public int[] make_change() {
			int[] coin=new int[] {0,0,0};
			int[] coin_rate=new int[] {10,5,1};
			System.out.println(received_info[0]+","+received_info[1]);
			drink drink=(ggmod.gg17.drink) mymap.get(received_info[1]);
			System.out.println(drink.toString()+","+drink.hashCode());
			int tp=Math.abs(drink.hashCode()-received_info[1]);
			
			int rate_index=0;
			while(tp!=0) {
				while(tp>=coin_rate[rate_index]) {
					tp-=coin_rate[rate_index];
					coin[rate_index]++;
				}
				rate_index++;
			}
			return coin;
		}
	}

}
