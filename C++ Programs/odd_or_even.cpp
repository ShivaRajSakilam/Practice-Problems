/*program to check if a number is even or odd*/

#include<iostream>
using namespace std;

int main()
{
    int n;
    cout<<"enter a number to check whether it is odd or even: ";
    cin>>n;
    if(n%2==0){
        cout<<"the entered number is even"<<endl;
    }

    else
    cout<<"the entered is odd"<<endl;

return 0;
}