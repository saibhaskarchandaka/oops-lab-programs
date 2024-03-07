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
{
    AccessSpecifierDemo obj;
    obj.setVar(10,20,30);
    obj.getvar();

}
