#include<iostream>
#include<string>
using namespace std;
int check(int n)
{
    if(n%2==0){
        cout<<n<< "is even"<<endl;
    }
    else
    cout<<n<< "is odd"<<endl;
    return 0;
}
int main(){
int n;
cout<<"enter a number : "<<endl;
cin>>n;
check(n);
}
