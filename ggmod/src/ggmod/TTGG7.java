package ggmod;
//∞Ô≈|
public class TTGG7 {
		static String[] txt;
		public static void main(String[] args) {
			txt=new String[] {"x","y","z","y","x"};
			String[] box=new String[txt.length/2];
			int top=0;
			for(int i=0;i<txt.length/2;i++) {
				box[top++]=txt[i];
			}
			show(box);
			int anti_even=(txt.length%2)==0?2:1;
			boolean check=true;
			for(int j=txt.length+anti_even;j<txt.length;j++) {
				if(!box[top].equals(txt[j])) {		
					check=false;
					break;
				}
					
				top--;
			}
			System.out.println(check);
			
		}
		public static void show(String[] ss) {
			
			for(int i=0;i<ss.length;i++) {
				
				System.out.print(ss[i]+"\t");
				
			}
			
		}
}
