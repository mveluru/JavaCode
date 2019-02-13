package come.brite.other;

import java.util.Scanner;

public class ParrellogramArea {
	static boolean flag = false;
	static int B = 0;
	static int H = 0;

	public static void pallerogramarea() {
		Scanner scanner = new Scanner(System.in);
		B = scanner.nextInt();
		H = scanner.nextInt();

		if (B > 0 && H > 0) {
			flag = true;
		} else if (B < 0 && H < 0) {
			flag = false;
			scanner.close();

		}

		scanner.close();

	}

	public static void main(String[] args) {
		pallerogramarea();
		if (flag) {
			int area = B * H;
			System.out.print(area);
		} else {
			try {
				throw new Exception("Breadth and height must be positive");
			} catch (Exception e) {
				System.out.println(e.getMessage().toString());
			}
		}

	}

}
