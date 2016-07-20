package Shapes;

/**
 * Created by lytte on 7/20/2016.
 */
public class FillableTriangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public FillableTriangle(double side1, double side2, double side3 ) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public FillableTriangle() {
     this(1,2,1);

    }

    public double getArea() {
        double hPerim = getPerimeter()/2;
        double area = Math.sqrt((hPerim * (hPerim - side1)) * ((hPerim - side2) * (hPerim - side3)));
        //the above is Heron's formula
        return area;
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    @Override
    public String toString() {
        return ("Area | " + getArea() + "\n" +
        "Perimeter | " + getPerimeter() + "\n" +
        "Filled? | " + isFilled() + "\n" +
        "Color | " + getColor());
    //will isFilled work? Probably
    }
}
