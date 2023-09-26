#include <iostream>
#include <math.h>
#include <map>
using namespace std;

int main() {
    int n;
    cin >> n;
    
    map<string, string> nounMap;

    for (int i = 0; i < n; i++) {
        string noun_temp, type_temp;
        cin >> noun_temp >> type_temp;
        nounMap.insert({ noun_temp, type_temp });
    }
}