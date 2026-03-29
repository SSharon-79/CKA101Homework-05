package hw1;

public class TestNineNine {
	
	public static void main(String[] args) {
		
		System.out.println("使用 for 迴圈");
		for (int i = 1; i <=9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "x" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
		
		System.out.println("======================================================================");
		// for + while 
		System.out.println("使用 for + while 迴圈");
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.print(i + "x" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
		}
		
		System.out.println("======================================================================");
		// for + do while
		System.out.println("使用 for + do while 迴圈");
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			do {
				System.out.print(i + "x" + j + "=" + i * j + "\t");
				j++;
			}while(j <= 9);
			System.out.println();
		}
		
		System.out.println("======================================================================");
		// while + do while
		System.out.println("使用 while + do while 迴圈");
		int i = 1;
		while (i <= 9) {
			int j = 1;
			do {
				System.out.print(i + "x" + j + "=" + i * j + "\t");
				j++;
			}while (j <= 9);
			System.out.println();
			i++;
		}
	}
}
