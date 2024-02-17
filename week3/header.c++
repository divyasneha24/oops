#include<iostream>
#include"boxVolume.h"
#include"boxArea.h"
using namespace std;
int main()
{
    float length,height,width;
    cout<<"enter length : "<<endl;
    cin>>length;
    cout<<"enter height : "<<endl;
    cin>>height;
    cout<<"enter width : "<<endl;
    cin>>width;
    boxArea(length,height,width);
    boxVolume(length,height,width);

}
