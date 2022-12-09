//Using functions with arguments and no return type
#include<stdio.h>
void add(int,int);
int main()
{
    int a,b;
    printf("Enter two numbers:\n");
    scanf("%d %d \n",&a,&b);
    add(a,b);
    return 0;
}
void add(int a, int b)
{
    int sum;
    sum=a+b;
    printf("Sum of given numbers is: %d \n",sum);
    return;
}