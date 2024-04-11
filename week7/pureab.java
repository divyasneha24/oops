interface Shape
{
float area();
void dimensions();
}
class Rectangle implements Shape
{
float b,h;
Rectangle(float base,float height)
{
b=base;
h=height;
}
public float area()
{
return b*h;
}
public void dimensions()
{
System.out.println("Dimensions : "+b+" X "+h);
}
}
class Triangle implements Shape
{
float b,h;
Triangle(float base,float height)
{
b=base;
h=height;
}
public float area()
{
return (float)0.50*b*h;
}
public void dimensions()
{
System.out.println("Dimensions : "+b+" X "+h);
}
}
public class PureAbstraction
{
public static void main(String[] args)
{
Rectangle obj1=new Rectangle(24,64);
Triangle obj2=new Triangle(30,11);
System.out.println("Area of Rectangle : "+obj1.area());obj1.dimensions();
System.out.println("Area of Triangle : "+obj2.area());obj2.dimensions();
}
}
