#include <iostream>
using namespace std;

int main() {
    int articles;
    int impact;

    cin >> articles >> impact;

    cout << (articles * (impact - 1) + 1);
}