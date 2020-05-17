#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
  char a[100],b[100],c[100];
  gets(a);
  gets(b);
  int co=0;
  for(int i =strlen(a)-1;i>=0;i--)
  {
    c[co]=a[i];
    co++;
}
  c[co]='\0';
  if(strcmp(c,b)==0)
    std::cout<<"It is correct";
  else
    std::cout<<"It is wrong";
}