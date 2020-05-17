#include<iostream>
int main()
{
  int num,i=0;
  std::cin>>num;
  do
  {
    i=i+1;
    num=num/10;
    //std::cout<<num;
    //i=i+1;
   }while(num!=0);
  std::cout<<i;
}