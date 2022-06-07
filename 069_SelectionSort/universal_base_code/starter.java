import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void insertionSort(int[] arr) {
		int x, y, key;
		
		for(x = 1; x < arr.length; x++) {
			key = arr[x];
			y = x-1;
			while(y >= 0 && arr[y] > key) {
				arr[y + 1] = arr[y];
				y = y - 1;
			}
			arr[y+1] = key;
		}
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		int[] x = new int[200];
		
		for(int i = 0; i < x.length; i++) {
			x[i] = (int)(Math.random()*201);
		}
		
		insertionSort(x);
		
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
	}
}
