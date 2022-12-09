/*program to find minimum of number*/
#include<stdio.h>
int main()
{
	int a[10],i,min,n;
	printf("enter number of elements in array\n");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	scanf("%d",&a[i]);
	min=a[0];
	for(i=1;i<n;i++)
	{
		if(min>a[i])
		{
				min=a[i];
		}
	}	
printf("minimum number is %d",min);
	 return 0;
}