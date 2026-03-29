package hw2;

// 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)

public class Q3MultiplyWhile {
	
	public static int multiplyWhile(int num) {
		int mul = 1;
		int i = 1;
		while (i <= num) {
			mul *= i;
			i++;
		}
		return mul;
	}
	
	public static void main(String[] args) {
		System.out.println(multiplyWhile(10));
	}

}
