package hw1;

// 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長

public class Q4Pi {
	public static void main(String[] args) {
		final double pi = 3.1415;
		int radius = 5;
		
		System.out.println("半徑為" + radius + "的圓面積為" + (pi*Math.pow(radius, 2)) + ", 周長為" + (2*pi*radius));
//		System.out.println("半徑為" + radius + "的圓面積為" + (pi*radius*radius) + ", 周長為" + (2*pi*radius));
	}

}
