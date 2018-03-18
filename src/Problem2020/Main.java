package Problem2020;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		while(sr.hasNext()){
			int flag = 0;
			int n = sr.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sr.nextInt();
			}
			if(n==0){
				break;
			}else{
				for(int i=0;i<arr.length-1;i++){
					for(int j=0;j<arr.length-1-i;j++){
						if(Math.abs(arr[j])<Math.abs(arr[j+1])){
							int temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1] = temp;
						}
					}
				}
				for(int i=0;i<n;i++){
					if(flag==0){
						System.out.print(arr[i]);
						flag++;
					}else{
						System.out.print(" "+arr[i]);
					}
				}
			}
			System.out.println();
		}
	}
}
