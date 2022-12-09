// To check if a triangle is equilateral, scalene or isosceles

#include<iostream>
using namespace std;
int main()
{
    int a,b,c;
    cout<<"Enter the lengths of three sides of a triangle: "<<endl;
    cin>>a>>b>>c;
    if(a==b&&b==c){
        cout<<"Triangle is Equilateral "<<endl;
    }
    else if(a==b||b==c){
        cout<<"Triangle is Isosceles"<<endl;
    }
    else{
        cout<<"the Triangle is Scalene"<<endl;
    }
return 0;
}