package hw3;

import java.util.Scanner;

// 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果

public class Q2RandomGame {
	
	public static void randomGame() {
		int num = (int)(Math.random() * 10);
//		System.out.println("答案是: " + num);
		int guess = 0;
		boolean answer = false;
		System.out.println("開始猜數字吧!");
		
		Scanner sc = new Scanner(System.in);
		
		while(!answer) {
			if(sc.hasNextInt()) {
				guess = sc.nextInt();
				if (guess == num) {
					answer = true;
					System.out.println("答對了!答案就是" + num);
				}
				else if (guess > 9 || guess < 0) {
					System.out.println("請輸入一個0~9的正整數");
				}
				else {
					System.out.println("猜錯囉");
				}
			}
			else
			{
				System.out.println("請輸入一個0~9的正整數");
				sc.next();
			}
		}
		sc.close();
	}
	
	
// 進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案
	public static void randomGameAdv() {
		int num = (int)(Math.random() * 101);
//		System.out.println("答案是: " + num);
		int guess = 0;
		boolean answer = false;
		System.out.println("開始猜數字吧!");
		
		Scanner sc = new Scanner(System.in);
		
		while(!answer) {
			if(sc.hasNextInt()) {
				guess = sc.nextInt();
				if (guess == num) {
					answer = true;
					System.out.println("答對了!答案就是" + num);
				}
				else if (guess > 100 || guess < 0) {
					System.out.println("請輸入一個0~100的正整數");
				}
				else {
					System.out.println("猜錯囉");
					if (guess > num) {
						System.out.println("你的數字大於正確答案~");
					}
					else {
						System.out.println("你的數字小於正確答案~");
					}
				}
			}
			else
			{
				System.out.println("請輸入一個0~100的正整數");
				sc.next();
			}
		}
		sc.close();
	}
	
	public static void main(String[] args) {
//		randomGame();
		randomGameAdv();
	}
	
}
