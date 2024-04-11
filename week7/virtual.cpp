#include<iostream>
using namespace std;
class Shape
{
private:
virtual float area()=0;
};
class Triangle: public Shape
{
public:
float b,h;
Triangle(float base,float height)
{
b=base;
h=height;
}
float area()
{
return 0.5*b*h;
}
};
class Circle: public Shape
{
public:
float r;
Circle(float radius)
{
r=radius;
}
float area()
{
return 3.14*r*r;
}
};
int main()
{
Triangle obj1(2,4);
Circle obj2(3.0);
cout<<"Area of Triangle : "<<obj1.area()<<endl;
cout<<"Area of Circle: "<<obj2.area()<<endl;
return 0;
}
