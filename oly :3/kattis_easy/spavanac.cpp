#include <iostream>
using namespace std;

int main() {
    int hour, minute;
    cin >> hour >> minute;

    if (hour > 0) {
        hour -= 1;
        minute += 60;
    }
    if (hour == 0) {
        hour = 23;
        minute += 60;
    }

    minute -= 45;
    if (minute >= 60) {
        minute -= 60;
        if (hour < 23) {
            hour += 1;
        }
        if (hour == 24) {
            hour = 0;
        }
    }
    cout << hour << " " << minute;
}