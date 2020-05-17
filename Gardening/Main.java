#include <iostream>

int main()
{
    int rows,cols,num;
    std::cin>>rows>>cols>>num;
  int product=rows*cols;
  int sl=cols;
  int el2=product-cols;
  int el1=el2-cols;
  if(num>=sl && num<=sl+cols)
    std::cout<<"It is a mango tree";
  else if(num>=el1 && num<=el2)
    std::cout<<"It is a mango tree";
  else
    std::cout<<"It is not a mango tree";
}