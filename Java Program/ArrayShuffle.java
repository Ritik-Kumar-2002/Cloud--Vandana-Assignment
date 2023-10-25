import java.util.*;

public class ArrayShuffle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		// CREATE AN OBJECT OR INSTANCE OF THE SCANNER CLASS 
		
		System.out.println("Enter a size of the array");
		int N = sc.nextInt();
		int [] arr = new int[N];
		System.out.println("Enter a data in a array ");
		for(int i=0; i<N; i++) arr[i] = sc.nextInt();
		
		Random rand = new Random();
		for(int i=0; i<N; i++) {
			int randpos = rand.nextInt(N);	// CREATE AN INSTANCE OF THE RANDOM CLASS 
			
			int temp = arr[randpos];		// SWAPPING OF THE ARR POSITION VALUE 
			arr[randpos] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println("SHUFFLE ARRAY IS ");
		for(int i=0; i<N; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
