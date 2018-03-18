package Problem2014;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			int arr[] = new int[n];
			int sum = 0, max = 0, min = 100;
			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
				sum += arr[i];
			}
			for (int i = 0; i < n; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
			}
			for (int i = 0; i < n; i++) {
				if (arr[i] < min) {
					min = arr[i];
				}
			}
			sum = sum - max - min;
			double avg = (double) sum / (n - 2);
			System.out.printf("%.2f", avg);
			System.out.println();
		}
	}
}
