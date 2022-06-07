import java.util.*;

class starter {
	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(new Integer((int)(Math.random()*101)));
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
	
	public static void selectionSort(ArrayList<Integer> arr) {
		int x, y, key;
		for(x = 0; x < arr.size(); x++) {
			key = x;
			for(y = x+1; y < arr.size(); y++) {
				if(arr.get(y) < arr.get(key)) {
					key = y;
				}
			}
			int temp = arr.get(x);
			arr.set(x, arr.get(key));
			arr.set(key, temp);
		}
	}
	
	public static void insertionSort(ArrayList<Integer> arr) {
		int x, y, key;
		for(x = 1; x < arr.size(); x++) {
			key = arr.get(x);
			y = x-1;
			while(y >= 0 && arr.get(y) > key) {
				arr.set(y+1, arr.get(y));
				y = y - 1;
			}
			arr.set(y+1, key);
		}
	}
	public static void main(String args[]) {
		ArrayList<Integer> bubbleArr = new ArrayList<Integer>();
		ArrayList<Integer> selecArr = new ArrayList<Integer>();
		ArrayList<Integer> insertArr = new ArrayList<Integer>();
		//
		addValuesInt(bubbleArr, 100);
		for(int i = 0; i < bubbleArr.size(); i++) {
			selecArr.add(bubbleArr.get(i));
			insertArr.add(bubbleArr.get(i));
		}
		//
		System.out.println("         Original Array\n_________________________________");
		
		printValuesInt(bubbleArr);
		System.out.println("\n__________________________________");
		
		System.out.println("         Bubble Sorted\n__________________________________");
		
		bubbleSort(bubbleArr);
		printValuesInt(bubbleArr);
		System.out.println("\n__________________________________");
		
		System.out.println("        Selection Sorted\n__________________________________");
		
		selectionSort(selecArr);
		printValuesInt(selecArr);
		System.out.println("\n__________________________________");
		
		System.out.println("        Insertion Sorted\n__________________________________");
		
		insertionSort(insertArr);
		printValuesInt(insertArr);
		System.out.println("\n__________________________________");
	}
}
