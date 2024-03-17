#include <iostream>
#include <string>
using namespace std;

class Mvgr {
public:
    void display() {
        cout << "I am the student of Mvgr College" << endl;
        cout << "College Code: 33" << endl;
    }
};

class Student : public Mvgr {
public:
    void display(string name, int no) {
        cout << "I am " << name << endl;
        cout << "My RollNumber: " << no << endl;
    }
};

int main() {
    string name;
    int no;

    cout << "Enter your name: ";
    getline(cin, name);
    cout << "Enter your roll number: ";
    cin >> no;

    Student obj1;
    obj1.display(name, no);
    
    Mvgr obj2;
    obj2.display();

    return 0;
}
