
public class CarpetCalculator {
    public static void main(String[] args) {
      final double CARPET_COST = 2.99;

        // creating 3 different RoomDimension objects
        var roomDim = new RoomDimension(12.5, 24.3);
        var roomDim2 = new RoomDimension(13, 19);
        var roomDim3 = new RoomDimension(7.8, 4.2);
        
        // create a room carpet object to test
        RoomCarpet rc = new RoomCarpet(roomDim, CARPET_COST);
        System.out.println(rc.getTotalCost());
        
        
    }
}
