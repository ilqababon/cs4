#include <iostream>
using namespace std;

int main() {
    long n = 6857;
    for (int i = 3; i <= sqrt(n); i += 2)
    {
        while (n % i == 0)
        {
            cout << i << " ";
            n /= i;
        }
    }
}