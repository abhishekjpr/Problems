import java.io.*;
import static java.lang.Math.abs;

public class MissingNumber{
	public static void main(String... args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		int x1, x2;
		x1 = x2 = 0;
		System.out.println("\nEnter how many elements :: ");
		n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		System.out.println("\nEnter the "+n+" elements :: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("\nEntered array is :: ");
		for(int i = 0; i < arr.length; i++){
			x1 ^= arr[i];
		}
		for(int i = 1; i <= arr.length+1; i++)
			x2^=i;
		System.out.println("\nMissing :: "+(x1^x2));
	}
}
