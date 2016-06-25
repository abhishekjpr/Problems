import java.io.*;
import static java.lang.Math.abs;

public class MoveAllZeroes{
	public static void main(String... args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
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
		}
		System.out.println("\nAfter Manipulating array is :: ");
		new MoveAllZeroes().moveZeroArray(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	public void moveZeroArray(int []arr){
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i]!=0){
				arr[count++] = arr[i];
			}
		}
		while(count<arr.length){
			arr[count++] = 0;
		}
		
	}
}
