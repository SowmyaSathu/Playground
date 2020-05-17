#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char a[100];
  gets(a);
  int i;
  int l=strlen(a);
  for(i=0;i<l;i++)
  {
    if((int)(a[i])>=97 && (int)(a[i])<=122)
      std::cout<<a[i];
    else if((int)(a[i])>=65 && (int)(a[i])<=90)
      std::cout<<a[i];
}
}