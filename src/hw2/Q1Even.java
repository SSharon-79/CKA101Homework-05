package hw2;

// 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)

public class Q1Even {
	
	public static int addeven(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(addeven(1000));
		
	}
}
