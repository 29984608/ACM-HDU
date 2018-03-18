package Problem2015;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	while(in.hasNext()){
		int n = in.nextInt();
		int m = in.nextInt();
		int num = 2;
		int sum = 0;
		int flag = 0;
		for(int i = 1;i<=n;i++){
				sum += num;
				num += 2;
				if(i%m==0){
					if(flag == 0)
					{
					System.out.print(sum/m);
					flag++;
					}else{
						System.out.print(" "+(sum/m));
					}
					sum = 0;
				}
		}
		if(n%m==0){
			System.out.println();
		}else{
			System.out.println(" "+sum/(n%m));
		}
			}
	}
}