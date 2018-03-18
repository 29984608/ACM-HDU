package Problem2021;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		while(sr.hasNext()){
			int n = sr.nextInt();
			int count = 0;
			int[] arr = {100,50,10,5,2,1};
			if(n==0){
				break;
			}else{
				for(int i=0;i<n;i++){
					int num = sr.nextInt();
					for(int j=0;j<arr.length;j++){
						count += num/arr[j];
						num%=arr[j];
					}
				}
			}
			System.out.println(count);
		}
	}
}
