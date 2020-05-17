#include<iostream>
int main()
{
    int n,res=11,i;
    std::cin>>n;
    for(i=1;i<=n;i++)
    {
        std::cout<<res*res<<" ";
        res=res+4;
    }
}
