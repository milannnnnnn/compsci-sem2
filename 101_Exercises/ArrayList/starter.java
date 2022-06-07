import java.util.*;

class starter {
	//
	public static void printArrayList(ArrayList <Integer> x) {
		for(int i = 0; i < x.size(); i++) {
			System.out.println(x.get(i));
		}
	}
	
	public static void addValuesArrayList(int x, ArrayList <Integer> y) {
		Random rand = new Random();
		for(int i = 0; i < x; i++) {
			y.add(i, rand.nextInt(101));
		}
	}


	public static void main(String args[]) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		//
		ArrayList <Integer> arr = new ArrayList<Integer>();
		System.out.print("How many values do you want to add? :: ");
		int userVal = sc.nextInt();
		addValuesArrayList(userVal, arr);
		printArrayList(arr);
		
	}
}
