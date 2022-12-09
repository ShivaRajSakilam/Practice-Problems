//factorial using recursion

#include<stdio.h>
long fact(long);    //function declaration
int main()
{
    long n;
    printf("Enter the number:\n");
    scanf("%ld",&n);
    printf("the factorial of given number %ld is %ld\n",n,fact(n)); //function calling
    return 0;
}
// function definition 
long fact(long n)   //base case
{
    if(n==0||n==1)
    return 1;
    else
    return n*fact(n-1);

}