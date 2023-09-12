#include <iostream>
using namespace std;

int main() {
    int N, M, P;
    cin >> N >> M >>P;
    if (M <= N) {
        cout << ((N-M)/P)+1;
    }
    else {
        cout << 0;
    }
}