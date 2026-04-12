package hw4;

// 請建立一個字串,經過程式執行後,輸入結果是反過來的

public class Q2StringReversed {
	
	public static void reversed(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		String s1 = "Hello World";
		reversed(s1);
	}

}
