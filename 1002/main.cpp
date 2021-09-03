#include<iostream>
#include<algorithm>
#include<vector>
#include<math.h>
using namespace std;

void solution(vector<int>& count){
    int x1, y1, r1, x2, y2, r2;
    double d;
    cin >> x1 >> y1 >> r1 >> x2 >> y2 >> r2;
    d = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    if(d > (r2 - r1) && d < (r1 + r2))
        count.push_back(2);
    else if(d == (r2 - r1) || d == (r1 + r2))
        count.push_back(1);
    else if(d < (r2 - r1) || d > (r1 + r2))
        count.push_back(0);
}

int main(){
    int T;
    cin >> T;
    
    vector<int> count;
    
    for(int i = 0; i < T; i++){
        solution(count);
    }
    for(int i = 0; i < count.size(); i++){
        cout << count[i] << endl;
    }
    count.clear();
    return 0;
}
