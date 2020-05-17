#include <iostream>
using namespace std;

int main()
{
  int a,b,ch;
  cout<<"Enter first number : ";
  cin>>a;
  cout<<"Enter second number : ";
  cout<<"Menu";
  std::cin>>b;
  std::cout<<"\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
// std::cout<<"Enter first number :";
 std::cin>>ch;
  switch(ch)
  {
    case 1:std::cout<<a+b;
      std::cout<<"\n";
      break;
     case 2:std::cout<<a-b;
      break;
     case 3:std::cout<<a*b;
      break;
      case 4:std::cout<<a/b;
      break;
      case 5:std::cout<<a%b;
      break;
    default:
      std::cout<<"Invalid operation";
      break;
  }
}