#include<iostream>
int main()
{
    int n,i;
    float res=0.5;
    std::cin>>n;
    for(i=1;i<=n;i++)
    {
        std::cout<<res<<" ";
        res=res*3;
    }
}