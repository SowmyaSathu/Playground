#include<iostream>
int main()
{
    int x;
    std::cin>>x;
  std::cout<<"Rs.";
    if(x<=200)
    std::cout<<int(x*0.5);
    else if(x>200 && x<=400)
    std::cout<<int((x*0.65)+100);
    else if(x>400 && x<=600)
    std::cout<<int((x*0.80)+200);
    else if(x>600)
    std::cout<<int((x*1.25)+425);
}