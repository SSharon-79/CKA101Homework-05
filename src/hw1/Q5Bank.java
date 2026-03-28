package hw1;

// 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)

public class Q5Bank {
	public static void main(String[] args) {
		int deposit = 150;
		double rate = 0.02;
		int year = 10;
		double sum = deposit;
		
		for (int i = 0; i < year; i++) {
			sum = sum *(1 + rate);
		}
		
		sum = sum * 10000;
		
		System.out.printf("本金加利息共有%.0f元", sum);
	}

}
