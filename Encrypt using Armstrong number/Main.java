#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
   int res=n,sum=0;
  int count=0,rem;
  while(res>0)
  {
    count++;
    res=res/10;
  }
  res=n;
  while(res>0)
  {
     rem=res%10;
    sum=sum+power(rem,count);
    res=res/10;
}
 // std::cout<<sum;
  if(n==sum)
    return 1;
  else 
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}