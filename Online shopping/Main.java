#include<iostream>
using namespace std;
int main()
{
    float fa,fd,fs,sa,sd,ss,aa,ad,as;
    std::cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
    fd=fd/100;
    //std:cout<<fd;
    sd=sd/100;
    ad=ad/100;
    //<<sa<<sd<<ss<<aa<<ad<<as;
    int fp=(fa-(fd*fa))+fs;
    std::cout<<"In Flipkart Rs."<<fp;
    int sp=(sa-(sd*sa))+ss;
    std::cout<<"\nIn Snapdeal Rs."<<sp;
    int ap=(aa-(ad*aa))+as;
    std::cout<<"\nIn Amazon Rs."<<ap;
    std::cout<<"\n";
    if(fp<=sp && fp<=ap)
    std::cout<<"He will prefer Flipkart";
    if(sp<fp && sp<=ap)
    std::cout<<"He will prefer Snapdeal";
    if(ap<fp && ap<sp)
    std::cout<<"He will prefer Amazon";
}




