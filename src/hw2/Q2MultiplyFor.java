package hw2;

// 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)

public class Q2MultiplyFor {
	
	public static int multiplyFor(int num) {
		int mul = 1;
		for (int i = 1; i <= num; i++) {
			mul *= i;
		}
		return mul;
	}
	
	public static void main(String[] args) {
		System.out.println(multiplyFor(10));
	}

}
