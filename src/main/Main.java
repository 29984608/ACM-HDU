package main;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n;
		while (in.hasNext()) {
			n = in.nextInt();
			String[] arr = new String[n];
			for (int i = 0; i < n; i++) {
				arr[i] = in.next();
			}
			//1 String����->�ַ���
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i]);
			}
			String str = sb.toString();
			//2 java�ַ���->char����
			char char1[]= str.toCharArray();
			for(char a :char1){
				System.out.print(a);
			}
			//3 java�ַ���->String����
			String[] arr2 = str.split("");
			for (String arr3 :arr2){
				System.out.println(arr3);
			}
			//4 char����(�ַ�����)->�ַ���
			String str3 = String.copyValueOf(char1);
			System.out.println(str3);
			//5 int����ת��string����
			int[]  array3={1,2,3,4,5,6,7,8,9,0};
			String arrStr = Arrays.toString(array3);
			System.out.println(arrStr);
			//6 String����תint����
			int[] ints = new int[arr.length];
			for (int i = 0;i<arr.length;i++){
				ints[i] = Integer.valueOf(arr[i]);
			}
			for(int a : ints){
				System.out.println(a);
			}
			
		}
	}
}
