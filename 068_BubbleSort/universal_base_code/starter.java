import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		bubbleSort(arr1);			//Create this method
		System.out.println();
		System.out.println();
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(new Integer((int)(Math.random()*10)));
		}
	}
	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	
	public static void bubbleSort(ArrayList<Integer> arr) {
		for(int x = 0; x < arr.size()-1; x++) {
			for(int y = 0; y < arr.size()-x-1; y++) {
				if(arr.get(y) > arr.get(y+1)) {
					int temp = arr.get(y);
					arr.set(y, (arr.get(y+1)));
					arr.set(y+1, temp);
				}
			}
		}
	}
}
