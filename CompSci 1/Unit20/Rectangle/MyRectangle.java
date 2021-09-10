package Unit20;


public class MyRectangle {
    private int length, width;
    
    MyRectangle(int l, int w) {
        length = l;
        width = w;
    }
    
    public void setLength(int l) {
        length = l;
    }
    public void setWidth(int w) {
        width = w;
    }
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public int getPerimeter() {
        return ((width * 2) + (length * 2));
    }
    public int getArea() {
        return (width * length);
    }
    
    public String toStr() {
        return("Length: " + length 
                + "\nWidth: " + width 
                + "\nPerimeter: " + getPerimeter()
                + "\nArea: " + getArea());
    }
}
