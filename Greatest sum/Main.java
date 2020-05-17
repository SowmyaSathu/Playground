#include<iostream>
using namespace std;
int main()
{
    int r,c,i,j,sumr=0,sumc=0,row=0,col=0,n;
    std::cin>>r>>c;
    int a[r][c];
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            std::cin>>a[i][j];
        }
    }
    std::cout<<"Sum of rows is ";
     for(i=0;i<r;i++,sumr=0)
    {
        for(j=0;j<c;j++)
        {
            sumr=sumr+a[i][j];
        }       
    
    std::cout<<sumr<<" ";
    if(row<sumr)
    {
        row=sumr;n=i+1;
    }
    }
    std::cout<<"\nRow "<<n<<" has maximum sum";
    std::cout<<"\nSum of columns is ";
    for(i=0;i<c;i++,sumc=0)
    {
        for(j=0;j<r;j++)
        {
            sumc=sumc+a[j][i];
        }
        std::cout<<sumc<<" ";
        if(col<sumc)
        {
            col=sumc;n=i+1;
        }
    }
    std::cout<<"\nColumn "<<n<<" has maximum sum";

}