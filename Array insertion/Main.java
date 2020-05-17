#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cout<<"Enter the number of elements in the array\n";
  std::cin>>n;
  int a[n],i,e=0,o=0;
  std::cout<<"Enter the elements in the array\n";
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  int pos,val;
  std::cout<<"Enter the location where you wish to insert an element\n";
  std::cin>>pos;
  if(pos>n)
    std::cout<<"Invalid Input\n";
  else
  {
    std::cout<<"Enter the value to insert\n";
    std::cin>>val;
    std::cout<<"Array after insertion is\n";
    for(i=n;i>pos-1;i--)
      a[i]=a[i-1];
    a[pos-1]=val;
    for(i=0;i<=n;i++)
      std::cout<<a[i]<<"\n";
  }
}