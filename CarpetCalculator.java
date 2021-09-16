import java.util.ArrayList;

public class CarpetCalculator {
    public static void main(String[] args) {
      double [] carpCost = {2.99,1.49,3.25};
      
      //Create 3 roomDim obj to use on the RoomCarpet objects
      RoomDimension rdObj = new RoomDimension(14, 10);
      RoomDimension rdObj1 = new RoomDimension(7.6, 10.2);
      RoomDimension rdObj2 = new RoomDimension(22, 35);
      //add to list to use on the loop to call the getArea method
      ArrayList<RoomDimension> roomdim = new ArrayList<RoomDimension>();
      roomdim.add(rdObj);
      roomdim.add(rdObj1);
      roomdim.add(rdObj2);
      // creating 3 different RoomCarpet
      RoomCarpet rc = new  RoomCarpet(rdObj, carpCost[0]);
      RoomCarpet rc1 = new RoomCarpet(rdObj1, carpCost[1]);
      RoomCarpet rc2 = new RoomCarpet(rdObj2, carpCost[2]);
      
      //create an ArrayList of RoomCArpet
      ArrayList<RoomCarpet> roomCarpet = new ArrayList<RoomCarpet>();
      //add the elements tot he roomCArpet ArrayList
      roomCarpet.add(0, rc);
      roomCarpet.add(1, rc1);
      roomCarpet.add(2, rc2);

      //testing all methods for RoomCarpet class
      for (int i = 0; i < roomCarpet.size(); i++) {
        System.out.println("*******Testing element #"+i+"******" );
        System.out.println("Testing toString: \n" +roomCarpet.get(i).toString());
        System.out.println("Testing equal: " + roomCarpet.get(i).equals(rc2));
        System.out.println("Testing compareTo: "+ roomCarpet.get(i).compareTo(rc2));
        System.out.println("Testing clone:\n "+ roomCarpet.get(i).clone());
        System.out.println("Testing Hashcode: "+ roomCarpet.get(i).hashCode());
        System.out.println("Testing getArea from RoomDimension: "+ roomdim.get(i).getArea());
        System.out.println("Testing getTotalCost from RoomCarpet: "+ String.format("%.2f",roomCarpet.get(i).getTotalCost()));
        
        
      }
      
    }
    
}
