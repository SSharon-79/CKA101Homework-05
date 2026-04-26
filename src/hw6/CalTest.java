package hw6;

import java.util.Scanner;

public class CalTest {
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		outer:
		while (true) {
			System.out.println("請輸入x的值: ");
			try {
				c.setX(sc.next());
			}catch (NumberFormatException e) {
				continue outer;
			}
		
			inner:
			while(true) {
				System.out.println("請輸入y的值: ");
				try {
					c.setY(sc.next());
					break inner;
				}catch (NumberFormatException e) {
					continue inner;
				}
			}

			try {
				System.out.print(c.getX() + "的" + c.getY() + "次方等於" + c.powerXY(c.getX(), c.getY()));
				break outer;
			}catch(CalException e) {
				System.out.println(e.getMessage());
			}
		}
		sc.close();
	}
}
