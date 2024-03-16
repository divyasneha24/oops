#include<iostream>
using namespace std;
class Opoverload{
   public:
   int add(int x,int y){
   return x+y;
   }
   float add(float x,float y,float z){
       return x+y+z;
   }  
};
int main(){
   Opoverload addition;
   cout<<addition.add(1,2)<<endl;
   cout<<addition.add(2,3,4)<<endl;
   return 0;
}
