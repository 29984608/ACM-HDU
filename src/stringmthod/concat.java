package stringmthod;

import java.util.Scanner;

public class concat {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
		 String str = in.next();
		 String str1 = in.next();
		 System.out.println(str.concat(str1)); 
		}
	}
}
