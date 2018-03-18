package Problem2017;

import java.util.Scanner;  

public class Main{  
    public static void main(String[] args){  
        Scanner in=new Scanner(System.in);  
        while(in.hasNext()){
        	int n=in.nextInt();	
        	for(int i = 0;i<n;i++){
        		int num =0;
        		String str = in.next();
        		char arr[] = str.toCharArray();
        		for(int j=0;j<arr.length;j++){
        			if(arr[j]>47&&arr[j]<58){
        				num++;
        			}
        		}
        		System.out.println(num);
        	}    	
        }
    }  
}