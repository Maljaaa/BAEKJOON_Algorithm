#include<iostream>
#include<algorithm>
using namespace std;

int num[100001];

void binarySearch(int n, int b, int arr[]){
    int low = 0;
    int high = n - 1;
    int mid;
    
    while(low <= high){
        mid = (low + high) / 2;
        
        if(num[mid] == b){
            cout << "1" << "\n";
            return;
        }
        else if(num[mid] < b){
            low = mid + 1;
        }
        else if(num[mid] > b){
            high = mid - 1;
        }
    }
    cout << "0" << "\n";
    return;
}

int main(){
    int n, m;
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    
    cin >> n;
    for(int i = 0; i < n; i++){
        int a;
        cin >> a;
        num[i] = a;
    }
    
    sort(num, num + n);
    
    cin >> m;
    for(int i = 0; i < m; i++){
        int b;
        cin >> b;
        binarySearch(n, b, num);
    }
    return 0;
}
