/*program to find factorial of number*/
#include<stdio.h>
int main()
{
	int n,fact=1,i;
	printf("enter the number for factorial\n");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	printf("The factorial of given number is %d\n",fact);
	printf("\t Thank You and Happy Programming\n");
	return 0;
}