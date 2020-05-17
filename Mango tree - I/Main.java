#include<iostream>
int main()
{
  int row,col,num;
  std::cin>>row>>col>>num;
  row=row-1;
  if(num<=col)
    std::cout<<"Yes";
  else if(num<=col+2*row)
    std::cout<<"Yes";
  else
    std::cout<<"No";
}
    