#include<iostream>
int main()
{
    int num, sum=0, count, n;
  std::cin>>num;
    
    for(count=0;sum<num;count++)
    {
        scanf("%d", &n);
        sum=sum+n; 
    }
   std::cout<<"The number of turns is "<<count;
    return 0;
}
