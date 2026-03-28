package hw1;

// 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)

public class Q2Egg {
	
	public static void main(String[] args) {
		int egg = 200;
		
		System.out.println(egg + " 顆蛋總共是 " + (egg / 12) + " 打 " + (egg % 12) + " 顆蛋");
	}
}
