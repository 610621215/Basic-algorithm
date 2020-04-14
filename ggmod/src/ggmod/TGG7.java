package ggmod;
//∞Ô≈|¶^§Â
public class TGG7 {
	static String context="xyzyx";
	static String[] txt_array;
	static String[] reverse_txt_array;
	static String copy_text="";
	public static void main(String[]args) {
		txt_array=new String[context.length()/2+1];
		reverse_txt_array=new String[context.length()/2+1];
		stack_element(0);
		show();
	}
	
	public static String stack_element(int flag) {
		System.out.println(flag+"\t"+copy_text);
		if(flag==context.length()/2) {
			System.out.println(context.charAt(flag)+"");
			copy_text+=context.charAt(flag);
			txt_array[flag]=context.charAt(flag)+"";
			System.out.println(flag+"\t"+copy_text);
			return context.charAt(flag)+"";
		}
		copy_text+=context.charAt(flag);
		txt_array[flag]=context.charAt(flag)+"";
		return stack_element(++flag);
	}
	
	public static void show() {
		for(int i=0;i<txt_array.length;i++)
			System.out.println(txt_array[i]);
	}
}
