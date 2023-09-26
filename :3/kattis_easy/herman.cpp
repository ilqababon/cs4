#include <iostream>
#include <iomanip>
#include <math.h>
using namespace std;

int main() {

    double R;
    cin >> R;

    double euclid = M_PI * pow(R, 2);
    double herman = pow(R, 2) * 2; 

    cout << fixed << setprecision(6) << euclid << endl << herman;
}