#include<iostream>
int main()
{
int first=0, second=1, i, n, sum=0,total=0;
//printf("Enter the number of terms: ");
//scanf("%d",&n);
std::cin>>n;
//accepting the terms
//printf("Fibonacci Series:");
for(i=0 ; i<n ; i++)
{
if(i <= 1)
{
sum=i;
}
//to print 0 and 1
else
{
sum=first + second;
first=second;
second=sum;

//to calculate the remaining terms.
//value of first and second changes as new term is printed.
}
//total=total+sum;
//printf("%d",sum);
}
//printf("%d",sum);
std::cout<<sum;
return 0;
}
