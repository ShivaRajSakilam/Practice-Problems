//Using functions with arguments and return type
#include<stdio.h>
int add(int,int);
int main()
{
    int s,a,b;
    printf("Enter two numbers:\n");
    scanf("%d %d\n",&a,&b);
    s=add(a,b);
    printf("Sum of given numbers is: %d\n",s);
    return 0;
}
int add(int x, int y)
{
    int sum;
    sum=x+y;
    return sum;
}