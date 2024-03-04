#include<iostream>
using namespace std;
class Cow
{
       public:
              void displayBreed()
             {
                  cout<<"I belong to the Herbivore type.\n";
              }
              void eat()
             {
                  cout<<"I eat grass\n";
              }
 };
class Calf: public Cow
{
        public:
              void nature()
              {
                     cout<<"I play a lot\nIt helps me to bond to my family\n";
              }
               void skills()
               {
                    cout<<"With this I develop lot of skills that I could use later\n";
                }
 };
 int main()
 {
          Calf obj;
          obj.displayBreed();
          obj.eat();
          obj.nature();
          obj.skills();
          return 0;
 }

