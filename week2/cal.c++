#include<iostream>
#include<string>
using namespace std;
int main()
{
  cout<<"1.ADDITION, 2.SUBTRACTION, 3.MULTIPLICATION, 4.DIVISION"<<endl;
  int choice;
  cin>>choice;
  cout<<"enter two numbers : "<<endl;
  cout<<"enter choice : "<<endl;
  float a,b;
  cin>>a>>b;
  switch(choice)
{
case 1: cout<<"add of "<<a<<" + "<<b<<" is "<<a+b<<endl;
        break;
case 2: cout<<"sub of "<<a<<" - "<<b<<" is "<<a-b<<endl;
        break;
case 3: cout<<"mul of "<<a<<" * "<<b<<" is "<<a*b<<endl;
        break;
case 4: cout<<"div of "<<a<<" / "<<b<<" is "<<a/b<<endl;
        break;
default:cout<<"enter valid choice"<<endl;
