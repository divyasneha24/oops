#include<iostream>
#include<string>
using namespace std;
int main()
{
  cout<<"1.ADDITION, 2.SUBTRACTION, 3.MULTIPLICATION, 4.DIVISION"<<endl;
  int choice;
  cin>>choice;
  cout<<"enter two numbers : "<<endl;
  float a,b;
  cin>>a>>b;
  switch(choice)
{
case 1: cout<<"addition of "<<a<<" + "<<b<<" is "<<a+b<<endl;
        break;
case 2: cout<<"subtraction of "<<a<<" - "<<b<<" is "<<a-b<<endl;
        break;
case 3: cout<<"multiplication of "<<a<<" * "<<b<<" is "<<a*b<<endl;
        break;
case 4: cout<<"division of "<<a<<" / "<<b<<" is "<<a/b<<endl;
        break;
default:cout<<"enter valid choice"<<endl;
}
}
