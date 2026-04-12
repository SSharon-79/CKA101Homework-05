package hw5;

public class TestQ3 {
	public static void main(String[] args) {
		int[][] intArray = {{1, 6, 3}, {9, 5, 2}};
		double[][] doubleArray = {{1.2, 3.5, 2.2}, {7.4, 2.1, 8.2}};
		
		
		Q3Overloading w = new Q3Overloading();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
	}

}
