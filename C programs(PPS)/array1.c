/*Array Program to print marks of 5 students*/

#include<stdio.h>
int main()
{
    int marks[5]={10,20,30,40,50};
    for(int i=0;i<=4;i++)
    {
        printf("marks of marks[%d]:%d\n",i,marks[i]);
    }
    return 0;
}