package hw3;

import java.util.Arrays;
import java.util.Scanner;

// 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形

public class Q1Triangle {
	
	public static String isTriangle(double a, double b, double c){

		if ((a + b <= c)) {
			return "不是三角形";
		}
		else if ((a == b) && (b == c)) {
			return "正三角形";
		}
		else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
			return "直角三角形";
		}
		else if ((a == b) || (b == c) || (c == a)) {
			return "等腰三角形";
		}
		else {
			return "其他三角形";
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入三角形三邊長: ");
		int count = 0;
		double[] length = new double[3];
		while(count < 3) {
			if (sc.hasNextDouble()) {
				length[count] = sc.nextDouble();
				count++;
			}
		}
		sc.close();
		
		Arrays.sort(length);
		System.out.println(isTriangle(length[0], length[1], length[2]));
	}

}
