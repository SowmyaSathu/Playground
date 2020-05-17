#include<iostream>
#include <bits/stdc++.h> 
int main()
{
  int size,max,i;
  std::cin>>size;
  int arr[size];
  for( i=0;i<size;i++)
  {
    std::cin>>arr[i];
  }
   max = arr[0];
    for (i = 0; i < size; i++)
    {
        if (max < arr[i])
            max = arr[i];
    }
  std::cout<<max;
}