//Call by Value-swapping two numbers
#include<stdio.h>
void swap(int,int);
int main()
{
    int a,b;
    printf("Enter two numbers to swap:\n");
    scanf("%d %d",&a,&b);
    swap(a,b);
    printf("values of actual variables after swap a=%d, b=%d\n",a,b);
    return 0;
}
void swap(int a, int b)
{
    int temp;
    temp=a;
    a=b;
    b=temp; 
    printf("After swapping a is: %d \n",a);
    printf("After swapping b is: %d \n",b);
    printf("values of formal variables after swap a=%d, b=%d\n",a,b);
    return;
}