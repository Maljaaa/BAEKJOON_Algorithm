#include<iostream>
#include<algorithm>
using namespace std;

int main(){
    int x, y , w, h;
    int Min;
    
    cin >> x >> y >> w >> h;
    
    Min = min({x, y, w - x, h - y});
    cout << Min;
    return 0;
}
