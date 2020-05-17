#include<iostream>
using namespace std;
int main()
{
    int n,po,res=1;
    int i;
  std::cout<<"Enter the value of a\n";
    std::cin>>n;
  std::cout<<"Enter the value of n";
  std::cin>>po;
    for(i=1;i<=po;i++)
    {
        res=res*n;
        
    }
    std::cout<<"\nThe value of "<<n <<" power "<<po<<" is "<<res;
}