#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y;
  std::cin>>x>>y;
  if(x==2)
    std::cout<<y+(y*0.5);
  else if(x==3)
    std::cout<<(y*2);
  else if(x>3)
    std::cout<<"Number of items is more";
  
}