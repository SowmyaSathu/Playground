#include<iostream>
using namespace std;
int main()
{
    int n1,n2,small=0;
    std::cin>>n1>>n2;
    small=(n1<n2)?n1:n2;
    while(small>0)
    {
        if(n1%small==0 && n2%small==0)
        {
            break;
        }
        else
        {
            small--;
        }
    }
    std::cout <<"G.C.D of "<<n1<<" and "<<n2<<" = "<<small;
}