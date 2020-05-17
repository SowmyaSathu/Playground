#include<iostream>
int main()
{
    int a,b,c,d;
    std::cin>>a>>b>>c>>d;
    int dollar=a+c;
    
    int sum=b+d;
    if(sum>100)
    {
        sum=sum-100;
      dollar=dollar+1;
        
    }
  std::cout<<dollar;
    std::cout<<"\n";
    std::cout<<sum;
}