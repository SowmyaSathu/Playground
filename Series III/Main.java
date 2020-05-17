#include<iostream>
int main()
{
    int n,res=6,i;
    std::cin>>n;
    for(int i=1;i<=n;i++)
    {
       std::cout<<res<<" ";
       res=res+i*5;
    }
}