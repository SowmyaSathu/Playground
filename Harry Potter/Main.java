#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char s[100];
  cin>>s;
  int l=strlen(s);
  int a=s[0]-'0';
  int b=s[l-1]-'0';
  cout<<a+b;
}