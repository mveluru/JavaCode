package come.brite.other;

import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		int max = (int) Math.pow(10, 5) * 4;

		if (1 <= s.length() && s.length() <= max) {
			String[] stringInput = s.split("\\_|\\.|\\@|\\?|\\,|!|\\'|\\s+");
			int count = 0;
			for (String str : stringInput) {
				if (!str.isEmpty())
					count++;
			}
			System.out.println(count);
			for (String str : stringInput) {
				if (!str.isEmpty())
					System.out.println(str);
			}
		}
		scan.close();
	}

}
