#include<iostream>
using namespace std;
int main()
{
    int row,col,i,j;
    std::cin>>row>>col;
    int a[row][col];
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            std::cin>>a[i][j];
            
        }
    }
    for(i=0;i<col;i++)
    { 
        int  max=0;
        for(j=0;j<row;j++)
        {
            if(a[j][i]>max)
              max=a[j][i];
            
        }
        std::cout<<max<<"\n";
    }
    
    
}