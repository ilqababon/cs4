#include <iostream>
using namespace std;

int main() {
    int fizz, buzz, N;
    cin >> fizz >> buzz >> N;

    for (int i = 1; i < N+1; i++) {
        if (i % fizz == 0) {
            cout << "Fizz";
        }
        if (i % buzz == 0) {
            cout << "Buzz";
        }
        if (i % fizz != 0 && i % buzz != 0) {
            cout << i;
        }
        cout << endl;
    }
}