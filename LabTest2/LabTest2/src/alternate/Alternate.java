package alternate;

public class Alternate {
	
	// The method to find the alternate elements in given array and calculate the sum of array 2 
	static void alternate(int arr1[]) {
		int n = arr1.length;
		int j = 0;
		int ans = 0;
		int arr2[] = new int[n];
		System.out.println("The elements in second array are: ");
		for(int i = 0; i < n; i += 2) {
			arr2[j] = arr1[i];
			System.out.println(arr2[j]);
			j++;	
		} 
		for(int x = 0; x < arr2.length; x++) {
			ans += arr2[x];
			
		}
		System.out.println("The sum of elements in second array is: " + ans);
	}

	// Main method to call the alternate method and to provide the arguments for alternate method
	public static void main(String[] args) {
		int arr[] = {1, 3, 4, 6, 7, 54, 30, 23, 56};
		alternate(arr);
	}

	
	
}
