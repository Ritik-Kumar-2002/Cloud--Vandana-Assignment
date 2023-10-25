import java.util.*;
public class RomanToInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> map =new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		String roman = sc.next();
		int size = roman.length();
		
		int num= map.get(roman.charAt(size-1));
		
		for(int i=size-2; i>=0; i--) {
			if( map.get(roman.charAt(i)) >= map.get(roman.charAt(i+1))) {
				num += map.get(roman.charAt(i));
			}else {
				num -= map.get(roman.charAt(i));
			}
		}
		System.out.println(num);
	

	}

}
