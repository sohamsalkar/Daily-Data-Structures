#include<bits/stdc++.h>
#include <algorithm>
using namespace std;
int findWeakestFamily(vector<pair<int, int>> k)
{
  vector<set<int>> allFamilies; // [(1 2 3) (4 5)] || 
  bool found;
  for(auto i : k) 
  {
    if(allFamilies.empty())
    {
     set<int> temp;
     temp.insert(i.first);
     temp.insert(i.second);
     allFamilies.push_back(temp); 
    }
    else
    {
      found = false;
      for(auto& j: allFamilies)
      {
        auto it1 = find( j.begin(), j.end(), i.first );
        auto it2 = find( j.begin(), j.end(), i.second );
        //cout << *it1 << endl;
        if( it1 != j.end() || it2 != j.end() )
        {
          j.insert(i.first);
          j.insert(i.second);
          found = true;
          break;
        }
      }
      if(!found)
      {
        set<int> temp;
        temp.insert(i.first);
        temp.insert(i.second);
        allFamilies.push_back(temp);
      }
    }
  }
  int min_size = INT_MAX;
  int c=0;
  int fc= 0;
  for(auto i : allFamilies)
  {
    c++;
    if(i.size() <= min_size)
    {
        min_size = i.size();
        fc= c;
    }
      
  }
  return fc;
}

int main()
{
  int n, m, a, b;
  vector<pair<int, int>> k;
  cin >> n >> m;
  for(int i = 0; i < m; i++)
  {  
    cin >> a >> b;
    k.push_back(make_pair(a, b));
  }
  cout << findWeakestFamily(k) << endl;
}