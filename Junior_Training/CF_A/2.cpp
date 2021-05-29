#include<bits/stdc++.h>
using namespace std;

int main()
{
#ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
#endif
    // Code Here
    
        int n, k;
        cin>>n>>k;
        std::vector<int> v;
        for(int i=0; i<n; i++){
            int no;
            cin>>no;
            v.push_back(no);
        }
        sort(v.begin(),v.end());
        int val = v[k-1];
        int count=0;
        for(int i=0; i<n; i++){
            if(v[i]>=val){
                count++;
            }
        }
        cout<<count<<endl;



      return 0;
}