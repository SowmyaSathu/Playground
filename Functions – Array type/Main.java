#include<iostream>
using namespace std;
int main()
{
    int n;
    std::cout<<"Enter the number of elements in the array\n";
    std::cin>>n;
    int a[n],i,even=0,odd=0;
    std::cout<<"Enter the elements in the array\n";
    for(i=0;i<n;i++)
    {
        std::cin>>a[i];
        if(a[i]%2==0)
          even++;
        else
         odd++;
    }
    if(even>0 && odd==0)
     std::cout<<"The array is Even";
    else if(odd>0 &&even==0)
     std::cout<<"The array is Odd";
    else if(even>0 && odd>0)
    std::cout<<"The array is Mixed";
}