package stringmthod;

import java.util.Scanner;

public class GetChars {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	while(in.hasNext()){
		String str = in.next();
		char[] ch = new char[2];
        try {
            str.getChars(4,6, ch, 0);
            System.out.print("¿½±´µÄ×Ö·û´®Îª£º" );
            for(char a :ch){
            	System.out.println(a);
            }
        } catch( Exception ex) {
            System.out.println("´¥·¢Òì³£...");
        }
		
	}
}
}
