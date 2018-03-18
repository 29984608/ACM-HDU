package Problem2012;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			int x = in.nextInt();
			int y = in.nextInt();
			boolean flag = true;
			int number = 0;
			int num = 0;
			if (x == 0 && y == 0) {
				break;
			} else {
				if (x > y) {
					int temp = x;
					x = y;
					y = temp;
				}
				for (int i = x; i <= y; i++) {
					num = i * i + i + 41;
					for (int j = 2; j <= Math.sqrt(num); j++) {
						if (num % j == 0) {
							flag = false;
						}
					}

				}
				if (flag == true) {
					System.out.println("OK");
				} else
					System.out.println("Sorry");
				flag = true;
			}
		}
	}
}