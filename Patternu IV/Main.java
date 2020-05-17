#include<iostream>
using namespace std;

int main()
 {
int i,j,n;
//printf("no. of rows\n");
std::cin>>n;
for(i=1;i<=n;i++)
{
    if(i%2==0)
    {
       std::cout<<i+1;
    }
    for(j=1;j<=n-1;j++)
    {
        std::cout<<i;
    }
    if(i%2!=0)
    {
       std::cout<<i+1;
    }
        printf("\n");
    }
    
    return 0;
    
}