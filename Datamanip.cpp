#include<iostream>
#include <iomanip>
using namespace std;
int main()
{
    int number = 32;
    double pi = 3.14159265358979323846;
    cout<< setw(8)<<setfill('*')<<number<< endl;
    cout<<setprecision(5)<<pi<<endl;
    cout<<"Hello"<<endl<<"World"<<endl;
    cout << "Object Oriented" << ends << " Programming" <<endl;
    cout << "Enter two words: ";
    string a,b;
    cin >>ws >> a >>ws >> b;
    cout << "You entered: " << a << " and " <<b <<endl;
    cout << "This will be flushed immediately" <<flush;
    return 0;
}
