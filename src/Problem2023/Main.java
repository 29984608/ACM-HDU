package Problem2023;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		while (sr.hasNext()) {
			int n = sr.nextInt();
			int m = sr.nextInt();
			int[][] arr = new int[n][m];
			double[] stu_avg = new double[n];
			double[] cur_avg = new double[m];
			int stu_count = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					arr[i][j] = sr.nextInt();
				}
			}

			for (int i = 0; i < n; i++) 
			{
				for (int j = 0; j < m; j++) {
					stu_avg[i] += arr[i][j];
				}
				stu_avg[i] = stu_avg[i] / m;
				if (i < n - 1) {
					System.out.printf("%.2f ", stu_avg[i]);
				} else {
					System.out.printf("%.2f\r\n", stu_avg[i]);
				}
			}
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					cur_avg[i] += arr[j][i];
				}
				cur_avg[i] = cur_avg[i] / n;
				if (i < m - 1) {
					System.out.printf("%.2f ", cur_avg[i]);
				} else {
					System.out.printf("%.2f\r\n", cur_avg[i]);
				}
			}
			for (int i = 0; i < n; i++) {
				int t = 1;
				for (int j = 0; j < m; j++) {
					if (arr[i][j] < cur_avg[j]) {
						t = 0;
						break;
					}
				}
				if (t == 1) {
					stu_count += 1;
				}
			}
			System.out.printf("%d\r\n\r\n",stu_count);

		}
	}

}
