#include<iostream>
using namespace std;
int main()
{
    int m,n,i,j;
    std::cin>>m>>n;
    int a[m][n];
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            std::cin>>a[i][j];
        }
    }
    int max=0;
     for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            if(max<a[i][j])
                max=a[i][j];
        }       
    }
    std::cout<<"The maximum element is "<<max;
    
}