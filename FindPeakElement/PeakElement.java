import java.io.*;

public class PeakElement{
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
		System.out.println("\nPeak element is :: "+new PeakElement().peakElement(arr));
	}
	
	public int peakElement(int []arr){
		int low = 0, high = arr.length-1;
		if(arr.length == 0){
			return -1;
		}
		else if(arr.length == 1){
			return arr[0];
		}
		while(low <= high){
			int mid = low + (high-low)/2;
			if((mid == arr.length-1)||(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]))
				return arr[mid];
			else if(arr[mid]-1 > arr[mid])
				high = mid - 1;
			else if(arr[mid]+1 > arr[mid])
				low = mid + 1;
			else 
				return -1;
		}
		return -1;
	}
}
