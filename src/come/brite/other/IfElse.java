package come.brite.other;

import java.util.Scanner;

public class IfElse {
	
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	while (scanner.hasNext()) {
		int a = scanner.nextInt();
		if (a%2!=0) {
			System.out.println("Weird");
		}else {
			if (a>=2 && a<=5) {
				System.out.println("Not Weird");
			}else if (a>=6 && a<=20) {
				System.out.println("Weird");
			}else {
				System.out.println("Not Weird");
			}
		}
	}
	scanner.close();
}

}
