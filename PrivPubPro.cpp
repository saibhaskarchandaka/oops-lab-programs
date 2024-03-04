#include<iostream>
using namespace std;
class SimpleInheritance{
            public:
                int i=1;
            protected:
                int j=2;
            private:
                int z=3;
        public:
              int getz()
             {
                  return z;
              }
   };
class subclass1 : public SimpleInheritance
 {
        public:
            int var1=j;
            int var2=getz();
   };
class subclass2: private SimpleInheritance
  {
        public:
             int var1=i;
             int var2=j;
             int var3=getz();
   };
class subclass3: protected SimpleInheritance
{
        public:
             int var1=i;
             int var2=j;
             int var3=getz();
};

int main()
{
           cout<<"public inheritance"<<endl;
           subclass1 obj;
           cout<<"public variable :"<<obj.i<<endl;
           cout<<"private variable :"<<obj.var1<<endl;
           cout<<"protected variable :"<<obj.var2<<endl<<"\n";
           cout<<"private inheritance"<<endl;
           subclass2 obj1;
           cout<<"public variable :"<<obj1.var1<<endl;
           cout<<"private variable :"<<obj1.var2<<endl;
           cout<<"protected variable :"<<obj1.var3<<endl<<"\n";
           cout<<"protected inheritance"<<endl;
           subclass3 obj2;
           cout<<"public variable :"<<obj2.var1<<endl;
           cout<<"private variable :"<<obj2.var2<<endl;
           cout<<"protected variable :"<<obj2.var3<<endl;
}
