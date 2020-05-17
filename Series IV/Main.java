#include<iostream>
int main()
{
    int res=0,n,i;
    std::cin>>n;
    for(i=1;i<=n;i++)
    {
        if(i%2==0)
        {
            res=i*i-2;
            std::cout<<res<<" ";
        }
        else
        {
            res=i*i-1;
            std::cout<<res<<" ";
        }
    }
}