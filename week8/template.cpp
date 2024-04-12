#include<iostream>
using namespace std;
//template function
template <typename Digit> Digit add(Digit a,Digit b)
{
return a+b;
}
//template class
template <typename TempData>
class Report
{
TempData value;
public:
Report(TempData a)
{
value=a;
}
void displayValue()
{
cout<<"The value is "<<value<<endl;
}
};
int main()
{
int intResult=add(2,4);
float floatResult=add(3.0,1.1);
cout<<"The sum of the values : "<<intResult<<endl;
cout<<"The sum of the values : "<<floatResult<<endl;
Report <int>obj1(2);
Report <double>obj2(8.34535353);
obj1.displayValue();
obj2.displayValue();
return 0;
}
