package stringmthod;

public class Text {
	public static void main(String[] args) {
		 String str = new String("Welcome-to-Runoob");
	        System.out.println("- �ָ�������ֵ :" );
	        for (String retval: str.split("-")){
	            System.out.println(retval);
	        }	
	}
}
