/*To find maximum and minimum among two numbers*/

#include<iostream>
using namespace std;
int main()
{
    int a,b;
    cout<<"enter two numbers"<<endl;
    cin>>a>>b;
    if(a>b){
        cout<<"Maximum number is "<<a<<endl;
        cout<<"minimum number is "<<b<<endl;

    }
    else{
        cout<<"Maximum number is "<<b<<endl;
        cout<<"minimum number is "<<a<<endl;
 }
 return 0;
}