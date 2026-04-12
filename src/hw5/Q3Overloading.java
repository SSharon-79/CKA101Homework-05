package hw5;

// 利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),可以找出二維陣列的最大值並回傳

public class Q3Overloading {
	
	public int maxElement(int[][] x) {
		int max = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}
	
	public double maxElement(double[][] x) {
		double max = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

}
