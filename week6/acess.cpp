#include<iostream>
using namespace std;
class AccessSpecifierDemo{
private:
int priVar;
protected:
int proVar;
public:
int pubVar;
public:
void setVar(int priValue,int proValue, int pubValue)
{
priVar=priValue;
proVar=proValue;
pubVar=pubValue;
}
void getVar(){
cout<<"Private value: "<<priVar<<endl;
cout<<"Protected value: "<<proVar<<endl;
cout<<"Public value: "<<pubVar<<endl;
}
};
int main()
{
AccessSpecifierDemo obj;
int priVar,proVar,pubVar;
cout<<"Enter private value: "<<endl;
cin>>priVar;
cout<<"Enter protected value: "<<endl;
cin>>proVar;
cout<<"Enter public value: "<<endl;
cin>>pubVar;
obj.setVar(priVar,proVar,pubVar);
obj.getVar();
}
