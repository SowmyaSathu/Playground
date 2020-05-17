#include<iostream>
using namespace std;
int fun(int n)
{
    int sum=0,rem;
    while(n>0)
    {
        rem=n%10;
        sum=sum+rem;
        n=n/10;
    }
    return sum;
}
int main()
{
    int num;
    std::cin>>num;
    int res=fun(num);
    int res1=fun(res);
    std::cout<<res1;
}