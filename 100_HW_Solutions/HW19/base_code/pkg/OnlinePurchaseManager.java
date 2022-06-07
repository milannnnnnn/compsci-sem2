package pkg;
import java.util.ArrayList;

public class OnlinePurchaseManager {
   
   private ArrayList<Gizmo> purchases;
   
   public OnlinePurchaseManager() {
      
   }
   
   public void add(String maker, boolean isE, double cost) {
      purchases.add(new Gizmo(maker, isE, cost));
   }
   
   public int countElectronicsByMaker(String maker) {
      int counter = 0;
      for(int i = 0; i < purchases.size(); i++) {
         if(purchases.get(i).getMaker() == maker) {
            counter++;
         }
      }
      return counter;
   }
   
   public Gizmo getCheapestGizmoByMaker(String maker) {
      Double cheapest = Double.MAX_VALUE;
      int arrIndex;
      //
   	for(int i = 0; i < purchases.size(); i++) {
   	   if(purchases.get(i).getMaker() == maker) {
   	     if(cheapest > new Double(purchases.get(i).getCost()));
   	      cheapest = new Double(purchases.get(i).getCost());
   	      arrIndex = i;
   	   }
   	}
   	return purchases.get(arrIndex);
   }
   
   public boolean hasAdjacentEqualPair() {
      boolean temp = false;
      for(int i = 0; i < purchases.size()-1; i++) {
         if(purchases.get(i).equals(purchases.get(i+1))) {
            temp = true;
         }
      }
      return temp;
   }
   
   public String toString()
   {
   	return "" + purchases;
   }

}