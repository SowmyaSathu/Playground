#include<iostream>
#include<cstring>
using namespace std;
//using namespace std;

int main()
{
  char str[100],str1[100];
  gets(str);
  gets(str1);
  if(strcmp(str,str1)==0)
    std::cout<<"It is correct";
  else
    std::cout<<"It is wrong";
}