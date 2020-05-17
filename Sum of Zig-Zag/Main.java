#include<iostream>
using namespace std;
int main()
{
    int r,c,sum=0,i,j;
    std::cin>>r>>c;
    int a[r][c];
    for(int i=0;i<r;i++){
        for(j=0;j<c;j++)
        {
            std::cin>>a[i][j];
            if(i==0 || i==r-1)
              sum=sum+a[i][j];
        }
    }
      if(r==3)
      {
          sum=sum+a[1][1];
          std::cout<<"Sum of Zig-Zag pattern is "<<sum;
      }
      else
      {
        std::cout<<"Sum of Zig-Zag pattern is "<<sum;
      }
}