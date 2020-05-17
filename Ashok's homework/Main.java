#include<iostream>
int main()
{
    int row,col,i,j;
  std::cin>>row>>col;
  int a[row][col],b[row][col],c[row][col];
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
      c[i][j]=a[i][j]+b[i][j];
    }
  }
  for(i=0;i<row;i++,std::cout<<"\n")
  {
    for(j=0;j<col;j++)
    {
      std::cout<<c[i][j]<<" ";
    }
  }
}