package hw3;

import java.util.Arrays;
import java.util.Scanner;

// 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數

public class Q3LotteryScanner {
	
	public static void lotteryScanner() {
		boolean flag = true;
		int num = 0;
		int count = 0;
		
		// 儲存可選擇的號碼
		int[] numbers = new int[50];
		
		System.out.println("阿文...請輸入你討厭哪個數字");
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			if(sc.hasNextInt()) {
				num = sc.nextInt();
				if(num >= 1 && num <= 9) {
					flag = false;
					for (int i = 1; i <= 49; i++) {
						if (i % 10 == num || i / 10 == num) {
							continue;
						}
						else {
							System.out.print(i + " ");
							numbers[count] = i;
							count++;
						}
					}
				}
				else {
					System.out.print("請輸入正整數1~9: ");
				}
			}
			else {
				System.out.print("請輸入正整數1~9: ");
				sc.next();
			}
		}
		sc.close();
		System.out.println("總共有" + count + "個數字可選");
		
		showRandom(numbers);
	}
	

// 進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複
// 將可選擇的號碼作為參數傳入
	public static void showRandom(int[] numbers) {
		int[] choice = new int[6];
		for (int i = 5; i >= 0; i--) {
			int index = (int)(Math.random() * 49);
			while (numbers[index] == 0 || Arrays.binarySearch(choice, numbers[index]) > 0) {
				index = (int)(Math.random() * 49);
			}
			choice[i] = numbers[index];
//			System.out.println("current number is: " + choice[i]);
			Arrays.sort(choice);
		}
		
		System.out.print("隨機六個不重複號碼: ");
		for (int i = 0; i < 6; i++) {
			System.out.print(choice[i] + " ");
		}
	}
			
	
	public static void main(String[] args) {
		lotteryScanner();
	}
}
