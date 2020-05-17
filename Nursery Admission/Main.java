#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char name[100];
  gets(name);
  std::cout<<"The number of letters in the name is "<<strlen(name);
}