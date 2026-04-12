package hw5;

// 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值

public class Q2RandomAVG {
	
	public static void randAvg() {
		double avg = 0.0;
		double sum = 0.0;
		int num = 0;
		
		System.out.println("本次亂數結果:");
		for (int i = 0; i < 10; i++) {
			num = (int)(Math.random() * 101);
			System.out.print(num + " ");
			sum += num;
		}
		System.out.println();
		
		avg = sum / 10;
//		System.out.println(sum);
		System.out.println(avg);
	}

	public static void main(String[] args) {
		randAvg();
	}
}
