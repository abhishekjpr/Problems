import java.io.*;
import static java.lang.Math.abs;

public class Segregate{
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
		new Segregate().segregateArray(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	public void segregateArray(int []arr){
		int low = 0, high = arr.length-1;
		while(low < high){
			while(arr[low] == 0){
				low++;
			}
			while(arr[high] == 1){
				high--;
			}
			while(arr[low] == 1 && arr[high] == 0 && low < high){
				arr[low] = 0;
				arr[high] = 1;
				low++;
				high--;
			}
		}
	}
}
