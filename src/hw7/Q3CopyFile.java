package hw7;

// 請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所代表的檔案會複製到第二個參數代表的檔案

import java.io.*;

public class Q3CopyFile {
	
	public static void copyFile(File original, File copy) {
		try {
			FileReader fr = new FileReader(original);
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter(copy);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			String s;
			while ((s = br.readLine()) != null) {
				pw.println(s);
				System.out.println(s);
			}
			pw.close();
			bw.close();
			fw.close();
			br.close();
			fr.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		File original = new File("C:\\javawork\\Hello.txt");
		File copy = new File("C:\\javawork\\copy.txt");
		
		copyFile(original, copy);
		
	}

}
