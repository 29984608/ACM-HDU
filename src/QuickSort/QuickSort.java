package QuickSort;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 22, 36, 4, 51, 36, 8, 44, 5, 62, 14, 5, 6, 32 };
		Qucli(arr, 0, arr.length - 1);
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	public static void Qucli(int[] arr, int begin, int end) {
		int i = begin;
		int j = end;
		int base = arr[begin];
		while(i<j){
			while(arr[i]<base){i++;}
			while(arr[j]>base){j--;}
			if(i<=j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			if(begin<j){
				Qucli(arr,begin,j);
			}
			if(end>i){
				Qucli(arr,i,end);
			}
		}
	}
}