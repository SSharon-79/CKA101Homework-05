package hw1;

// 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:5 + 5, 5 + ‘5’, 5 + “5”, 並請用註解各別說明答案的產生原因

public class Q6Print {
	public static void main(String[] args) {
		
		// int 加 int 結果為 int
		System.out.println(5 + 5);
		
		// char和int型別可互相轉換，char '5'對應的Unicode整數值為53，所以結果為整數5 + 整數53 = 整數58
		System.out.println(5 + '5');
		
		// 遇到字串，+會變成串接，整數5會轉成字串"5"和"5"進行串接
		System.out.println(5 + "5");
	}

}
