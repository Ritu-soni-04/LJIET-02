package circle;
import java.util.*;
public class Circle
{
    double radius;
    double area;
    double circumference;
    final double PI = 3.14;
    
    public void getRadius()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius :- ");
        this.radius = sc.nextDouble();
    }
    
    public void getArea()
    {
        area = PI * radius * radius;
        
    }
    
    public static void main(String[] args) 
    {
        Circle c_obj = new Circle();
        c_obj.getRadius();
        c_obj.getArea();
        System.out.println("Area of radius "+c_obj.radius+" is "+c_obj.area);
    }
    
}
