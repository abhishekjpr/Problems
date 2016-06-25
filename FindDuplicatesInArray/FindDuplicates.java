import java.io.*;
import static java.lang.Math.abs;

public class FindDuplicates{
	public static void main(String... args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.println("\nEnter how many elements :: ");
		n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		System.out.println("\nEnter the "+n+" elements :: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*10);//Integer.parseInt(br.readLine());
		}
		System.out.println("\nEntered array is :: ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nDuplicate values are :: ");
		for(int i = 0; i < arr.length; i++){			
			if(arr[abs(arr[i])]>=0){
				arr[abs(arr[i])] = -arr[abs(arr[i])];
			}			
			else{
				System.out.print(abs(arr[i])+" ");
			}
		}
	}
}
