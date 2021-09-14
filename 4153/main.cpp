#include<iostream>
#include<algorithm>
#include<vector>
#include<string>
#include<math.h>
using namespace std;

int main(){
    int a, b, c;
    
    vector<string> msg;
    
    while(true){
        cin >> a >> b >> c;
        int C = max({a, b, c});
        int A, B;
        if(a == C){
            A = b;
            B = c;
        }
        else if(b == C){
            A = a;
            B = c;
        }
        else if(c == C){
            A = a;
            B = b;
        }
        
        if(a == 0 && b == 0 && c == 0)
            break;
        else if(pow(C, 2) == pow(A, 2) + pow(B, 2)){
            msg.push_back("right");
        }
        else
            msg.push_back("wrong");
    }
    
    for(int i = 0; i < msg.size(); i++)
        cout << msg[i] << endl;
    
    msg.clear();
    return 0;
}
