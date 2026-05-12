package hw7;

// 請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用append功能讓每次執行結果都能被保存起來)

import java.io.*;

public class Q2DataRan {
	public static void main(String[] args) {
		try {
			FileOutputStream fo = new FileOutputStream("C:\\javawork\\Data.txt", true);
			PrintStream ps = new PrintStream(fo);
			int num = 0;
			for (int i = 0; i < 10; i++) {
				num = (int)(Math.random()*1000 + 1);
				System.out.print(num + " ");
				ps.print(num + " ");
			}
			System.out.println("寫入完畢");
			ps.close();
			fo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
