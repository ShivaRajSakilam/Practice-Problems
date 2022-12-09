//To show multiplication table of a given number

#include<iostream>
using namespace std;
int main()
{
    int n,i;
    i=1;
    cout<<"enter a number to show its multiplication table"<<endl;
    cin>>n;
    cout<<"the multiplication table :"<<endl;
    do{
        cout<<i*n<<endl;
        i++;
    }
    while(i<=10);
return 0;
    

}