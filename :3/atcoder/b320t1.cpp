#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int A, B;
    cin >> A >> B;
    int output = pow(A, B) + pow(B, A);
    cout << fixed << output;
}