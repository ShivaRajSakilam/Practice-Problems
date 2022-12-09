/*program to find maximim among three numbers*/

#include<iostream>
using namespace std;
int main()
{
    int a,b,c;
    cout<<"Enter three numbers to find maximum among them: "<<endl;
    cin>>a>>b>>c;
    if(a>b){
        if(a>c){
            cout<<"the maximum number is : "<<a<<endl;
        }
        else{
            cout<<"the maximum number is : "<<c<<endl;
        }
        }
    
    else{
        if(b>c){
            cout<<"the maximum number is : "<<b<<endl;
        }
        else{
            cout<<"the maximum number is : "<<c<<endl;
        }
    }
return 0;
}
