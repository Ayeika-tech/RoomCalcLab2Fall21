

public class RoomDimension implements Comparable<RoomDimension> {

    private double _length;
    private double _width;

    // Create a contructor
    public RoomDimension(double len, double wid) {
        _length = len;
        _width = wid;
    }

    // Create a copy Constructor
    public RoomDimension(RoomDimension object2) {
        _length = object2._length;
        _width = object2._width;
    }
    public void setLength(double len){
        _length = len;
    }
    public double getLength()
    {
        return _length;
    }

    public void setWidth(double wid){
       _width = wid;
    }
    public double getWidth(){
        return _width;
    }

    // Here we multiply the length and width to get the area of the carpet
    public double getArea() {
        double area = _length * _width;
        return area;
    }
   

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(_length);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(_width);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


    // Create toString method that contains RoomDimension's information
    public String toString() {
        String str = "Length: " + _length 
                + "\nWidth: " + _width;
        return str;
    }

    // Create an equals method to compare objects
    public boolean equals(RoomDimension object2) {
        boolean status;
        if (_length == (object2._length) && _width == (object2._width))
            status = true;
        else
            status = false;
        return status;
    }

    // clone method
    public Object clone() {
        return new RoomDimension(this);
    }

    
    // In order to test the finalize method you need to invoke the garbage collection method
    // System.gc();
    public void finalize() {
        System.out.println("Room Dimension Object has been destroyed");
    }

   // creating a compareTo method to compare the lenghts for both objects
    public int compareTo(RoomDimension ob2) {
        int result = 0;
        if ((_length == ob2._length)  && (_width == ob2._width))
        {result = 0;}
        else if ((_length > ob2._length) && (_width > ob2._width))
        {result = -1;}
        else 
        {result = 1;}

        return result;
    }

}