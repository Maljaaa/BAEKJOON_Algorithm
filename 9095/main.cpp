#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;

int n;
int dp[11];

int solution(int n){
    // 점화식에 필요한 최소한의 사례 제시
    dp[1] = 1;
    dp[2] = 2;
    dp[3] = 4;
    
    for(int i = 4; i <= n; i++)
        dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
    return dp[n];
}

int main(){
    int test_case;
    cin >> test_case;
    vector<int> a;
    for(int i = 0; i < test_case; i++){
        cin >> n;
        dp[n] = solution(n);
        a.push_back(dp[n]);
    }
    for(int i = 0; i < a.size(); i++)
        cout << a[i] << endl;
    a.clear();
    
    return 0;
}
