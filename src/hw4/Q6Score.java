package hw4;

// 請算出每位同學考最高分的次數

public class Q6Score {
	
	public static void highestScore(int[][] s) {
		int[] count = new int[8];
		
		for(int i = 0; i < s.length; i++) {
			int maxIndex = 0;
			for (int j = 0; j < s[i].length; j++) {
				if (s[i][j] > s[i][maxIndex]) {
					maxIndex = j;
				}
			}
			count[maxIndex]++;
		}
		
		for (int i = 0; i < count.length; i++) {
			System.out.println("第" + (i + 1) + "號同學考過" + count[i] + "次最高分");
		}
		
	}
	
	public static void main(String[] args) {
		int[][] studentScore = {
				{10, 35, 40, 100, 90, 85, 75, 70},
				{37, 75, 77, 89, 64, 75, 70, 95},
				{100, 70, 79, 90, 75, 70, 79, 90},
				{77, 95, 70, 89, 60, 75, 85, 89},
				{98, 70, 89, 90, 75, 90, 89, 90},
				{90, 80, 100, 75, 50, 20, 99, 75}
		};
		
		highestScore(studentScore);
	}

}
