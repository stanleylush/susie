package com.susie.stanley.algorithms.sort;

public class BubbleSort {
	
	float f = 1.3f;
	char c = 'a';
	byte b = 127;
//	boolean bl = null;
	int i = 10;

	static int arr[] = new int[10];
	public static void main(String[] args) {
//		int[] arr = {4,3,9,1,5,2,8,6,7};
//		sort(arr);
		
		System.out.println(arr[1]);
	}
	private static int temp;
	public static void sort(int[] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=1; j<arr.length - i; j++){
				if(arr[j] > arr[j-1]){
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
			System.out.println(arr[arr.length - i - 1]);
		}
	}

}
