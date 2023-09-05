#include <iostream>
#include <iomanip>
#include <math.h>
using namespace std;

int main() {
    int R;
    int C;

    cin >> R >> C;

    double cheesePercent = (pow(R, 2) - pow(R-C, 2))/(pow(R, 2)) * 100;
    cout << fixed << setprecision(6) << 100 - cheesePercent;
}