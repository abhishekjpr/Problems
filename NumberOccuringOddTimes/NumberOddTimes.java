import java.io.*;
import static java.lang.Math.abs;

public class NumberOddTimes{
	public static void main(String... args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		int res = 0;
		System.out.println("\nEnter how many elements :: ");
		n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		System.out.println("\nEnter the "+n+" elements :: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("\nEntered array is :: ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
			res = res ^ arr[i];
		}
		System.out.println("\nNumber occured odd number of times is :: "+res);
	}
}
