#include<iostream>
using namespace std;
class AccessSpecifierDemo
{
    private:
         int priVar;
    protected:
         int proVar;
    public :
         int pubVar;
    void setVar(int priValue,int proValue, int pubValue)
    {
        priVar=priValue;
        proVar=proValue;
        pubVar=pubValue;
    }
    void getvar()
    {
        cout<<"Private Variable: "<<priVar<<endl;
        cout<<"Protected Variable: "<<proVar<<endl;
        cout<<"Pubic Variable: "<<pubVar<<endl;
    }
};
int main()
{   int priValue;int proValue;int pubValue;
    AccessSpecifierDemo obj;
    cout<<"Enter the private variable:"<<endl;
    cin>>priValue;
    cout<<"Enter the Protected variable:"<<endl;
    cin>>proValue;
    cout<<"Enter the Public variable:"<<endl;
    cin>>pubValue;
    obj.setVar(priValue,proValue,pubValue);
    obj.getvar();

}
