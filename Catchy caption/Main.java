#include <cstring>
#include <iostream>
int main()
{
   char s[5000];
  gets(s);
  int i;
  int word=0;
  for(i=0;i<strlen(s);i++)
  {
    if(s[i]==' ')
       word++;
}
  //std::cout<<word<<"\n";
       if(word<=10)
       std::cout<<"Caption eligible for the contest";
       else
       std::cout<<"Caption not eligible for the contest";
       }