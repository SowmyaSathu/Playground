#include<iostream>
int main()
{
  int num1,num2,sum=0,i;
  std::cin>>num1>>num2;
  int act=num1+num2;
  //std::cout<<num1<<num2;
  int test=act;
  for(i=1;i<=act/2;i++)
  {
    if(act%i==0)
    {
      sum=sum+i;
    }
  }
  if(sum==test)
    std::cout<<"They can read the message";
  else
  {
    //std::cout<<"sonu";
    std::cout<<"They can't read the message";
  }
}
    