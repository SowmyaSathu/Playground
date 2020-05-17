#include<iostream>
int main()
{
int n1,n2,n3,gcd=0,small=0,res;
  std::cin>>n1>>n2>>n3>>res;
small=n1<n2?(n1<n3?n1:n3):(n2<n3?n2:n3);
  while(small>0)
  {
  if(n1%small==0 && n2%small==0 && n3%small==0)
  {
    break;
  }
  else
  {
    small--;
  }
  }
  if(small==res)
    std::cout<<"Answer is correct.";
  else
    std::cout<<"Answer is wrong.";
    

}