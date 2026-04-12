package hw4;

// 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」

import java.util.Scanner;

public class Q4Money {
	
	public static void money() {
		
		Scanner sc = new Scanner(System.in);
		int m = 0;
		System.out.print("請輸入欲借的金額: ");
		if(sc.hasNextInt()) {
			m = sc.nextInt();
		}
		sc.close();
		
		int[][] empMoney = {{25, 2500}, {32, 800}, {8, 500}, {19, 10000}, {27, 1200}};
		int count = 0;
		
		System.out.print("有錢可借的員工編號: ");
		
		for (int i = 0; i < empMoney.length; i++) {
			for(int j = 1; j < empMoney[i].length; j++) {
				if (empMoney[i][j] >= m) {
					count++;
					System.out.print(empMoney[i][0] + " ");
				}
			}
		}
		System.out.print("共" + count + "人");
	}

	
	public static void main(String[] args) {
		money();
	}

}
