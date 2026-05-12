package hw7;

// 承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多型簡化本題的程式設計)

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Q5DogCatRead {
	
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\data\\Object.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			try {
				while (true) {
					Object object = ois.readObject();
					if (object instanceof Dog) {
						((Dog)object).speak();
					}
					else if (object instanceof Cat) {
						((Cat)object).speak();
					}
				}
			} catch (EOFException e) {
				System.out.println("資料讀取完畢");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			ois.close();
			fis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
