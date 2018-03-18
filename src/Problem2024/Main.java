package Problem2024;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		while (sr.hasNext()) {
			int n = sr.nextInt();
			sr.nextLine();
			for (int i = 0; i < n; i++) {
				String s = sr.nextLine();
				if (s.charAt(0) == '_' || s.charAt(0) >= 'a' && s.charAt(0) <= 'z'
						|| s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') {
					int t = 1;
					for (int j = 1; j < s.length(); j++) {
						if (s.charAt(j) == '_' || s.charAt(j) >= 'a' && s.charAt(j) <= 'z'
								|| s.charAt(j) >= 'A' && s.charAt(j) <= 'Z'
								|| s.charAt(j) >= '0' && s.charAt(j) <= '9') {
							t++;
						}
					}
					if (t == s.length()) {
						System.out.println("yes");
					} else {
						System.out.println("no");
					}
				} else {
					System.out.println("no");
				}
			}
		}
	}
}