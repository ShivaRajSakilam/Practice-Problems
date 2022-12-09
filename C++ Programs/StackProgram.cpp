//stack ADT and basic functions 
#define SIZE 50
#include<iostream>
using namespace std;
#include<string>
//stack ADT
class stack
{
    private://data members
    int a[SIZE],tos;
    public://member functions
    stack();//constructor
    //declaring functions
    void push(int a);
    void pop();
    void show();
};
//constructor
stack::stack()//no written type for constructor
{
    tos=0;
}
//defining functions
//push() function
void stack::push(int y)
{
    if(tos==SIZE-1)
    cout<<"stack is full"<<endl;
    else
    {
        a[tos]=y;
        tos++;
    }
}
//pop() function
void stack::pop()
{
    if(tos==0)
    cout<<"stack is empty"<<endl;
    else
    tos--;
    
}
//show() function
void stack::show()
{
    if(tos==0)
    cout<<"stack is empty"<<endl;
    else
    {
    cout<<"the elements of the stack are:"<<endl;;
    for(int i=0;i<tos;i++)
    cout<<a[i]<<endl;;
    }
}
int main()
{
    stack s1;
    int x,b;
    do
    {
        cout<<"press following keys to perform respective operations"<<endl;
        cout<<"1:To enter an element"<<endl;
        cout<<"2:To delete an element"<<endl;
        cout<<"3:To display the elements of the stack"<<endl;
        cout<<"4:To exit the program"<<endl;
        cin>>x;
        switch (x)
        {
        case 1:
        cout<<"enter the element"<<endl;
        cin>>b;
        s1.push(b);
            break;
        case 2:
        s1.pop();
            break;
        case 3:
        s1.show();
            break;
        }
    } while (x!=4);
    return 0;
}