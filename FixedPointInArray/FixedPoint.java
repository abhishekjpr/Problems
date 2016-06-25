import java.io.*;

public class FixedPoint{
	public static void main(String... args)
		throws IOException{
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
		System.out.println("\nPeak element is :: "+new FixedPoint().findPoint(arr));
	}
	
	public int findPoint(int []arr){
		int low = 0, high = arr.length-1;
		if(arr.length == 0){
			return -1;
		}
		else if(arr.length == 1){
			if(arr[0] == 0){
				return arr[0];
			}
			return -1;
		}
		while(low <= high){
			int mid = low + (high-low)/2;
			if(arr[mid] == mid)
				return arr[mid];
			else if(mid < arr[mid])
				high = mid - 1;
			else if(mid > arr[mid])
				low = mid + 1;
			else 
				return -1;
		}
		return -1;
	}
}
