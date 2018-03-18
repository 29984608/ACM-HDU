package Problem2013;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int sum=1;
			for(int i=1;i<n;i++){
				sum = 2*(sum+1);
			}
			System.out.println(sum);
		}
	}
}
