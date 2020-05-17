#include <algorithm> 
#include<iostream>
#include<string>
using namespace std; 
int main() 
{ 
    std::string str;
    std::getline(std::cin,str);
  for(std::string::reverse_iterator i=str.rbegin();i<str.rend();i++)
  {
    std::cout<<*i;
   
}
   return 0;
}
