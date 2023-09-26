#include <iostream>
#include <vector>
using namespace std;

int max(long a, long b, long c); 

int main() {
    int length;
    cin >> length;
    string S1, S2, S3;
    cin >> S1 >> S2 >> S3;

    // if all strings are the same
    if (S1[0] == S2[0] && S2[0] == S3[0]) {
        cout << length;
    }
    
    // if strings dont share any elements
    int count1 = 0;
    int count2 = 0;
    for (int i = 0; i < S1.length(); i++) {
        if (S2.find(S1[i]) != -1) {
            count1++;
        }
        if (S3.find(S1[i]) != -1) {
            count2++;
        }
    }
    if (count1 == 0 || count2 == 0) {
        cout << -1;
    }

    int sum = 0;
    vector<int> temp{};

    for (int i = 0; i < 10; i++) {
        int tempSum = 0;
        if (S1.find(to_string(i)) != string::npos && S2.find(to_string(i)) != string::npos && S3.find(to_string(i)) != string::npos){ 
            tempSum += S1.find(to_string(i));
            tempSum += S2.find(to_string(i));
            tempSum += S3.find(to_string(i));
        }
        if (tempSum >= sum) {
            sum = tempSum;
            temp.push_back(i);
        }
    }

    int min = max(S1.find(to_string(temp[0])), S2.find(to_string(temp[0])), S3.find(to_string(temp[0])));
    for (int i = 0; i < temp.size(); i++) {
        int index = temp[i];
        int tempMax = max(S1.find(to_string(temp[i])), S2.find(to_string(temp[i])), S3.find(to_string(temp[i])));
        if (tempMax < min) {
            min = tempMax;
        }
    }

    cout << min;
}

int max(long a, long b, long c) {
    if (a >= b && a >= c) {
        return a;
    }
    else if (b >= a && b >= c) {
        return b;
    }
    else {
        return c;
    }
}