#include<iostream>
int main()
{
  int size,res,i,count=0;
  std::cin>>size;
  int arr[size];
  for(int i=0;i<size;i++)
    std::cin>>arr[i];
  std::cin>>res;
  for(i=0;i<size;i++)
  {
    if(arr[i]==res)
    {
      count=1;
      break;
    }
  
  }
  if(count==1)
    std::cout<<"She passed her exam";
  else
    std::cout<<"She failed";
}