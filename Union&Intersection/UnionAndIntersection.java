import java.io.*;
import static java.lang.Math.abs;

public class UnionAndIntersection{
	public static void main(String... args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, n1;
		int[] arr, brr;
		System.out.println("\nEnter how many elements in 1st array :: ");
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		System.out.println("\nEnter the "+n+" elements :: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("\nEnter how many elements in 2nd array :: ");
		n1 = Integer.parseInt(br.readLine());
		brr = new int[n1];
		System.out.println("\nEnter the "+n1+" elements :: ");
		for(int i = 0; i < brr.length; i++){
			brr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("\n1st array is :: ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n2nd array is :: ");
		for(int i = 0; i < brr.length; i++){
			System.out.print(brr[i]+" ");
		}
		System.out.println("\nUnion is :: ");
		printUnion(arr, brr);
		System.out.println("\nIntersection is :: ");
		printIntersection(arr, brr);
	}
	static void printUnion(int[] arr, int[] brr){
		int i, j;
		i = j = 0;
		while(i < arr.length && j < brr.length){
			if(arr[i] == brr[j]){
				System.out.print(arr[i]+", ");
				i++;
				j++;
			}
			else if(arr[i] < brr[j]){
				System.out.print(arr[i]+", ");
				i++;
			}
			else{
				System.out.print(brr[j]+", ");
				j++;
			}
		}
		while(i < arr.length){
			System.out.print(arr[i]+", ");
			i++;
		}
		while(j < brr.length){
			System.out.print(brr[i]+", ");
			j++;
		}
	}
	static void printIntersection(int[] arr, int[] brr){
		int i, j;
		i = j = 0;
		while(i < arr.length && j < brr.length){
			if(arr[i] == brr[j]){
				System.out.print(arr[i]+", ");
				i++;
				j++;
			}
			else if(arr[i] < brr[j]){
				i++;
			}
			else{
				j++;
			}
		}
	}
}
