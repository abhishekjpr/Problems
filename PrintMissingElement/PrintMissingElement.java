import java.io.*;
import static java.lang.Math.abs;

public class PrintMissingElement{
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
		new PrintMissingElement().printMissingRange(arr);
	}
	
	public void printMissingRange(int[] arr){
		boolean[] someArray = new boolean[100];
		int first, last;
		boolean check = false;
		first = last = -1;
		for(int i = 0; i < arr.length; i++){
			if(arr[i]<=99 && arr[i]>=0)
				someArray[arr[i]] = true;
		}
		for(int i = 0; i < someArray.length; i++){
			
			if(someArray[i] == false){
				first = i;
				i++;
				if(i<someArray.length&&someArray[i] == true){
					System.out.print("\n"+first);
				}
				/* checking if more numbers are false */
				else{
					while(i<someArray.length&&someArray[i] == false){
						last = i;
						i++;
					}
					if(first!=-1 && last !=-1)
						System.out.print("\n"+first+" - "+last);
					else
						System.out.print("\n"+first);
				}
				first = last = -1;
			}
		}
	}
}
