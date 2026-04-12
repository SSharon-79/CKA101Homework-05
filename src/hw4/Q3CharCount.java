package hw4;

// 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)

public class Q3CharCount {
	
	public static void charCount(String[] s) {
		int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
		int totalVowels = 0;
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				switch(s[i].toLowerCase().charAt(j)) {
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						totalVowels++;
						break;
					default:
						break;
				}
			}
		}
		System.out.println("總共有" + totalVowels + "個母音");
		System.out.println();
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				switch(s[i].toLowerCase().charAt(j)) {
				
				case 'a':
					countA++;
					break;
				case 'e':
					countE++;
					break;
				case 'i':
					countI++;
					break;
				case 'o':
					countO++;
					break;
				case 'u':
					countU++;
					break;
				default:
					break;
				}
			}
		}
		System.out.println("母音a有" + countA + "個");
		System.out.println("母音e有" + countE + "個");
		System.out.println("母音i有" + countI + "個");
		System.out.println("母音o有" + countO + "個");
		System.out.println("母音u有" + countU + "個");
	}
	
	
	public static void main(String[] args) {
		String[] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		charCount(planet);
	}

}
