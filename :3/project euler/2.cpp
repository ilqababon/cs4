#include <iostream>
using namespace std;

int main() {
    long long i1 = 1;
    long long i2 = 1;
    long long i3 = 2;
    long long sum = 0;
    while (i3 < 4000000) {
        if (i3 % 2 == 0) {
            sum += i3;
        }
        long long temp = i3;
        i3 += i2;
        i2 = temp;
    }
    cout << sum;
}