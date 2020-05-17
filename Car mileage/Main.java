#include<iostream>
using namespace std;
int main()
{
  float mileage;
  int petrol,distance;
  std::cin>>mileage>>petrol>>distance;
  float val=mileage*petrol;
  if(val>distance)
    std::cout<<"Can reach";
  else
     std::cout<<"Cannot reach";
}