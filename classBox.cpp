#include<iostream>
using namespace std;
class Box{
    public:
    int n;
    float l,w,h;
    void boxArea(float length, float width) 
    {
        l=length;
        w=width;
        cout<<"Box Area "<<l*w<<endl;
    }
    void boxVolume(float length, float width, float height);

    friend void displayBoxDimensions(Box);
    inline void displayMessage() {
        cout<<"This is inline method"<<endl;
    }
};

void displayBoxDimensions(Box b){
    cout<<"Length : "<<b.l<<endl;
    cout<<"Width : "<<b.w<<endl;
    cout<<"Height : "<<b.h<<endl;
}

void Box::boxVolume(float length, float width, float height)
{
    l=length;
    w=width;
    h=height;
    cout<<"Box volume is "<<l*w*h<<endl;
}
int main(){
    Box obj;
    cout<<"Enter Length, Width and Height of box"<<endl;
    cin>>obj.l>>obj.w>>obj.h;
    obj.boxArea(obj.l,obj.w);
    obj.boxVolume(obj.l,obj.w,obj.h);
    displayBoxDimensions(obj);
    obj.displayMessage();
    return 0;
}
