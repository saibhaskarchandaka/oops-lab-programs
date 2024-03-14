#include<iostream>
using namespace std;
class OperatorOverloading
{   public:
    float real,imaginary;
    OperatorOverloading(float r=0,float i=0)
    {
        real=r;
         imaginary=i;
    }
    OperatorOverloading operator-(OperatorOverloading obj)
    {
            OperatorOverloading temp;
            temp.real=real-obj.real;
            temp.imaginary=imaginary-obj.imaginary;
            return temp;
    }

    
};
int main()
{
    float x,y;
    cout<<"Enter values of first complex number: "<<endl;
    cin>>x>>y;
    OperatorOverloading obj1(x,y);
    cout<<"Enter values of second complex number: "<<endl;
    cin>>x>>y;
    OperatorOverloading obj2(x,y);
    OperatorOverloading obj3 = obj1-obj2;
    cout<<obj3.real<<"+"<<obj3.imaginary<<"i"<<endl;


}
