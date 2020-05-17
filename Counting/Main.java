#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char a[500];
  gets(a);
  int i,l=strlen(a);
  int v=0,c=0,w=0,d=0,s=0;
  for(i=0;i<l;i++)
  {
    if(a[i]=='a' ||a[i]=='e' ||a[i]=='i' ||a[i]=='o' ||a[i]=='u' || a[i]=='A' ||a[i]=='E' ||a[i]=='I'||a[i]=='O' ||a[i]=='U')
       v++;
    else if(a[i]==' ')
      w++;
    else if(a[i]>=48 && a[i]<=57)
      d++;
    else if(a[i]>=65 && a[i]<=90 || a[i]>=97 && a[i]<=122)
      c++;
    else
      s++;
  }
  std::cout<<"Vowels:"<<v<<"\nConsonants:"<<c<<"\nWhite Spaces:"<<w<<"\nDigits:"<<d<<"\nSymbols:"<<s;
}