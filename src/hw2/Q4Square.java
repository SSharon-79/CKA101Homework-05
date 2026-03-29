package hw2;

// 請設計一隻Java程式,輸出結果為以下:1 4 9 16 25 36 49 64 81 100

public class Q4Square {
	
	public static void square(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.print(i * i + " ");
		}
	}
	
	public static void main(String[] args) {
		square(10);
	}

}
