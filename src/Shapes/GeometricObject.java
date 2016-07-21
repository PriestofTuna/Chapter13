package Shapes;

/**
 * Created by lytte on 7/20/2016.
 */
public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject(){
        this("Red", true);
        //minorly alerted from original
    }
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    @Override
    public String toString() {
        return (color + " | " + "Is filled? " + filled + " | " + "Date created: " + dateCreated);
    }
    public abstract double getArea() throws Exception;
    public abstract double getPerimeter();
}
