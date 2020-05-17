
#include <iostream>
using namespace std;

int main()
{
    int wt,nofa,nofc;
    cin>>wt>>nofa>>nofc;
    int total=(nofa*75)+(nofc*35);
    if(wt>total)
    std::cout<<"Boat is stable";
    else
    std::cout<<"Boat will drow";
    

    return 0;
}
