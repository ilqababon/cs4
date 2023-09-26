#include <iostream>
using namespace std;

int main() {
    string jon, doctor;
    cin >> jon >> doctor;

    if (jon.size() >= doctor.size()) {
        cout << "go";
    }
    else {
        cout << "no";
    }
}