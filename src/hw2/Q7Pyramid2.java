package hw2;

// 請設計一隻Java程式,輸出結果為以下:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF

public class Q7Pyramid2 {
	
	public static void pyramid2(char F) {
		for (char i = 'A'; i <= F; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		pyramid2('F');
	}

}
