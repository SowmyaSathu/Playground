#include<iostream>
#include<cstdlib>
int main(){
  int n,*p,i,even=0;
  std::cin>>n;
  p=(int *)malloc(n*sizeof(int));
  for(i=0;i<n;i++)
  {
    std::cin>>*(p+i);
  }
for(i=0;i<n;i++)
{
  if(*(p+i)%2==0)
  {
    even++;
  }
}
  std::cout<<n-even;
  std::cout<<"\n"<<even;
  return 0;
}