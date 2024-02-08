#include<iostream>
using namespace std;
int main()
{
    float a,b;
    int choice;
    cout<<"Enter two numbers : ";
    cin>>a,cin>>b;
    cout<<" 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n ";
    cout<<"Enter your choice: ";
    cin>>choice;
    switch(choice)
    {
        case 1: cout<<" Addition of "<<a<<" and "<<b<<" is "<<(a+b)<<endl;
                break;
        case 2: cout<<" Subtraction of "<<a<<" and "<<b<<" is "<<(a-b)<<endl;
                break;
        case 3: cout<<" Multiplication of "<<a<<" and "<<b<<" is "<<(a*b)<<endl;
                break;
        case 4: cout<<" Division of "<<a<<" and "<<b<<" is "<<(a/b)<<endl;
                break;
        deafult: cout<<"Invalid choice";

         
    }    

}
