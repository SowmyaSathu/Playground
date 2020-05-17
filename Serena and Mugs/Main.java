#include<iostream>
#include <bits/stdc++.h>
using namespace std;
int printresult(int *p,int mugs[],int c)
{
  int t=0;
  int n=*p;
  int count=0;
for(int i=0;i<n-1;i++)

{
t=t+mugs[i];
if(t<c)
{
continue;
}
else
{
std::cout<<"NO";
count=1;
break;
}
}
if(count==0)
{
 std::cout<<"YES";
}

}

int main()
{
int n,c;
std::cin>>n>>c;
int mugs[n];
int *p;
p=&n;
for(int i=0;i<n;i++)
{
std::cin>>mugs[i];
}
printresult(p,mugs,c);
//sort(mugs,mugs+n,greater<int>());
}