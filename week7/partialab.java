abstract class Shape
{
abstract float area();
void display()
{
System.out.println("This is a shape");
}
}
class Rectangle extends Shape
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
}
class Triangle extends Shape
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
}
public class PartialAbstraction
{
public static void main(String[] args)
{
Rectangle obj1=new Rectangle(24,64);
Triangle obj2=new Triangle(30,11);
System.out.println("Area of Rectangle : "+obj1.area());
System.out.println("Area of Triangle : "+obj2.area());
}
}
