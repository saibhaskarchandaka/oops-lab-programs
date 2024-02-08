#include<iostream>
using namespace std;
int evenodd(int n)
{
    if(n%2==0)
    {
        cout<<n<<" is even "<<endl;
    }
    else
    {
        cout<<n<<" is odd "<<endl;
    }
    return 0;
}
int main()
{
    int n;
    cout<<"Enter a positive number  :";
    cin>>n;
    if(n>=0)
    {
        evenodd(n);
    }
    else{
        cout<<"Enter valid input ";
    }
    

}