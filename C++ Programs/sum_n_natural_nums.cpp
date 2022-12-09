//To find sum of n natural numbers
#include<iostream>
using namespace std;
int main()
{
    int sum,i,n;
    cout<<"enter a number"<<endl;
    cin>>n;
    sum=0;
    for(i=1;i<=n;i++){
        sum=sum+i;  
    }
    cout<<sum<<endl;
    
return 0;
}