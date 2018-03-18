package stringmthod;

import java.util.Scanner;

public class CharAt {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String str = in.next();
			System.out.println(str.charAt(5));
		}
	}
}
