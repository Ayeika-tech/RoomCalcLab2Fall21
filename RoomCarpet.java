
public class RoomCarpet implements Comparable<RoomCarpet> {

  private RoomDimension roomDimObj;
  private double carpetCostSqft;

  // Constructor
  public RoomCarpet(RoomDimension sizeRoom, double carpetCost) {
    roomDimObj = sizeRoom;
    carpetCostSqft = carpetCost;

  }

  // Copy Constructor
  public RoomCarpet(RoomCarpet object) {
    roomDimObj = object.roomDimObj;
    carpetCostSqft = object.carpetCostSqft;

  }

  // get total cost by multiplying lenght x width x costpersqft
  public double getTotalCost() {
    double totalCost = roomDimObj.getArea() * carpetCostSqft;
    return totalCost;
  }

  // Create an equals method to compare objects, use '==' for primative values.
  public boolean equals(RoomCarpet object2) {
    boolean status;
    if (roomDimObj.equals(object2.roomDimObj) && carpetCostSqft == (object2.carpetCostSqft))
      status = true;
    else
      status = false;
    return status;
  }

  // clone method
  public Object clone() {
    return new RoomCarpet(this);
  }

  // In order to test the finalize method you need to invoke the garbage
  // collection method
  // System.gc();
  public void finalize() {
    System.out.println("Room Carpet Object has been destroyed");
  }

  // toString method to display object's data
  public String toString() {
    String str = "Carpet Surface Area: " + roomDimObj.getArea()+" ft"
               +"\nCost per Sqft: $" + carpetCostSqft;

    return str;
  }
  // compareTo method to compare objects.

  public int compareTo(RoomCarpet object2) {

    int result = 0;

    if (carpetCostSqft == object2.carpetCostSqft)
      result = 0;
    else if (carpetCostSqft > object2.carpetCostSqft)
      result = -1;
    else
      result = 1;

    return result;
  }

}