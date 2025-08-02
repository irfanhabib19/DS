package sorting;

class quick_sort {
	public static void quickSort(int[] arr, int low, int high) {
		if(low <high){
			int pi=partition(arr, low, high);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}
	public static int partition(int[] arr, int low, int high) {
		int pivot= arr[high];
		int i=low-1;
		for(int j=low;j<high;j++){
			if(arr[j]<=pivot){
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
      return i+1;
			}
		
public static void main(String[] args) {
	System.err.println("Quick Sort Algorithm");
	int[] arr={21,4,67,43,89,54,29,77};
	System.out.println("Unsorted Array:");
	for(int arrElement :arr){
		System.out.print(arrElement + " ");
	}
	quickSort(arr, 0, arr.length-1);
	System.out.println("\nSorted Array:");
	for(int arrElement : arr){
		System.out.print(arrElement + " ");
	}
}
}
