package hw4;

// 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素

public class Q1ArrayAvg {
	
	public static void arrayAvg(int[] a) {
		double avg = 0.0;
		double sum = 0;
		
		for (int i = 0; i <a.length; i++) {
			sum += a[i];
		}
		avg = sum / a.length;
		System.out.println("所有元素的平均值 = " + avg);
		
		System.out.print("大於平均值的元素: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] > avg) {
				System.out.print(a[i] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		arrayAvg(a);

	}

}
