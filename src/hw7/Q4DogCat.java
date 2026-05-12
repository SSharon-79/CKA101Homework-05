package hw7;

// 請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾

import java.io.*;

public class Q4DogCat {
	
	public static void main(String[] args) {
		Dog dogA = new Dog("dogA");
		Cat catA = new Cat("catA");
		Dog dogB = new Dog("dogB");
		Cat catB = new Cat("catB");
		
		File file = new File("C:\\data");
		if (!file.exists()) {
			file.mkdir();
		}
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\data\\Object.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(dogA);
			oos.writeObject(catA);
			oos.writeObject(dogB);
			oos.writeObject(catB);
			
			oos.close();
			fos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

}
