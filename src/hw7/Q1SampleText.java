package hw7;

// 請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息: Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Q1SampleText {
	
	public static void main(String[] args) {
		
		try {
			File file = new File("C:\\javawork\\Sample.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			int i;
			int charCount = 0;
			int listCount = 1;
			while ((i = br.read()) != -1) {
				System.out.print((char)i);
				charCount ++;
				if ((char)i == '\n') {
					listCount++;
				}
			}
			System.out.println();
			
//			String string;
//			while ((string = br.readLine()) != null) {
//				System.out.println(string);
//			}
			System.out.println(file.getName() + "檔案共有" + file.length() + "個位元組，" + charCount + "個字元，" + listCount + "列資料");
			br.close();
			fr.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
