#include <iostream>
using namespace std;

class Add
{       
    public :
    
    void Addition(int a,int b)
    {
        cout<<"Addition of two numbers: "<<(a+b)<<endl;
    }

    void Addition(int a,int b,int c)
    {
       cout<<"Addition of three numbers: "<<(a+b+c)<<endl;
    }
    void Addition(int a,int b,int c,int d)
    {
        cout<<"Addition of four numbers: "<<(a+b+c+d)<<endl;
    }
};




int main() {
    int a,b,c,d;
    Add obj;
    cout<<"Enter four integers: ";
    cin>>a>>b>>c>>d;
    obj.Addition(a,b);
    obj.Addition(a,b,c);
    obj.Addition(a,b,c,d);

}
