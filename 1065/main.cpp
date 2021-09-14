#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;

bool solution(int n){
    if(n < 100)
        return true;
    int a, b, c;
    a = n / 100;
    b = n % 100 / 10;
    c = n % 10;
    
    if(b - a == c - b)
        return true;
    
    return false;
}

int main(){
    int n, count = 0;
    cin >> n;
    for(int i = 1; i <= n; i++){
        if(solution(i))
            count++;
    }
    cout << count;
}
