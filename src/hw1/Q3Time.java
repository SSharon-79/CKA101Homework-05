package hw1;

// 請由程式算出256559秒為多少天、多少小時、多少分與多少秒

public class Q3Time {
	
	public static void main(String[] args) {
		int sec = 256559;
		
		int day = sec / 60 / 60 / 24;
		int hour = sec / 60 / 60 % 24;
		int min = sec / 60 % 60;
		int secLeft = sec % 60;
		
		System.out.println(sec + "秒為" + day + "天" + hour + "小時" + min + "分" + secLeft + "秒");
	}

}
