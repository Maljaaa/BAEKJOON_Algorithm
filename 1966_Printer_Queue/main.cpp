#include<iostream>
#include<queue>

using namespace std;

int main(){
    // 속도 줄이기
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    
    int test_case;
    cin >> test_case;   // 테스트 케이스
    for(int i = 0; i < test_case; i++){
        int n, m;
        cin >> n >> m;  // 문서 개수, 궁금한 문서 인덱스
        
        queue<pair<int, int>> q;
        priority_queue<int> pq;     // 우선순위 큐 이용
        for(int j = 0; j < n; j++){
            int imp;    // 중요도
            cin >> imp;
            q.push({j, imp});   // 중요도 순서대로 큐에 넣기
            pq.push(imp);   // 중요도 우선순위큐에 넣기
        }
        
        int count = 0;
        while(!q.empty()){  // 큐가 비어있을 때까지
            int index = q.front().first;    // 문서인덱스
            int value = q.front().second;   // 중요도 인덱스
            // 한정된 메모리의 큐에 맨뒤로 푸시하기 위해서 먼저 pop()을 해줌
            // 만약 pop()을 else에 넣어준다면 그다음 index, value값을 넣어주기 때문에 논리적인 오류가 생김
            q.pop();
            if(pq.top() == value){
                pq.pop();
                ++count;    // if문 안에 if문을 출력하기 위해
                // 찾는 값이 index차례가 되면 카운트 표현
                if(index == m){
                    cout << count << '\n';
                    break;
                }
            }
            else
                q.push({index, value});     // 아니면 맨뒤로 보냄
        }
    }
    return 0;
}
