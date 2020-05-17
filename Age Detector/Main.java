#include<iostream>
using namespace std;
int main(){
  signed int current, birth, a;
  //printf("Enter Year of Birth\n");
  cin>>birth;
  //printf("Enter Current year\n");
  cin>>current;
  if(current<birth)
  {
    birth=100-birth;
    a=birth+current;
    cout<<a;
  }
  else
  {
  cout<<current-birth;
  }
  return 0;
}

