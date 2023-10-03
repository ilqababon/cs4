#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int n;
    cin >> n;
    if (n < 3) {
        cout << "-1";
    }
    else if (n == 3) {
        cout << "210";
    }
    else {
        unsigned long long temp = pow(10, n-1);
        unsigned long long temp2 = 210 - (temp % 210);
        string output = to_string(temp2);
        output.insert(0, n - 1 - to_string(temp2).length(), '0');
        cout << "1" << output;
    }
}