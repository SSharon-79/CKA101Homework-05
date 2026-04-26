package hw6;

public class Calculator {
	private int x;
	private int y;
	
	public void setX(String x) throws NumberFormatException{
		try {
			this.x = Integer.parseInt(x);
//			System.out.println("x = " + this.x);
		}catch (NumberFormatException e) {
			System.out.println("輸入格式不正確");
			throw e;
		}
	}
	
	public void setY(String y) throws NumberFormatException{
		try {
			this.y = Integer.parseInt(y);
//			System.out.println("y = " + this.y);
		}catch (NumberFormatException e) {
			System.out.println("輸入格式不正確");
			throw e;
		}
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int powerXY(int x, int y) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義!");
		}
		else if (y < 0 ) {
			throw new CalException("次方為負值，結果回傳不為整數!");
		}
		else {
			return (int)(Math.pow(x, y));
		}
	}
	
	public Calculator() {
	}
	public Calculator(String x, String y) {
		setX(x);
		setY(y);
	}

}
