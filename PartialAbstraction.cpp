#include<iostream>
using namespace std;
class Student{
public:
virtual void type()=0;
};
class FrontBench : public Student{
public:
    void type()
    {
        cout<<"Sai - I am a frontbench Student"<<endl;
    }
};
class BackBench : public Student{
public:
    void type()
    {
        cout<<"Bhaskar - I am a backbench Student"<<endl;
    }
};

int main()
{
    FrontBench sai;
    sai.type();
    BackBench bhaskar;
    bhaskar.type();
}
    



