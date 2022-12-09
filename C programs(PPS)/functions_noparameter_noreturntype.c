//Using functions with no parameters and no return type
#include<stdio.h>
void add(void);
int main()
{
    add();
    return 0;
}

void add(void)
{
    printf("Enter Two Numbers:\n");
    int a,b,sum;
    scanf("%d %d \n",&a,&b);
    sum=a+b;
    printf("the sum of two numbers is %d \n",sum);
    return;
}