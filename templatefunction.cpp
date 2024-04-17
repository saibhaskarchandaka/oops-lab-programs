#include <iostream>
using namespace std;
template <typename T>
T calculate(T a, T b, T op) {
    switch (op) {
        case 1:
            return a + b;
        case 2:
            return a - b;
        case 3:
            return a * b;
        case 4:
            if (b != 0)
                return a / b;
            else {
                cout << "Error: Division by zero!\n";
                return 0;
            }
        default:
            cout<< "Error: Invalid operator!\n";
            return 0;
    }
}

int main() {
    
    double num1, num2,op;

    cout << "Enter first number: ";
    cin >> num1;

    cout << "Enter second number: ";
    cin >> num2;
    
    cout << "Enter operator \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division : ";
    cin >> op;

    double result = calculate(num1, num2, op);
    cout << "Result: " << result << endl;

    return 0;
}
