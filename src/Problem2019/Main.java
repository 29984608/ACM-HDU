package Problem2019;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		while (sr.hasNext()) {
			int n = sr.nextInt();
			int m = sr.nextInt();
			int[] arr = new int[n + 1];
			int flag = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = sr.nextInt();
			}
			arr[n] = m;
			if (n == 0 && m == 0) {
				break;
			} else {
				for (int i = 0; i < arr.length - 1; i++) {
					for (int j = 0; j < arr.length - 1 - i; j++) {
						if (arr[j] > arr[j + 1]) {
							int temp = arr[j];
							arr[j] = arr[j + 1];
							arr[j + 1] = temp;
						}
					}
				}
				for (int i = 0; i < arr.length; i++) {
					if (flag == 0) {
						System.out.print(arr[i]);
						flag++;
					} else {
						System.out.print(" " + arr[i]);
					}
				}
				System.out.println();
			}

		}
	}}


