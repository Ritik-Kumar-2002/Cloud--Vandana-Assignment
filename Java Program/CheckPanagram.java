
import java.util.*;
public class CheckPanagram {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int len = str.length();
		int i=0;
		while(i<len) {
			if((str.charAt(i) >='a' && str.charAt(i) <='z')  || str.charAt(i) == ' ') {
				i++;
			}else {
				break;
			}
		}
		if(i==len) System.out.println("PANGRAM");
		else System.out.println("NOT PANGRAM");
		
	}

}
