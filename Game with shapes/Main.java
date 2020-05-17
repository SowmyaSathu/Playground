#include<iostream>
int main()
{
    int radius,length;
    std::cin>>radius>>length;
  //float c=radius*3.14*radius;
  float d=2*radius;
   float s=length*length;
    if(d!=length)
    std::cout<<"circle cannot be inside a square";
    else
    std::cout<<"circle can be inside a square";
    
}