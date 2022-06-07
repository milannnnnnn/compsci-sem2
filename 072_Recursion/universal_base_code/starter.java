import pkg.*;
import java.util.*;

class starter {
	public static void recurPower(int base, int n){
		int temp;
		if(n == 0) {
			return;
		}
		else {
			recurPower(base, n - 1);
			base = (base*base);
			System.out.println(base);
		}
	}	

	public static void main(String args[]) {
		recurPower(4, 4);
	}
}
