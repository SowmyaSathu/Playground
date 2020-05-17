#include <iostream>
int main() 
{
	// Type your code here
  int num,rem,sum=0;
  std::cin>>num;
  while(num>0)
  {
    rem=num%10;
    sum=sum*10+rem;
    num=num/10;
   }
  std::cout<<sum;
}