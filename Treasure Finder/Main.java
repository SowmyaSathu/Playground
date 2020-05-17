#include<iostream>
int main()
{
    int a,b,c;
    std::cin>>a>>b>>c;
    if(a >= b && a >= c)
    {
        if(b >= c)
        {
            /*
                .2lf restricts the number till 
                2 decimal places
            */
            std::cout<<"The treasure is in box which has number "<<b;
        }
        else
        {
            std::cout<<"The treasure is in box which has number "<<c;
        }
    }
    else if(b >= a && b >= c)
    {
        if(a >= c)
        {
            std::cout<<"The treasure is in box which has number "<<a;
        }
        else
        {
            std::cout<<"The treasure is in box which has number "<<c;
        }
    }

    // c is the largest number of the three
    else if(a >= b)
    {
        std::cout<<"The treasure is in box which has number "<<a;
    }
    else
    {
        std::cout<<"The treasure is in box which has number "<<b;
    }

    //printf("\n\n\t\t\tCoding is Fun !\n\n\n");
if(b%a==0 && c%a==0)
 std::cout<<"\nThe code to open the box is "<<a;
else if(a%b==0 && c%b==0)
 std::cout<<"\nThe code to open the box is "<<b;
else if(a%c==0 && b%c==0)
 std::cout<<"\nThe code to open the box is "<<c;
  else
    std::cout<<"\nThe code to open the box is 1";
 return 0;
}

