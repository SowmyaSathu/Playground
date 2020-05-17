#include<iostream>
using namespace std;
int main()
{
    int row,col,i,j;
    std::cin>>row>>col;
    int a[row][col],b[row][col],sum[row][col];
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            std::cin>>a[i][j];
        }
    }
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            std::cin>>b[i][j];
        }
    }
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            sum[i][j]=a[i][j]+b[i][j];
        }
    }
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            std::cout<<sum[i][j]<<" ";
        }
      std::cout<<"\n";
    }
}