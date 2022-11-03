
public class Rectangle
{
    float x;
    float y;
    
    void displayDimensions() {
        System.out.println("Dimensions: " + x + " x " + y);
    }
    
    void calculateSurfaceArea() {
        float area = x*y;
        System.out.println("Surface area: " + area);
    }
}
