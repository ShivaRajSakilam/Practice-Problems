/* program to add only positive numbers */

#include<iostream>
using namespace std;
int main()
{
    int n,sum;
    sum=0;
    cout<<"enter a number"<<endl;
    cin>>n;
    while(n>=0){
        sum+=n;
        cout<<"enter a number"<<endl;
        cin>>n;

    }
    cout<<"the sum is "<<sum<<endl;
return 0;
}