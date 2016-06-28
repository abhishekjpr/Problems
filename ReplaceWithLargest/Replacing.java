import java.io.*;
import static java.lang.Math.abs;

public class Replacing{
	public static void main(String... args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		int max = 0;
		int pMax = 0;
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
		for(int i = arr.length-1; i >= 0; i--){  	//16 17 4 3 5 2
			if(arr[i] > max){						// -1
				pMax = max;
				max = arr[i];
			}
			if(i != arr.length-1){
				if(arr[i] == max){
					arr[i] = pMax;
				}else
					arr[i] = max;
			}
			else{
				arr[i] = -1;
			}
		}
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}
