#include<iostream>
using namespace std;
int main()
{
    int num,rem,even=0,odd=0,i;
    std::cin>>num;
    while(num>0)
    {
        rem=num%10;
        if(rem%2==0)
        {
            even=even+rem;
        }
        else
        {
            odd=odd+rem;
        }
        num=num/10;
    }
    if(odd==even)
     std::cout<<"Yes";
    else
     std::cout<<"No";
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
