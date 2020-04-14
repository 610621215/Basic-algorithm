package ggmod;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//¦ê¬y½m²ß
public class TGG3 {
	public static void main(String[]args) {
		try {
			
//			FileReader fr=new FileReader(new File("tp.txt"));
			BufferedReader br=new BufferedReader(new FileReader(new File("tp.txt")));
			String line="";
			while((line=br.readLine())!=null) {
				
				System.out.println(line);
				
			}
			
		}catch(Exception ex) {
			
			ex.printStackTrace();
			
		}
		
		
	}
}
