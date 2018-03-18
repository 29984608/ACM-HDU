package Problem2022;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		while (sr.hasNext()) {
			int m = sr.nextInt();
			int n = sr.nextInt();
			int max = 0;
			int x = 0,y = 0,s = 0;
			int[][] arr= new int[m][n];
			for (int i = 0; i <arr.length; i++) {
				for (int j = 0; j <arr[i].length; j++) {
					arr[i][j] = sr.nextInt();
					}
				}
			for (int i = 0; i <arr.length; i++) {
				for (int j = 0; j <arr[i].length; j++) {
					if(Math.abs(arr[i][j])>Math.abs(max)){
						max=arr[i][j];
						x = i+1;
						y = j+1;
					} 
					}
				}
			System.out.println(x+" "+y+" "+max);
			}

			}
		}
