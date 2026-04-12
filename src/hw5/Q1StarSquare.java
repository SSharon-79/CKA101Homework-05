package hw5;

// 請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形

import java.util.Scanner;

public class Q1StarSquare {
	
	public static void starSquare() {
		Scanner sc = new Scanner(System.in);
		int count = 2;
		int width = 0, height = 0;
		
		System.out.println("請輸入寬與高: ");
		while (count > 0) {
			if (sc.hasNextInt()) {
				width = sc.nextInt();
				if (width > 0) {
					count--;
				}
				else {
					System.out.print("請輸入正整數寬與高: ");
					sc.next();
					count = 2;
					continue;
				}
				if (sc.hasNextInt()) {
					height = sc.nextInt();
					if (height > 0 ) {
						count--;
					}
					else{
						System.out.print("請輸入正整數寬與高: ");
						count = 2;
						continue;
					}
				}
			}
		}
		sc.close();
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		starSquare();
	}
	
}
