#include<bits/stdc++.h>
using namespace std;

#define  ff                      first
#define  ss                      second
#define  ll                      long long int
#define  pb                      push_back
#define  mp                      make_pair
#define  up                      upper_bound
#define  lb                      lower_bound
#define  to_upper(su)            transform(su.begin(), su.end(), su.begin(), ::toupper);
#define  to_lower(sl)            transform(sl.begin(), sl.end(), sl.begin(), ::tolower);
// data structures
#define  vi                      vector<int>
#define  si                      set<int>
#define  mii                     map<int,int>
#define  pii                     pair<int,int>
#define  pqmax                   priority_queue<int>
#define  pqmin                   priority_queue<int,vi,greater<int> >
// algorithem
#define  all(v)                  v.begin(), v.end()
#define  sortf(v)                sort(v.begin(), v.end())
#define  sortb(v)                sort(v.begin(), v.end(), greater<int>())
#define  findf(v,val)            find (v.begin(), v.end(), val)
// bit manupulation
#define  iseven(n)               !(n&1)
#define  getBit(S,j)             ((S & (1 << j)) > 0 ? 1:0)
#define  setBit(S,j)             (S | (1 << j))
#define  clearBit(S,j)           (S & ~(1 << j))
#define  updateBit(S,j,v)        ((S & ~(1 << j))|(v<<j))
#define  clearLastBits(S,j)      (S & (-1<<j))
#define  clearrangebits(S,i,j)   (S & (((~0)<<(j+1)) | ((1<<i)-1)))
#define  toggleBit(S,j)          (S ^= (1 << j))
#define  lowBit(S)               (S & (-S))
#define  setAll(S,n)             (S = (1 << n) - 1)
#define  isPowerOfTwo(S)         (!(S & (S - 1)))
// miscellaneous
#define  fori(i, s, n)           for(int (i) = (s); (i) <= (n); (i++))
#define  ctsetbit(x)             __builtin_popcountll(x)
#define  ctzerobit(x)             __builtin_ctzll(x)
#define  mod                     1000000007
#define  inf                     1e18
#define  ps(x,y)                 fixed<<setprecision(y)<<x
#define  mk(arr,n,type)          type *arr=new type[n];
#define  w(x)                    int x; cin>>x; while(x--)
#define  IOF                     ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0)
 
#define TRACE
#ifdef TRACE
#define trace(...) __f(#__VA_ARGS__, __VA_ARGS__)
template <typename Arg1>
void __f(const char* name, Arg1&& arg1) {
   cout << name << " : " << arg1 << endl;
   //use cerr if u want to display at the bottom
}
template <typename Arg1, typename... Args>
void __f(const char* names, Arg1&& arg1, Args&&... args) {
    const char* comma = strchr(names + 1, ','); cout.write(names, comma - names) << " : " << arg1 << " | "; __f(comma + 1, args...);
}
#else
#define trace(...)
#endif
 
int32_t main()
{
    IOF;
    long long int n,m,i,c=0;
    cin>>n>>m;
    for(i=1;i<n+1;i++)
        c=c+(i+m)/5 - (i/5);
    cout<<c;
        
    return 0;
}