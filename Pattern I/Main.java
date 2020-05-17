#include<iostream>
int main()
{
    int n,i,j;
    std::cin>>n;
    int res=n;
   for(i=1;i<=4;i++,std::cout<<"\n")
    {
       
        for(j=1;j<=i;j++)
        {
            std::cout<<res;
            
        }
         res=res+1;
    }
    res=res-1;
    for(i=4;i>=1;i--,std::cout<<"\n")
    {
       
        for(j=1;j<=i;j++)
        {
            std::cout<<res;
            
        }
         res=res-1;
    }
}

