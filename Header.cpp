#include<iostream>
#include "boxvolume.h"
#include "boxarea.h"
using namespace std;
int main()
{
   float length,width,height;
   cout<<"Enter Length,Width and Height : ";
   cin>>length>>width>>height;
   boxVolume(length,width,height);
   boxArea(length,width,height);
}
  
