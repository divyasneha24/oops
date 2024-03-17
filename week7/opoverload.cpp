#include<iostream>
using namespace std;
class OpOverload{
    public:
    int real;
    int img;
    OpOverload(int real=0,int img=0){
        this->real=real;
        this->img=img;
    }
OpOverload operator+(OpOverload obj){
    OpOverload tempObj;
    tempObj.real=real+obj.real;
    tempObj.img=img+obj.img;
    return tempObj;
}
};
int main()
{
    OpOverload Op1(3,2),Op2(2,4);
    OpOverload result(0,0);
    result=Op1+Op2;
    cout<<"result : "<<result.real<<"+"<<result.img<<"i"<<endl;
}
