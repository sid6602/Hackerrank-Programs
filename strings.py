# Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as  
# space-separated strings on a single line (see the Sample below for more detail).
# Note:  is considered to be an even index.
# Example abcdef
# Print abc def


#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int A; 
    cin>>A;
    
    // cin>>S[T];
    for(int i=0; i<A; i++)
    {
        string S;
        cin>>S;
    
    for(int j=0; j<S.length(); j++)
    {
      if(j%2 == 0)
        {
            cout<< S[j];
        }  
    }
    cout<<" ";
    for(int j=0; j<S.length(); j++)
    {
      if(j%2 != 0)
        {
            cout<<S[j];
        } 
    }
    cout<<endl;
    }
    return 0;
}
