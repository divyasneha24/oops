#include<iostream>
using namespace std;
class ClassA
{
public:
void aClass()
{
cout<<"ClassA\n";
}
};
class ClassB: public ClassA
{
public:
void bClass()
{
cout<<"ClassB\n";
}
};
class ClassC: public ClassA
{
public:
void cClass()
{
cout<<"ClassC\n";
}
};
class ClassD: public ClassC,public ClassB
{
public:
void dClass()
{
cout<<"ClassD\n";
}
};
int main()
{
ClassD obj1;
//obj1.aClass();
//aClass() method becomes ambiguous here
obj1.bClass();
obj1.cClass();
obj1.dClass();
return 0;
}
