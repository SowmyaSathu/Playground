#include<iostream>
void print(int res)
{
    if(res%2==0)
       std::cout<<"Mani Iyer";
    else
       std::cout<<"Arun Gupta";
}
int main()
{
    int n,m;
    std::cin>>n>>m;
    int res=n+m;
    print(res);
    return 0;
}




