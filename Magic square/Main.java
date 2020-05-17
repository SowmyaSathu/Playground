#include <bits/stdc++.h> 
using namespace std; 
int main() 
{ 
    int n,i,j,count=0;
    std::cin>>n;
    int mat[n][n];
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            std::cin>>mat[i][j];
        }
    }
      
    int sum = 0,sum2=0;  
    for (int i = 0; i < n; i++) 
    {
        sum = sum + mat[i][i]; 
    }
    for (int i = 0; i < n; i++) 
    {
        sum2 = sum2 + mat[i][n-1-i]; 
    }
  
    if(sum!=sum2)  
    {
        count=1;
        
    }
    int rowSum=0;
    for (i = 0; i < n; i++) { 
          
         rowSum = 0;      
        for (j = 0; j < n; j++) 
            rowSum += mat[i][j]; 
          
        if (rowSum != sum) 
           {
               count=1;
               break;
           }
    } 
  
   
    for (int i = 0; i < n; i++) { 
          
        int colSum = 0;      
        for (int j = 0; j < n; j++) 
            colSum += mat[j][i]; 
  
        if (sum != colSum)  
        {
            count=1;
            break;
        }
    } 
  if(count==1)
   std::cout<<"No";
  else
   std::cout<<"Yes";
    
      
    return 0; 
} 
