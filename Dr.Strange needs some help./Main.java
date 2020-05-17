#include<iostream>
using namespace std;
int main()
{
  int m,n,req,res=1,i;
  std::cin>>m>>n>>req;
  for(i=1;i<=n;i++)
  {
    res=res*m;
  }
  //cout<<res;
  if(res >= req)
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}
    