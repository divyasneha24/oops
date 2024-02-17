#include<iostream>
#ifndef pi
#define pi 3.14
#endif
#include"cricle.h"
using namespace std;
int main()
{
    float radius;
    cout<<"enter radius : "<<endl;
    cin>>radius;
    circleArea(float radius);
}
