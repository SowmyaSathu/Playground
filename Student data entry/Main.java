#include <iostream>

using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  student x;
   std::cin.get(x.name,100);
  std::cin>>x.roll;
  std::cin>>x.marks;
  std::cout<<"\nStudent Details\n";
  std::cout<<"Name: "<<x.name;
  std::cout<<"\nRoll: "<<x.roll;
  std::cout<<"\nMarks: "<<x.marks;
}