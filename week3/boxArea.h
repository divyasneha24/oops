#include<iostream>
using namespace std;
void boxArea(float length, float width, float height)
{
    float area= (2*(length * width)+(height*length)+(width*height));
    cout<<"area of box is : "<<area<<endl;
}
