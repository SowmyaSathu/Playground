#include<iostream>
int main()
{
    int a;
    float b,c=10.15,d=18.00,e=22.00;
    std::cin>>a>>b;
    if(a<=13)
    {
       if(b==c||b==d ||b==e)
        std::cout<<"$4.00";
        else
        std::cout<<"$2.00";
    }
    if(a>13)
    {
        if(b==c||b==d ||b==e)
        std::cout<<"$8.00";
        else
        std::cout<<"$5.00";
    }
}
