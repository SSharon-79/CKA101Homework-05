package hw5;

// 身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫與數字的亂數組合

public class Q6GenAuthCode {
	// 0~9 => 48~57
	// A~Z => 65~90
	// a~z => 97~122
	
	public static void genAuthCode() {
		System.out.println("本次隨機產生驗證碼為:");
					 // {起始值, 個數}
		int[][] group = {{48, 10}, {65, 26}, {97, 26}};
		
		for (int i = 0; i < 8 ; i++) {
			// 找出使用哪一組, 數字or小寫字母or大寫字母
			int index = (int)(Math.random() * 3);
			char c = (char)(group[index][0] + (int)(Math.random() * group[index][1]));
			
			System.out.print(c);
		}
	}
	
	public static void main(String[] args) {
		genAuthCode();
	}
}
