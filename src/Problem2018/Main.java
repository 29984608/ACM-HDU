package Problem2018;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in); 
		while(sr.hasNext()){
			int n = sr.nextInt();
			if(n == 0){
				break;
			}else{
				System.out.println(cow(n));
			}
		}
	}
	public static int cow(int n){
		if(n <= 4){
			return n;
		}else{
			return cow(n-1)+cow(n-3);
		}
	}
}
