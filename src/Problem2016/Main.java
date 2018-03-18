package Problem2016;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			if (n == 0) {
				break;
			} else {
				int arr[] = new int[n];
				int temp = 0;
				int flag = 0;
				for (int i = 0; i < n; i++) {
					arr[i] = in.nextInt();
				}
				int min = arr[0];
				for (int i = 0; i < n; i++) {
					if (arr[i] < min) {
						min = arr[i];
						temp = i;
					}
				}
				int t = arr[0];
				arr[0] = min;
				arr[temp] = t;
				for (int i = 0; i < n; i++) {
					if (flag == 0) {
						System.out.print(arr[0]);
						flag++;
					} else {
						System.out.print(" " + arr[i]);
					}

				}
				System.out.println();
			}
		}
	}
}
