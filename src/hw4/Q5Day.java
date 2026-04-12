package hw4;

// 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天

import java.util.Arrays;

// 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天

import java.util.Scanner;

public class Q5Day {
	
	public static void day() {
		Scanner sc = new Scanner(System.in);
		int[] days = new int[3];
		boolean flag = true;
		
		System.out.print("請輸入三個正整數，分別代表西元yyyy年mm月dd日: ");
		
		for (int i = 0; i < 3; i ++) {
			days[i] = sc.nextInt();
		}
		
		// check input
		while (flag) {
			if (checkYear(days[0])) {
				if (checkMonth(days[1])) {
					if(checkDate(days[0], days[1], days[2])){
						flag = false;
					}
					else {
						System.out.print("請輸入正確日期: ");
						if (sc.hasNextInt()) {
							days[2] = sc.nextInt();
						}
					}
				}
				else {
					System.out.print("請輸入正確月份: ");
					if (sc.hasNextInt()) {
						days[1] = sc.nextInt();
					}
				}
			}
			else {
				System.out.print("請輸入正確年份: ");
				if (sc.hasNextInt()) {
					days[0] = sc.nextInt();
				}
			}
		}
		sc.close();
//		System.out.print(days[0] + "年" + days[1] +"月" + days[2] + "日");
		
		System.out.println("輸入的日期為該年第" + countdays(days) + "天");
				
	}
	
	// count days of the year (if leap year, then +1)
	public static int countdays(int[] days) {
		int count = 0;
		int[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int[] date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int index = Arrays.binarySearch(months, days[1]);
		
		if (days[0] % 4 == 0 && index > 1) {
			for (int i = 0; i < index; i++) {
					count += date[i];
			}
			count = count + days[2] + 1;
		}
		else {
			for (int i = 0; i < index; i++) {
				count += date[i];
			}
			count = count + days[2];
		}
		
		return count;
	}
	
	// check year, month, date
	public static boolean checkYear(int y) {
		if (y > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean checkMonth(int m) {
		if (m >= 1 && m <= 12) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean checkDate(int y, int m, int d) {
		int[] m31 = {1, 3, 5, 7, 8, 10, 12};
		int[] m30 = {4, 6, 9, 11};
		
		// check date
		if(d < 1) {
			return false;
		}
		
		// check February
		if (m == 2) {
			if (y % 4 == 0 && d <= 29) {
				return true;
			}
			else if (d <= 28) {
				return true;
			}
			else return false;
		}
		
		// check months with 31 days
		if (Arrays.binarySearch(m31, m) >= 0) {
			if (d <= 31) {
				return true;
			}
			else {
				return false;
			}
		}
		// check months with 30 days
		else if (Arrays.binarySearch(m30, m) >= 0) {
			if (d <= 30) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	
	// main
	public static void main(String[] args) {
		day();
	}
	
}
